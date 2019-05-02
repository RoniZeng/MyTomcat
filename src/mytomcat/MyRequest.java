package mytomcat;

import java.io.IOException;
import java.io.InputStream;

/**
 * 封装请求对象
 * Created by 16114 on 2019/5/2.
 * 我们通过输入流，对HTTP协议进行解析，拿到了HTTP请求头的方法以及URL。
 */
public class MyRequest {
    private String url;
    private String method;
    public MyRequest(InputStream inputStream) throws IOException{
        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0;
        if ((length = inputStream.read(httpRequestBytes)) > 0){
            httpRequest = new String(httpRequestBytes,0,length);
        }

        //HTTP请求协议
        //GET HTTP/1.1
        //Accept：*/*
        //Accept-Encoding：gzip defalte
        //User—Agent：Mozilla/5.0
        //Host：localhost：8080
        //Connection：Keep—Alive
        String httpHead = httpRequest.split("\n")[0];
        url = httpHead.split("\\s")[1];
        method = httpHead.split("\\s")[0];
        System.out.println(this);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }
}
