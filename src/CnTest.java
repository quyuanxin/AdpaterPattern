public class CnTest {
  public  static  void main (String[] args){
      //CnPluginInterface cnPlugin = new CnPlugin();
      EnPluginInterface enPlugin = new EnPlugin();
      //Home home = new Home(cnPlugin);
      Home home = new Home();
      PluginAdapter pluginAdapter = new PluginAdapter(enPlugin);
      home.setPlugin(pluginAdapter);
      home.charge();

  }
}
