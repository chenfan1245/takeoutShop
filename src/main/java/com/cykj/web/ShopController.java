package com.cykj.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cykj.bean.*;
import com.cykj.service.CommentService;
import com.cykj.service.OrderService;
import com.cykj.service.ShopService;
import com.cykj.utils.IDCardOCR;
import com.cykj.utils.ImageToBase64ByUrl;
import com.cykj.utils.JWTUtils;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.ocr.v20181119.OcrClient;
import com.tencentcloudapi.ocr.v20181119.models.IDCardOCRRequest;
import com.tencentcloudapi.ocr.v20181119.models.IDCardOCRResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/shop")
//@Api(value = "接口说明",tags = "接口说明")
public class ShopController {
    @Autowired
    private ShopService shopService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private CommentService commentService;
        //商家登录
    @RequestMapping("/shopLogin")
    public String ShopLogin( String shoptel,String shoppwd ){
        System.out.println(shoptel);
        System.out.println(shoppwd);
        Tblshop tblshop=shopService.getShopInfo(shoptel);
        Map<String,Object>map=new HashMap<>();
        Map<String,Object>map1=new HashMap<>();
        map1.put("token",tblshop);
        map.put("code",20000);
        map.put("data",map1);
        map.put("message","成功");
        map.put("success",true);
        String json=JSON.toJSONString(map);
        boolean shopLogin=shopService.ShopLogin(shoptel,shoppwd);
        if(shopLogin){
            return json;
        }else {
            return "0";
        }
    }
    //获取商家信息
    @RequestMapping("/getShopInfo")
    public String getShopInfo(String shoptel){
        Tblshop tblshop=shopService.getShopInfo(shoptel);
        Map<String,Object>map=new HashMap<>();
        Map<String,Object>map1=new HashMap<>();
        Map<String,Object>map2=new HashMap<>();
        String avatar="https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";
        String name=tblshop.getShopname();
        Tblrole tblrole=shopService.getRole(tblshop.getRoleid());
        String role[]={tblrole.getRolename()};
        String buttons[]={};
        String routes[]={"shoporder","goods","home","statistics","comment"};
        map1.put("routes",routes);
        map1.put("avatar",avatar);
        map1.put("buttons",buttons);
        map1.put("name",name);
//        map1.put("info",info);
        map1.put("role",role);
        map.put("code",20000);
        map.put("data",map1);
        String json =JSON.toJSONString(map);
        if(tblshop!=null){
            return json;
        }else{
            return "0";
        }
    }
    //获取商家订单
    @RequestMapping("/searchShopOrder")
    public Map<String,Object> searchShopOrder(long shopid,String orderstate,String paystate){
        System.out.println(shopid);
        System.out.println(orderstate);
        System.out.println(paystate);
        Map<String,Object> map =new HashMap();
       List<Tblallshoporder>list= shopService.searchShopOrder(shopid,orderstate,paystate);
       String json= JSON.toJSONString(list);
        System.out.println(json);
        map.put("code",20000);
        map.put("order",json);
       return map;
    }
    //获取订单商品信息
    @RequestMapping("/searchOrderGoods")
    public Map<String,Object> searchOrderGoods(long orderid,long redpacketid){
        System.out.println(orderid);
        Map<String,Object> map =new HashMap();
        List<Tblallshoporder>list= shopService.searchOrderGoodsInfo(orderid);
        List<Tblredpacket>redPacketInfolist=shopService.searchRedPacketInfo(redpacketid);
        String redPacketInfo=JSON.toJSONString(redPacketInfolist);
        String orderGoodsInfo= JSON.toJSONString(list);
        System.out.println(orderGoodsInfo);
        map.put("code",20000);
        map.put("goods",orderGoodsInfo);
        map.put("redpacket",redPacketInfo);
        return map;
    }
    //获取订单红包信息



    //商家对订单的操作
    @RequestMapping("/orderStateChange")
    public Map<String,Object> orderStateChange(long orderid,String orderstate){
        System.out.println(orderid);
        System.out.println(orderstate);
        Map<String,Object> map =new HashMap();
        boolean orderStateChange=shopService.orderStateChange(orderid,orderstate);
        if(orderStateChange && orderstate.equals("28")){
            map.put("code",20000);
            map.put("state","已接单,商家备货中");
        }else if(orderStateChange && orderstate.equals("30")) {
            map.put("code", 20000);
            map.put("state", "备货完成");
        }else if(orderStateChange && orderstate.equals("35")){
            map.put("code", 20000);
            map.put("state", "已拒绝订单");
        }else {
            map.put("code",20000);
            map.put("state","状态修改失败");
        }
        return map;
    }


