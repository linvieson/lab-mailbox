package mail_info;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMailCode {
    MailCode mailCode1;
    @BeforeEach
    void setUp(){
        mailCode1 = MailCode.HAPPY_BIRTHDAY;
    }

    @Test
    void TestGenerateText(){
        String text = "Hi %NAME%! Happy Birthday! In case you forgot, you are now %AGE% years old.\n";
        assertEquals(mailCode1.generateText(), text);
    }

}
