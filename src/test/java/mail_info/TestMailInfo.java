package mail_info;

import client.Client;
import client.Gender;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Getter
public class TestMailInfo {
    MailInfo mailInfo;
    Client client;
    MailCode mailCode;

    @BeforeEach
    void setUp(){
        mailInfo = new MailInfo();
        client = new Client("Oles", 1, Gender.MALE);
        client.setEmail("olesmail");
        mailCode = MailCode.GREETINGS;
        mailInfo.setClient(client);
        mailInfo.setMailCode(mailCode);
    }

    @Test
    void TestGenerateText(){
        String text = "Hi, Oles! Congratulations with a holiday!\n";
        assertEquals(mailInfo.getText(), text);
    }

    @Test
    void TestGetEmail(){
        assertEquals(mailInfo.getEmail(), "olesmail");
    }

}
