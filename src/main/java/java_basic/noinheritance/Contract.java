package java_basic.noinheritance;

import java.util.Optional;

public class Contract {

    private String title;
    private Optional<Attachment> attachment;

    public String getInfo(){
        //delegálás
        return  "title" + (attachment.isPresent() ? attachment.get().getInfo() : "");
    }
}
