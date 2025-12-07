package BeanSetterInjectionWithXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjection.xml");
        Car car = (Car) applicationContext.getBean("myCar");
        car.displayDetails();

        /**Specification spec = new Specification();
        spec.setEngineType("V6");
        spec.setManufactureYear("2005");
        spec.setModel("Benz");
        spec.setMake("Mercedes");

        Car myCar = new Car(spec);
        myCar.displayDetails();**/

    }
}
