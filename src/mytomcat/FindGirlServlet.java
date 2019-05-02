package mytomcat;

import java.io.IOException;

/**
 * Created by 16114 on 2019/5/2.
 */
public class FindGirlServlet extends MyServlet{

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get gril...");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post gril...");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
