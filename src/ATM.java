public class ATM {
    int count20;
    int count50;
    int count100;
    int allMoney;

    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    void addMoney(int x20, int x50, int x100) {
        count20 += x20;
        count50 += x50;
        count100 += x100;
    }

    boolean takeMoney(int summaOfMoney) {
        if (summaOfMoney > count20 * 20 + count50 * 50 + count100 * 100) {
            System.out.println("Операция не выполнена!" + "\n" + "Недостаточно средств!");
            return false;
        } else {
            allMoney = count20 * 20 + count50 * 50 + count100 * 100 - summaOfMoney;
            System.out.println("Операция выполнена успешно!");
            System.out.print(summaOfMoney / 100 + "\t" + summaOfMoney % 100 / 50 + "\t" + summaOfMoney % 100 % 50 / 20);
            return true;
        }
    }
}
