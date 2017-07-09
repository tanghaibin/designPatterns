package top.haibin;

/**
 * Created by haibin.tang on 2017/7/9.
 * 模板方法模式：定义程序处理流程,具体的处理逻辑由子类实现，create方法只负责调用逻辑处理
 *              模板方法模式不能替换为接口实现，因为需要在方法中定义程序的处理流程
 *
 *              JDK中Inputstream中就使用了模板模式，InputStream#read()
 */
public abstract class CreateOrder {
    /**
     * 校验库存
     * @return
     */
    public abstract boolean validStock(String productCode);

    /**
     * 校验价格
     * @return
     */
    public abstract boolean validPrice(Integer price);

    /**
     * 此方法定义为final， 不建议重写该方法
     * @param productCode
     * @param price
     */
    public final void create(String productCode, Integer price) {
        if(!this.validStock(productCode)) {
            throw new RuntimeException(String.format("商品%s库存不足", productCode));
        }
        if(!this.validPrice(price)) {
            throw new RuntimeException(String.format("商品%s价格%s不匹配不足", productCode, price));
        }
        System.out.println("crate order success...");
    }
}
