package java_advanced.collections;

import java.util.List;

public class FirmMain {

    public static void main(String[] args) {
        Firm f = new Firm();
        f.hireEmployee(new HiringRequest("Bobby", "1987", 20000));
        f.hireEmployee(new HiringRequest("Robby", "1978", 18000));
        f.hireEmployee(new HiringRequest("Lobby", "1990", 26000));
        f.hireEmployee(new HiringRequest("Nobby", "1993", 23500));

        //System.out.println(f.getEmployeesIdentityValues());
        //List<IdentityValue> ivy = (List<IdentityValue>) f.getEmployeesIdentityValues();
        /*long maxid = 0;
        for(var i : ivy){
            System.out.println(i.getName() + " "+ i.getYearOfBirth() + " "+ i.getId());
            if(i.getId()>maxid){
                maxid = i.getId();
            }
        }*/

        /*for(long i = 1; i<= maxid; i++){
            System.out.println(f.getEmployeeSalary(i));
        }
*/

    }
}
