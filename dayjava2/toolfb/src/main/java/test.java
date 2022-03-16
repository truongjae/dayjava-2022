
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truon
 */
public class test {
    public enum a{
        A("aaaa");
        private String name;
        private a(String name){
            this.name = name;
        }
        private void setName(String name){
            this.name = name;
        }
        private String getName(){
            return this.name;
        }
    }
    public static void main(String[] args){
        String username = "truongjae";
        String code = "12345678";
         String title= "Xác nhận %s Social Viuni";
            String content = "Xin chào "+username+",\n" +
                    "Mã bảo mật của bạn là: "+code+"\n"+
                    "Để xác nhận yêu cầu %s của bạn trên Social Viuni, chúng tôi cần xác minh địa chỉ email của bạn. Hãy dán mã này vào trình duyệt.\n" +
                    "Đây là mã dùng một lần và thời gian sử dụng tối đa 5 phút."+"\n\n"+
                    "Thanks,\n" +
                    "-The Social Viuni Security Team-";
        content = String.format(content, "đăng nhập");
        System.out.println(content);
        System.out.println(a.A.getName());
    }
    
}
