package mailbox;

import client.Client;
import client.Gender;
import mail_info.MailCode;
import mail_info.MailInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMailbox {
    MailBox mailBox;
    MailInfo mailInfo;
    MailCode mailCode;
    Client client;
    ArrayList<MailInfo> mailInfos = new ArrayList<>();

    @BeforeEach
    void setUp(){
        mailBox = new MailBox();
        mailInfo = new MailInfo();

        client = new Client("Oles", 1, Gender.MALE);
        client.setEmail("olesmail");

        mailCode = MailCode.GREETINGS;
        mailInfo.setClient(client);
        mailInfo.setMailCode(mailCode);

        mailBox.addMailInfo(mailInfo);
    }

    @Test
    void TestAddMailInfo(){
        mailBox.addMailInfo(mailInfo);
        mailInfos.add(mailInfo);
        assertEquals(mailBox.getInfos().get(0).getEmail(), mailInfos.get(0).getEmail());
    }

}
