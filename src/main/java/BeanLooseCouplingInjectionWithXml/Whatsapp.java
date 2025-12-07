package BeanLooseCouplingInjectionWithXml;

public class Whatsapp implements MessageSender {
    public String sendMessage(){
        return "Message sent via Whatsapp";
    }
}
