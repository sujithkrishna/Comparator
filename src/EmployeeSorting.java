import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    private Integer empNo;
    private String empName;

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee(Integer empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                '}';
    }
}
public class EmployeeSorting {


    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>() ;
        empList.add(new Employee(15,"Sujith"));
        empList.add(new Employee(10,"Krishna"));
        empList.add(new Employee(30,"Indhu"));
        empList.add(new Employee(5,"Neeraj"));

        Comparator<Employee> sortData = ( first , second) -> first.getEmpNo() > second.getEmpNo() ? 1 : -1;
        System.out.println("Before Sorting");
        for(Employee emp : empList){
            System.out.println(emp);
        }
        Collections.sort(empList,sortData);
        System.out.println("After Sorting");
        for(Employee emp : empList){
            System.out.println(emp);
        }
        System.out.println("DONE");
    }
}
