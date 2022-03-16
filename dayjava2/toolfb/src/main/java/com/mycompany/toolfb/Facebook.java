/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolfb;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author truon
 */
public class Facebook {
    private String access_token;
    public Facebook(){
        
    }
    public Facebook(String access_token){
        this.access_token = access_token;
    }
    public void post(String content,int quantity) throws MalformedURLException, IOException {
        String temp = content;
        for(int i =0;i<quantity;i++){
           URL url = new URL("https://graph.facebook.com/v12.0/me/feed");
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setRequestMethod("POST");
            http.setDoOutput(true);
            String json = "{\"message\":\""+temp+"\",\"access_token\":\""+this.access_token+"\"}";
            byte[] out =  json.getBytes(StandardCharsets.UTF_8);
            int length = out.length;
            http.setFixedLengthStreamingMode(length);
            http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            http.connect();
            try(OutputStream os = http.getOutputStream()) {
            os.write(out);
            }
            temp+=".";
        } 
    }
    
    public void sendMess(String myId,String idUser, String content, String fb_dtsg,String cookie,int quantity) throws MalformedURLException, IOException{
        
            URL url = new URL("https://mbasic.facebook.com/messages/send/?icm=1&refid=12");
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            cookie= "sb=_9W0Yc2fD36cTtPBsC7XQEV-; _fbp=fb.1.1640941953467.1734389633; datr=IhbnYVXRBmTL9WVrdRgJA2l9; m_pixel_ratio=1; x-referer=eyJyIjoiL21lc3NhZ2VzL3RocmVhZC8xMDAwMzA2MDY2NDA0MTcvP2VudHJ5cG9pbnQ9cHJvZmlsZV9tZXNzYWdlX2J1dHRvbiIsImgiOiIvbWVzc2FnZXMvdGhyZWFkLzEwMDAzMDYwNjY0MDQxNy8/ZW50cnlwb2ludD1wcm9maWxlX21lc3NhZ2VfYnV0dG9uIiwicyI6Im0ifQ==; locale=vi_VN; wd=1920x937; c_user=100015283922422; xs=19:MJ1yL1vvBin8ww:2:1645538498:-1:6304; fr=0kig7og7LiJjeHPfJ.AWVk0DLmgUTRi93VPUv_083WDgg.BiFOrA.HA.AAA.0.0.BiFOzC.AWVPP81kxCU; presence=C{\"t3\":[],\"utc3\":1645539232844,\"v\":1}";
            http.setRequestProperty("Cookie", cookie);
            http.setRequestMethod("POST");
            http.setDoOutput(true);
            http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            myId="100015283922422";
            idUser = "100029031824085";
            fb_dtsg = "AQHpEiw3K9xNT_I:19:1645538498";
            content ="alo1234";
            String tids = "cid.c."+myId+":"+idUser;
            String ids = "ids["+idUser+"]";
            String data = "fb_dtsg="+fb_dtsg+
                "&body="+content+
                "&tids="+tids+
                "&"+ids+"="+idUser+
                "&wwwupp=C3"+
                "&referrer="+
                "&ctype="+
                "&cver=legacy";
           byte[] out = data.getBytes(StandardCharsets.UTF_8);
           OutputStream stream = http.getOutputStream();
           stream.write(out);
           http.disconnect();
        
    }
    public static void main(String[] args) throws IOException {
        Facebook fb = new Facebook();
        fb.sendMess(null, null, null, null, null, 0);
    }
    
    
}