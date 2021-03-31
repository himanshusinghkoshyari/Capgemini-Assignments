

import java.util.Locale;

class SingletonInheritanceCheck {
    static SingletonInheritanceCheck obj;

    private SingletonInheritanceCheck(){
        System.out.println("Instance Created.");
    }

    public static SingletonInheritanceCheck getInstance(){
        if(obj == null){
            obj = new SingletonInheritanceCheck();
        }
        return obj;
    }

}

public class Assignment2Q1 {

    public static void main(String[] args) {
	  SingletonInheritanceCheck obj1 = SingletonInheritanceCheck.getInstance();
	  SingletonInheritanceCheck obj2 = SingletonInheritanceCheck.getInstance();
	  SingletonInheritanceCheck obj3 = SingletonInheritanceCheck.getInstance();
    }
}
