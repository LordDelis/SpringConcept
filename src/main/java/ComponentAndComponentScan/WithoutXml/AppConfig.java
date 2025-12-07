package ComponentAndComponentScan.WithoutXml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** This class will be used to replace the component scan config created in the .xml file of the previous example **/

@ComponentScan(basePackages = "ComponentAndComponentScan.WithoutXml") // This is used to replace <context:component-scan base-package="ComponentAndComponentScan"/> in the xml file of the previous example
@Configuration // This tells Spring to refer to this class for configurations. This replaces the configLocation specified in the lassPathXmlApplicationContext of the previous example
public class AppConfig {

}
