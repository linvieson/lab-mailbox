package mail_sender;

import lombok.SneakyThrows;
import mail_info.MailInfo;

public class MailSender {
    @SneakyThrows
    public static void sendMail(MailInfo info){
        System.out.println(info.getEmail() + " has new email: \n" + info.getText());
    }
}
