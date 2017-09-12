import com.haibin.adapter.extend.Adapter;
import com.haibin.adapter.extend.Target;

/**
 * Created by tanghaibin on 2017/9/12.
 *
 * 客户端，使用指定的适配器获取指定的电压
 *
 * Target---->>>>>Adapter------>>>Adaptee
 *
 * 使用场景
 *      当原有功能不能满足现有需求并且现有需求与原有功能相近
 *      比如：Version2适配Version1
 * 好处
 *      原有功能是稳定的版本，不应该直接修改原有版本，直接增加一个适配器适配现有功能,当出现bug的时候就可以直接定位到适配器中
 *
 * 实现方式有两种
 *      第一种
 *           继承方式，适用于Target 为接口的时候
 *           委托方式，适用于Target 为类的时候，因为java无法多继承，继承了Target就无法再次继承Adaptee
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.getVoltage(10);
    }
}
