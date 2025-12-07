package BeanLooseCouplingInjectionWithXml;

public class Email implements MessageSender {
    public String sendMessage(){
        return "Message sent via Email";
    }
}
