import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class postapi {
    public static void postWithJson() throws IOException {
        String userID = "100029031824085";
        String accessToken = "EAAGNO4a7r2wBAD0YAGUezBX6UsovJI0vHQeDVaVTyY5cqECiG4rQPPAr6NyjyAXgz1CYaoHELkVjietfWGQUTwtZCTR3Kq7cs5HiP8KlrNWceaWlwhCT7UKMBbZAQqbcZAvZCTvN74jVZCUgFFYyrxBZATNEy3AGVa6KoSKRoA9Pdj1ZCdyeTwb7hMsZCUSdPLoZD";
        String message = "123 test 2";
        URL url = new URL("https://graph.facebook.com/v12.0/"+userID+"/feed");
        URLConnection con = url.openConnection();
        HttpURLConnection http = (HttpURLConnection)con;
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        String json = "{\"message\":\""+message+"\",\"access_token\":\""+accessToken+"\"}";
        byte[] out =  json.getBytes(StandardCharsets.UTF_8);
        int length = out.length;
        http.setFixedLengthStreamingMode(length);
        http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        http.connect();
        try(OutputStream os = http.getOutputStream()) {
            os.write(out);
        }
    }
    public static void main(String[] args) throws IOException {
        postWithJson();
    }
}
