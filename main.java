import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bank obj = new bank();
        int choice;

        do {
            System.out.println("===================================================================");
            System.out.println("Welcome to HDFC Bank");
            System.out.println("1.Create bank account");
            System.out.println("2.Login ");
            System.out.println("3.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("============================================================");
                        System.out.println("1.Saving account");
                        System.out.println("2.Current account");
                        System.out.println("3.Salary account");
                        System.out.println("4.Exit");
                        choice = input.nextInt();
                        System.out.println("==============================================================");
                        switch (choice) {
                            case 1:
                                obj.saving_account();
                                break;
                            case 2:
                                obj.current_account();
                                break;
                            case 3:
                                obj.salary_account();
                                break;
                        }
                    } while (choice != 4);
                    break;
                case 2:
                    obj.login();
                    break;
            }
        } while (choice != 3);

    }
}
//test case 1 1
// Dharmendra Kumar Pandit 05/10/2003 7632977237 dharmendra763297@gmail.com PNA2345 76543973425 Pune
// Akash Kumar Pandit 05/10/2008 76329772678 aksh3456@gmail.com PN45655 8084124556 Patna
//Mohan Kumar Pandit 05/10/2009 7645783445 mohan34565@gmail.com PDD34543 74647567425 Madhubani