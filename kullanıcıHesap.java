import java.util.Scanner;
public class kullanıcıHesap {
    public static void main(String[] args) {
        String username, password, change,newpassword;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Your Username:");
        username = inp.nextLine();

        System.out.println("Enter Your Password:");
        password = inp.nextLine();

        if (username.equals("patikaa") && password.equals("275144")) {
            System.out.print("Successful Login");
        }else {
            System.out.print("Failed Login\nReset Your Password(Yes / No:)");
            change=inp.nextLine();
            if (change.equals("Yes"));{
                System.out.println("Enter Your New Password:");
                newpassword=inp.nextLine();
                if (newpassword.equals("275144")){
                System.out.print("Old Password Cannot Be Used");}
                else {
            System.out.print("Password Renewed,Login Again:");}




            }


        }
    }
}

