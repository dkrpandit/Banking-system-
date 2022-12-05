import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class bank extends person {
    public ArrayList<person> personArrayList = new ArrayList<person>();
    // creating saving account
    public void saving_account() {
        person saving_acc = new person();
        int ch;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Choose Branch");
        System.out.println("1.PUNE - AUNDH");
        System.out.println("2.PUNE - KOTHRUD");
        System.out.println("3.PUNE - NIGDI");
        ch = input1.nextInt();
        switch (ch) {
            case 1:
                saving_acc.IFSC_Code = "HDFC0000052";
                break;
            case 2:
                saving_acc.IFSC_Code = "HDFC0000149";
                break;
            case 3:
                saving_acc.IFSC_Code = "HDFC0000185";
                break;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name :- ");
        saving_acc.first_name = input.next();
        System.out.print("Enter your middle name :- ");
        saving_acc.middle_name = input.next();
        System.out.print("Enter your last name:-  ");
        saving_acc.last_name = input.next();
        System.out.print("Enter your Date of Birth:- ");
        saving_acc.date_of_birth = input.next();
        System.out.print("Enter your mobile number:-  ");
        saving_acc.mobile_no = input.next();
        System.out.print("Enter your email ID:-  ");
        saving_acc.email_ID = input.next();
        System.out.print("Enter your PAN CARD Number :-  ");
        saving_acc.pan_card = input.next();
        System.out.print("Enter your Adhar Card number :-  ");
        saving_acc.aadhar_card = input.next();
        System.out.print("Enter your Address :-  ");
        saving_acc.address = input.next();
        Random random = new Random();
        float balance;
        do {
            System.out.print("Enter account opening amount(Min- 2000₹)");
            balance = input.nextFloat();
            if (balance >= 2000) {
                saving_acc.account_balance += balance;
                System.out.println("Your Account created successfully");
                saving_acc.account_number = random.nextInt(10000000);
                System.out.print("Account number :- " + saving_acc.account_number + "\n");
                System.out.println("IFSC Code :-  " + saving_acc.IFSC_Code);
            } else {
                System.out.println("You can't create account");
            }
        } while (balance <= 2000);
        personArrayList.add(saving_acc);
    }

    //    method for opening current bank account
    public void current_account() {
        person current_acc = new person();
        int ch;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Choose Branch");
        System.out.println("1.PUNE - AUNDH");
        System.out.println("2.PUNE - KOTHRUD");
        System.out.println("3.PUNE - NIGDI");
        ch = input1.nextInt();
        switch (ch) {
            case 1:
                current_acc.IFSC_Code = "HDFC0000052";
                break;
            case 2:
                current_acc.IFSC_Code = "HDFC0000149";
                break;
            case 3:
                current_acc.IFSC_Code = "HDFC0000185";
                break;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name :- ");
        current_acc.first_name = input.next();
        System.out.print("Enter your middle name :- ");
        current_acc.middle_name = input.next();
        System.out.print("Enter your last name:-  ");
        current_acc.last_name = input.next();
        System.out.print("Enter your Date of Birth:- ");
        current_acc.date_of_birth = input.next();
        System.out.print("Enter your mobile number:-  ");
        current_acc.mobile_no = input.next();
        System.out.print("Enter your email ID:-  ");
        current_acc.email_ID = input.next();
        System.out.print("Enter your PAN CARD Number :-  ");
        current_acc.pan_card = input.next();
        System.out.print("Enter your Adhar Card number :-  ");
        current_acc.aadhar_card = input.next();
        System.out.print("Enter your Address :-  ");
        current_acc.address = input.next();
        Random random = new Random();
        float balance;
        do {
            System.out.print("Enter account opening amount(Minimum Amount- 5000 ₹)");
            balance = input.nextFloat();
            if (balance >= 5000) {
                current_acc.account_balance += balance;
                System.out.println("Your Account created successfully");
                current_acc.account_number = random.nextInt(10000000);
                System.out.print("Account number :- " + current_acc.account_number + "\n");
                System.out.println("IFSC Code :-  " + current_acc.IFSC_Code);
            } else {
                System.out.println("You can't create account");
            }
        } while (balance <= 5000);
        personArrayList.add(current_acc);
    }
    public void salary_account() {
        person salary_acc = new person();
        int ch;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Choose Branch");
        System.out.println("1.PUNE - AUNDH");
        System.out.println("2.PUNE - KOTHRUD");
        System.out.println("3.PUNE - NIGDI");
        ch = input1.nextInt();
        switch (ch) {
            case 1:
                salary_acc.IFSC_Code = "HDFC0000052";
                break;
            case 2:
                salary_acc.IFSC_Code = "HDFC0000149";
                break;
            case 3:
                salary_acc.IFSC_Code = "HDFC0000185";
                break;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name :- ");
        salary_acc.first_name = input.next();
        System.out.print("Enter your middle name :- ");
        salary_acc.middle_name = input.next();
        System.out.print("Enter your last name:-  ");
        salary_acc.last_name = input.next();
        System.out.print("Enter your Date of Birth:- ");
        salary_acc.date_of_birth = input.next();
        System.out.print("Enter your mobile number:-  ");
        salary_acc.mobile_no = input.next();
        System.out.print("Enter your email ID:-  ");
        salary_acc.email_ID = input.next();
        System.out.print("Enter your PAN CARD Number :-  ");
        salary_acc.pan_card = input.next();
        System.out.print("Enter your Adhar Card number :-  ");
        salary_acc.aadhar_card = input.next();
        System.out.print("Enter your Address :-  ");
        salary_acc.address = input.next();
        Random random = new Random();
        float balance;
        do {
            System.out.print("Enter account opening amount(Min- 15000₹)");
            balance = input.nextFloat();
            if (balance >= 15000) {
                salary_acc.account_balance += balance;
                System.out.println("Your Account created successfully");
                salary_acc.account_number = random.nextInt(10000000);
                System.out.print("Account number :- " + salary_acc.account_number + "\n");
                System.out.println("IFSC Code :-  " + salary_acc.IFSC_Code);
            } else {
                System.out.println("You can't create account");
            }
        } while (balance <= 15000);
        personArrayList.add(salary_acc);
    }
//    login method
    public void login() {
        int account_no;
        float Withdrew_limit = 100000.00f;
        String IFSC;
        int choice;
        float money;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your account number :-  ");
        account_no = input.nextInt();
        System.out.print("Enter IFSC code:-  ");
        IFSC = input.next();
        for (int i = 0; i < personArrayList.size(); i++) {
            if ((account_no == personArrayList.get(i).account_number) && (IFSC.equals(personArrayList.get(i).IFSC_Code))) {

                do {
                    System.out.println("================================================================");
                    System.out.println("1.Check Account balance");
                    System.out.println("2.Deposit Money");
                    System.out.println("3.Account information");
                    System.out.println("4.Withdrew money");
                    System.out.println("0.Exit");
                    choice = input.nextInt();
                    System.out.println("=================================================================");
                    switch (choice) {
                        case 1:
                            System.out.println("Balance :-  " + personArrayList.get(i).account_balance + " ₹");
                            break;
                        case 2:
                            System.out.print("Enter Deposit money :-  ");
                            money = input.nextFloat();
                            if (money>100000)
                            {
                                System.out.println("yuo can't deposit more then 1,00,000 ₹");
                            }
                            else {
                                personArrayList.get(i).account_balance += money;
                                System.out.println("Deposit Successfully");
                            }
                            break;
                        case 3:
                            System.out.print("Account no :- " + personArrayList.get(i).account_number + "\n");
                            System.out.print("IFSC :- " + personArrayList.get(i).IFSC_Code + "\n");
                            System.out.print("Name :-  " + personArrayList.get(i).first_name + " " + personArrayList.get(i).middle_name + " " + personArrayList.get(i).last_name + "\n");
                            System.out.print("Date of birth :-  " + personArrayList.get(i).date_of_birth + "\n");
                            System.out.print("Mobile number:-  " + personArrayList.get(i).mobile_no + "\n");
                            System.out.print("Email I'D :-  " + personArrayList.get(i).email_ID + "\n");
                            System.out.print("Pan Card number :-  " + personArrayList.get(i).pan_card + "\n");
                            System.out.print("Aadhar Card number :-  " + personArrayList.get(i).aadhar_card + "\n");
                            System.out.print("Address:- " + personArrayList.get(i).address + "\n");
                            break;
                        case 4:
                            System.out.println("Withdrew limit is 1,00,000 ₹ ");
                            System.out.println("Enter money");
                            money = input.nextFloat();
                            if (personArrayList.get(i).account_balance - money < 0) {
                                System.out.println("Sorry You Don't Have Enough Balance to Withdraw");
                            } else if (Withdrew_limit < 0) {
                                System.out.println("Withdrew limit is reached");
                            } else {
                                personArrayList.get(i).account_balance -= money;
                                Withdrew_limit -= money;
                                System.out.println("Successfully Withdraw");
                            }
                            break;
                    }
                } while (choice != 0);

            }
        }
        System.out.println("Invalid!");
    }
}