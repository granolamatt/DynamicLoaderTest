/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicloadertest;

import com.granolamatt.device.DeviceModule;
import com.granolamatt.logger.LoggerOut;
import javax.ws.rs.Path;

/**
 *
 * @author root
 */
@Path("/tester")
public class DynamicLoaderTest implements DeviceModule {

    private TestClass tc = new TestClass();

    public DynamicLoaderTest() {
        tc.getInfo();
    }

    @Override
    public void setupModule() {
        LoggerOut.println("Made it to setup Hardware");
    }

    @Override
    public void haltModule() {
        LoggerOut.println("Module is being removed");
    }
}
