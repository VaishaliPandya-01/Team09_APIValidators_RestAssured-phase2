package api.StepDefination;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import java.io.IOException;

public class Utils {
    public static void setEnvVariable(String Name, String Value) throws IOException, ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration
        		("./src/test/resources/Routes.properties");
        config.setProperty(Name, Value);
        config.save();
        
       // return variable;
        

    }
}