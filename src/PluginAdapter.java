//适配器必须实现原有的旧的接口
//适配器对象中持有对新接口的引用，当调用旧接口时，
// 将这个调用委托给实现新接口的对象来处理，也就是在适配器对象中组合一个新接口。
public class PluginAdapter implements  CnPluginInterface{
    private EnPluginInterface enPlugin;

    public  PluginAdapter(EnPluginInterface enPlugin){
        this.enPlugin = enPlugin;
    }
    @Override
    public  void chargeWith2Pins(){
        enPlugin.chargeWith3Pins();
    }

   // 适配器模式的三个特点：

  // 适配器对象实现原有接口
  //  适配器对象组合一个实现新接口的对象（这个对象也可以不实现一个接口，只是一个单纯的对象）
   // 对适配器原有接口方法的调用被委托给新接口的实例的特定方法
}
