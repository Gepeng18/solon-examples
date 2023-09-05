package demo3011;

import org.noear.solon.Solon;
import org.noear.solon.SolonApp;
import org.noear.solon.core.handle.MethodType;

public class WebApp {
    public static void main(String[] args) {
        SolonApp solonApp = Solon.start(WebApp.class, args, app -> {
            app.onError(e -> e.printStackTrace());
        });
        //开始之前把上下文置为已泻染
        solonApp.before("/cache/**", MethodType.HTTP, c -> {
            c.setRendered(true);
            System.out.println(1);
        });

        solonApp.after("/cache/**", MethodType.HTTP, c -> {
            System.out.println(1);
            //可对 c.result 进行处理 //并输出
        });
    }
}
