import java.util.Scanner;


public class IfCases {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String loginId;
        String password;


        System.out.print("Enter Login ID: ");
        loginId = sc.next();


        System.out.print("Enter Password: ");
        password = sc.next();


   
        if (loginId.equals("Prasunamba") && password.equals("4321")) {
            System.out.println("Welcome Prasunamba!");
            }
        else if (loginId.equals("Anna")){
            if (password.equals("432")) {
                System.out.println("Welcome Anna");
            }
        }
        else{
            System.out.println("Invalid");
        }


        sc.close();
    }
}
