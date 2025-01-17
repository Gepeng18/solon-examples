package demo9073.client.dso.service;

import org.noear.solon.annotation.ProxyComponent;
import org.noear.solon.cloud.tracing.Spans;
import org.noear.solon.cloud.tracing.annotation.Tracing;

/**
 * @author noear 2022/5/7 created
 */
@ProxyComponent
public class OrderService {
    @Tracing(name = "创建订单", tags = "订单=${orderId}")
    public void orderCreate(String orderId) {
        Spans.active(span -> span.setTag("用户", 1));

        System.out.println("print - test");
    }
}
