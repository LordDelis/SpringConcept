package LooseCoupling;

public class Main {
    public static void main(String[] args) {

        NotificationService emailNotification = new NotificationService(new Email());
        System.out.println(emailNotification.sendNotification("Your order is shipped", "Fidelis"));

        /**NotificationService smsNotification = new NotificationService(new Sms());
        System.out.println(smsNotification.sendNotification("Your order is shipped", "Anosike"));

        NotificationService whatsappNotification = new NotificationService(new Whatsapp());
        System.out.println(whatsappNotification.sendNotification("Your order is shipped", "Onyedikachi"));**/

    }
}
