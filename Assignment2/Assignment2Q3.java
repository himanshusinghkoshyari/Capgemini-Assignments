import java.util.*;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        Integer sum =0;
        Iterator<Integer> iterator = cash.iterator();
        while(iterator.hasNext()){
            Integer n = iterator.next();
            sum = sum + n;
        }
        return sum;
    }
    
    public int getCash(){
        return 0;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arraylist = new ArrayList<>();
        
        CurrentAccount current = new CurrentAccount();
        Integer currentCash = current.getCash();
        arraylist.add(currentCash);
        
        SavingsAccount savingAccount = new SavingsAccount();
        Integer savingCash = savingAccount.getCash();
        arraylist.add(savingCash);
        
        Assignment2Q3 obj = new Assignment2Q3();
        obj.totalCashInBank(arraylist);
        
    }
}