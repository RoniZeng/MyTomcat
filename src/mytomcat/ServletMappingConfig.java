package mytomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16114 on 2019/5/2.
 */
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList = new ArrayList<>();
    static {
        servletMappingList.add(new ServletMapping("findGirl","/girl","mytomcat.FindGirlServlet"));
    }
}
