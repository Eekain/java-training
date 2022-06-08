package java_advanced.collections;

import java.util.*;

public class Firm {
    private long idGenerator = 1;
    private Map<Long, Employee> employees = new HashMap<>();

    public void hireEmployee(HiringRequest hr) {
        //hozzon létre egy employeet, írjon neki egy id-t, és növeélje az idgenerátpr értékét.
        long id = idGenerator;
        Employee e = new Employee(hr, id);
        employees.put(id, e);
        this.idGenerator++;
    }
  /*  public List<IdentityValue> getEmployeesIdentityValues(){
        List<IdentityValue> res = new ArrayList<>();
        Employee temp;


        for(var e: employees.entrySet()){
            temp = e.getValue();
            //res.add(new IdentityValue(temp.getId(), temp.getName(), temp.getYearOfBirth()));
        }
        return res;
    }*/

    public long getEmployeeSalary(long id){
        Employee e = employees.get(id);
        Optional<Employee> opt = Optional.ofNullable(e);

        return opt.get().getSalary();
    }
}