    //解析身份证图片
    @RequestMapping("/getIdCardData")
    public Map<String,Object> getIdCardData(String photoUrl){
        System.out.println(photoUrl);
        String fileContent="";
        Map map =new HashMap();
        try{
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey,此处还需注意密钥对的保密
            // 密钥可前往https://console.cloud.tencent.com/cam/capi网站进行获取
            Credential cred = new Credential("AKIDwiFzSeZDbhW4MN7ZlgKhurXv2tTlmWzB", "wc190Zsuf9NK0PXOyHI3XjehTyC9oCJ9");
            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("ocr.tencentcloudapi.com");
            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            // 实例化要请求产品的client对象,clientProfile是可选的
            OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);
            // 实例化一个请求对象,每个接口都会对应一个request对象
            IDCardOCRRequest req = new IDCardOCRRequest();
            // 返回的resp是一个IDCardOCRResponse的实例，与请求对象对应
//            req.setImageUrl("http://localhost:9906/upload/jingqing.jpg");
            ImageToBase64ByUrl toBase64ByUrl=new ImageToBase64ByUrl();
//            req.setImageBase64(ImageToBase64ByUrl.ImageToBase64ByUrl("http://localhost:9906/upload/jingqing.jpg"));
            req.setImageBase64(ImageToBase64ByUrl.ImageToBase64ByUrl(photoUrl));
//            req.setImageBase64(ImageToBase64ByUrl.ImageToBase64ByUrl("http://localhost:9906/upload/jingqing2.jpg"));
            IDCardOCRResponse resp = client.IDCardOCR(req);
            // 输出json格式的字符串回包
//            System.out.println(IDCardOCRResponse.toJsonString(resp));
            fileContent=IDCardOCRResponse.toJsonString(resp);
            System.out.println(fileContent + "----------------116");
            map.put("fileContent",fileContent);
            map.put("code",20000);
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
        System.out.println(fileContent + "----------------117");
        return map;
    }
//图片上传
    @RequestMapping("/uploadPhoto")
    //允许跨域
    @CrossOrigin
    public Map<String,Object>uploadPhoto(MultipartFile file){
        //map用于返回路径数据
        Map<String,Object>map=new HashMap<>();
        try{
            String filePath="C:\\Users\\41585\\Pictures\\upload\\"+file.getOriginalFilename();

            //设置文件保存
            file.transferTo(new File(filePath));
            //需要放到数据库得路径
            String fileUrl="/upload/"+file.getOriginalFilename();
            map.put("fileUrl",fileUrl);

        }catch (IOException e){
            e.printStackTrace();
        }
        return map;
    }
    @RequestMapping("/hello")
    public String text(){
        return "welcome shop";
    }

    //商家端获取订单数据（新订单、异常订单、退单、催单、评论）
    @RequestMapping("/getShopData")
    public HashMap getShopData(@RequestBody String shopid){
        System.out.println(shopid);
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        String ordertime = dateFormat.format(date);
        HashMap<String,String> map = new HashMap<>();
        List<Tblorder> orderList = orderService.getNewOrder(shopid,"");
        map.put("newOrder",orderList.size()+"");
        List<Tblorder> backorderList = orderService.getChargeback(shopid,"");
        map.put("backOrder",backorderList.size()+"");
        List<Tblorder> sendOrders = orderService.getSending(shopid,"");
        map.put("sending",sendOrders.size()+"");
        List<Tblorder> comorders = orderService.getcompleted(shopid,"");
        map.put("completed",comorders.size()+"");
        List<Tblcomment> tblcomments = commentService.getComment(shopid);
        map.put("comment",tblcomments.size()+"");
        String totalIncome = orderService.getProfitToday(shopid,"38",ordertime);
        map.put("totalIncome",totalIncome+"");
        List<Tblorder> totalcomorders = orderService.getNewOrder(shopid,ordertime);
        map.put("totalcompleted",totalcomorders.size()+"");
        return map;
    }
}
