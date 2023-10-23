public class Main {
    public static void main(String[] args) {
        ATM atm1 = new ATM(1,2,1);
        atm1.addMoney(0,1,1);
        System.out.println(atm1.allMoney);
        atm1.takeMoney(340);
       // System.out.println(atm1.count50);
        System.out.println(atm1.allMoney);
    }
}
