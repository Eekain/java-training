package java_advanced.email;

import lombok.*;

@Data
@AllArgsConstructor
public class Email {
    private String subject;
    private String to;
    private String body;

    public Email() {
    }

    public static void main(String[] args) {
        var email = new Email("subject", "to", "body");
        System.out.println(email.getBody());
        System.out.println(email.getTo());
        System.out.println(email.getSubject());
    }

}
