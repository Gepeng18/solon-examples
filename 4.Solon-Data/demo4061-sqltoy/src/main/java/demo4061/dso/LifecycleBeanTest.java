package demo4061.dso;

import org.noear.solon.annotation.Component;
import org.noear.solon.core.bean.InitializingBean;
import org.noear.solon.core.bean.LifecycleBean;
import org.noear.solon.extend.sqltoy.annotation.Db;
import org.sagacity.sqltoy.dao.SqlToyLazyDao;

/**
 * @author noear 2023/3/2 created
 */
@Component
public class LifecycleBeanTest implements LifecycleBean, InitializingBean {
    @Db
    SqlToyLazyDao db1;

    @Override
    public void afterInjection() throws Throwable {
        System.out.println("============ afterInjection");
    }

    @Override
    public void start() throws Throwable {
        System.out.println("============ start");
    }
}
