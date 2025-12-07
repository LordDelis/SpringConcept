package MyBeanPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        MyBean myBean = (MyBean) applicationContext.getBean("DelisBean");
        System.out.println(myBean);

        //myBean.setMessage("Hello world");
        //myBean.showMessage();
    }
}
