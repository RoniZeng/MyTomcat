package mytomcat;

/**
 * servlet配置
 * Created by 16114 on 2019/5/2.
 */
public class ServletMapping {

    private String servletName;
    private String url;
    private String clazz;

    public ServletMapping(String servletName,String url,String clazz){
        this.servletName = servletName;
        this.url = url;
        this.clazz = clazz;
    }
    public String getUrl() {
        return url;
    }

    public String getClazz() {
        return clazz;
    }

}
