package urlparts;

import java.util.ArrayList;
import java.util.List;

public class Url {

    private String url;
    private String protocoll;
    private String dotSlashSlash;
    private String domainName;
    private String orgType;


    private String path;
    private List<Parameter> parameters = new ArrayList<>();


    public Url(String url) {
        this.url = url;
        cut();
    }
    private void cut(){
        int ddot = url.indexOf(':');
        this.protocoll = url.substring(0, ddot);
        this.dotSlashSlash = url.substring(ddot, ddot+3);
        int orgPos = url.indexOf(".com"); // needs to fit others as well
        this.domainName = url.substring(ddot+3, orgPos);
        int orgEnd = url.indexOf('/', orgPos);
        this.orgType = url.substring(orgPos, orgEnd);
        int lastPer = url.lastIndexOf('/');
        this.path = url.substring(orgEnd, lastPer);
        List<String> paramConst = new ArrayList<>(List.of(url.substring(lastPer).split("&")));
        for(String s: paramConst){
            int equals = s.indexOf("=");
            String paramName = s.substring(s.indexOf('?')+1, equals);
            String paramValue = s.substring(equals+1);
            parameters.add(new Parameter(paramName, paramValue));
        }

    }
    public List<String> getParameterNames(){
        List<String> names = new ArrayList<>();
        for(Parameter p : parameters){
            names.add(p.getName());
        }
        return names;
    }
    public List<String> getParameterValues(){
        List<String> values = new ArrayList<>();
        for(Parameter p : parameters){
            values.add(p.getValue());
        }
        return values;
    }

    public String getProtocoll() {
        return protocoll;
    }


    public String getDomainName() {
        return domainName;
    }

    public String getOrgType() {
        return orgType;
    }



    public List<Parameter> getParameters() {
        return parameters;
    }
}
