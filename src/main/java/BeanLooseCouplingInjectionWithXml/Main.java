package BeanLooseCouplingInjectionWithXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("looseCouplingInjection.xml");
        NotificationService notificationService = (NotificationService) applicationContext.getBean("notificationWithSms");
        notificationService.sendNotification("Hello World", "Fidelis");

        /**NotificationService smsNotification = new NotificationService(new Sms());
        System.out.println(smsNotification.sendNotification("Your order is shipped", "Anosike"));

        NotificationService whatsappNotification = new NotificationService(new Whatsapp());
        System.out.println(whatsappNotification.sendNotification("Your order is shipped", "Onyedikachi"));**/

    }
}
