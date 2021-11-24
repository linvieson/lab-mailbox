package mail_info;

import lombok.Getter;
import lombok.SneakyThrows;

import java.io.File;
import java.util.Scanner;

@Getter
public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"),
    GREETINGS("greetings.txt"),
    DISCOUNT("discount.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        Scanner sc = new Scanner(filename);
        File file = new File(sc.nextLine());
        Scanner scfile = new Scanner(file);
        String text = "";

        while (scfile.hasNextLine()) {
            text += scfile.nextLine() + '\n';
            System.out.println(text);
        }
        return text;
    }

}
