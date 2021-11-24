package mail_info;

import client.Client;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String getText(){
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", (new Integer(this.client.getAge())).toString());
        String text = mailCode.generateText();

        for (String key : templates.keySet()){
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getEmail(){
        return client.getEmail();
    }

}
