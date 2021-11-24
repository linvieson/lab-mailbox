package mailbox;

import lombok.Getter;
import mail_info.MailInfo;
import mail_sender.MailSender;

import java.util.ArrayList;

@Getter
public class MailBox {
    private ArrayList<MailInfo> infos = new ArrayList<>();

    public MailBox(){}

    public void addMailInfo(MailInfo info){
        infos.add(info);
    }

    public void sendAll(){
        for (int i = 0; i < infos.size(); i++){
            MailSender.sendMail(infos.get(i));
        }
    }
}
