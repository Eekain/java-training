package java_advanced.functional;
@FunctionalInterface
public interface QueryCriteria {

    boolean isMatch(Employee employee);
}
