package features;

import demo4071.DemoApp;
import demo4071.dso.mapper.AppxMapper;
import net.hasor.db.solon.Db;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.noear.solon.test.SolonJUnit4ClassRunner;
import org.noear.solon.test.SolonTest;

/**
 * @author noear 2021/5/16 created
 */
@RunWith(SolonJUnit4ClassRunner.class)
@SolonTest(DemoApp.class)
public class AnnoTest {

    @Db
    AppxMapper appxMapper;

    @Test
    public void test() {
        assert appxMapper.listTables().size() > 0;
    }
}
