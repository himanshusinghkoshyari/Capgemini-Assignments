import java.util.*;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        Integer sum = 0;
        Iterator<Integer> iterator = employeeSalaries.iterator();
        while(iterator.hasNext()){
            Integer n = iterator.next();
            sum = sum + n;
        }
        int s = sum;
        return sum;
    
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        
        
        Assignment2Q2 obj = new Assignment2Q2();
        obj.totalEmployeesSalary(arraylist);
        
        Labour labour = new Labour();
        arraylist.add(labour.getSalary(obj.salary));
        
        Manager manager = new Manager();
        arraylist.add(manager.getSalary(obj.salary));
        
        
    }
}