package mytomcat;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 封装响应对象
 * Created by 16114 on 2019/5/2.
 * 基于HTTP协议的格式进行输出写入。
 */
public class MyResponse {

    private OutputStream outputStream;
    public MyResponse(OutputStream outputStream){
        this.outputStream = outputStream;
    }
    public void write(String content) throws IOException{
        //HTTP响应协议
        //HTTP/1.1 200 OK
        //<html><body> </body></html>
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 OK\n")
                .append("Content-Type:text/html\n")
                .append("\r\n")
                .append("<html><body>")
                .append(content)
                .append("</body></html>");

        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();
    }
}
