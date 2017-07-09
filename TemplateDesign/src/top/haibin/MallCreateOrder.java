package top.haibin;

import java.util.Objects;

/**
 * Created by haibin.tang on 2017/7/9.
 */
public class MallCreateOrder extends CreateOrder {

    @Override
    public boolean validStock(String productCode) {
        System.out.println("校验库存...");
        return Objects.equals(productCode, "B2CK123");
    }

    @Override
    public boolean validPrice(Integer price) {
        System.out.println("校验价格...");
        return 1000 == price;
    }
}
