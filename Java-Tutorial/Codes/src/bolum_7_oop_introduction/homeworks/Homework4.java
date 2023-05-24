package bolum_7_oop_introduction.homeworks;

public class Homework4 {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(1, 100);
        BankAccount bankAccount2 = new BankAccount(2, 200);
        BankAccount bankAccount3 = new BankAccount(3, 300);
        bankAccount2.paraCek(200);
        bankAccount1.paraYatir(500);
        BankAccount.showInfos();
        bankAccount1.compareByMoney(bankAccount2);
    }
}

class BankAccount {
    private long accountNo;
    private double money = 0.0;
    static private double totalParaInBank = 0;
    static private int accountNumber = 0, paraCekmeCount = 0, paraYatirmaCount = 0;

    public BankAccount(long accountNo, double money) {
        this.accountNo = accountNo;
        this.money = money;
        totalParaInBank += money;
        accountNumber++;
    }

    public void paraYatir(int tutar) {
        totalParaInBank += tutar;
        money += tutar;
        paraYatirmaCount++;
    }

    public void paraCek(int tutar) {
        if (this.money > tutar) {
            System.out.println("Yetersiz bakiye.");
        } else {
            totalParaInBank -= tutar;
            money -= tutar;
            paraCekmeCount++;
        }
    }

    public void compareByMoney(BankAccount bankAccount) {
        if (this.money > bankAccount.money) {
            System.out.println(this.accountNo + " numarali hesapta daha cok para var.");
        } else if (this.money == bankAccount.money) {
            System.out.println("Hesaplardaki paralar birbirine eşit.");
        } else {
            System.out.println(bankAccount.money + " numarali hesapta daha cok para var.");
        }
    }

    public static void showInfos() {
        System.out.println("Total account: " + accountNumber);
        System.out.println("Total para cekme: " + paraCekmeCount);
        System.out.println("Total para yatirma: " + paraYatirmaCount);
        System.out.println("Total money in the bank: " + totalParaInBank);
    }

}

