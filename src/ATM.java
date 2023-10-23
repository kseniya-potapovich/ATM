public class ATM {
    int count20;
    int count50;
    int count100;
    int allMoney;

    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
        this.allMoney = count100 * 100 + count50 * 50 + count20 * 20;
    }

    void addMoney(int x20, int x50, int x100) {
        count20 += x20;
        count50 += x50;
        count100 += x100;
        allMoney += x100 * 100 + x50 * 50 + x20 * 20;
    }

    boolean takeMoney(int summaOfMoney) {
        if (allMoney >= summaOfMoney) {
            System.out.println("Операция выполнена успешно!");
            int temp = summaOfMoney / 100;
            if (count100 <= temp) {
                temp = count100;
            }
            summaOfMoney -= temp * 100;
            allMoney -= temp * 100;
            count100 -= temp;
            System.out.println("100: " + temp);

            temp = summaOfMoney / 50;
            if (count50 <= temp) {
                temp = count50;
            }
            summaOfMoney -= temp * 50;
            allMoney -= temp * 50;
            count50 -= temp;
            System.out.println("50: " + temp);

            temp = summaOfMoney / 20;
            if (count20 <= temp) {
                temp = count20;
            }
            summaOfMoney -= temp * 20;
            allMoney -= temp * 20;
            count20 -= temp;
            System.out.println("20: " + temp);

            return true;
        } else {
            System.out.println("Операция не выполнена!" + "\n" + "Недостаточно средств!");
            return false;
        }
    }
}
