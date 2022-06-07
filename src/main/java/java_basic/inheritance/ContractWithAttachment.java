package java_basic.inheritance;

public class ContractWithAttachment extends Contract{

    private String attachment;

    public  String getAttachment(){
        return attachment;
    }

    public ContractWithAttachment(String title, String attachment) {
        super(title);
        this.attachment = attachment;
    }

    public String getInfo(){
        return title + " " + attachment;
    }
}
