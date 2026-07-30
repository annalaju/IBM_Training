package com.example.StringBankingDemo;

public class BankingStringDemo {

    public static void main(String[] args) {

        // Sample data
        String accountHolder = "  john doe  ";
        String accountNumber = "SBIN0001234";
        String transactionMsg = "Payment SUCCESSFUL";
        String email = "john.doe@bank.com";

        // 1. length()
        System.out.println("Length: " + accountNumber.length());

        // 2. toUpperCase() & toLowerCase()
        System.out.println("Upper: " + accountHolder.toUpperCase());
        System.out.println("Lower: " + transactionMsg.toLowerCase());

        // 3. trim()
        System.out.println("Trimmed Name: '" + accountHolder.trim() + "'");

        // 4. equals() & equalsIgnoreCase()
        System.out.println("Equals: " + transactionMsg.equals("Payment SUCCESSFUL"));
        System.out.println("Equals Ignore Case: " + transactionMsg.equalsIgnoreCase("payment successful"));

        // 5. contains()
        System.out.println("Contains SUCCESS: " + transactionMsg.contains("SUCCESS"));

        // 6. startsWith() & endsWith()
        System.out.println("Starts with SBIN: " + accountNumber.startsWith("SBIN"));
        System.out.println("Ends with 1234: " + accountNumber.endsWith("1234"));

        // 7. charAt()
        System.out.println("First char of account number: " + accountNumber.charAt(0));

        // 8. substring()
        System.out.println("Branch Code: " + accountNumber.substring(0, 4));

        // 9. replace()
        System.out.println("Updated Msg: " + transactionMsg.replace("SUCCESSFUL", "COMPLETED"));

        // 10. split()
        String[] emailParts = email.split("@");
        System.out.println("Username: " + emailParts[0]);
        System.out.println("Domain: " + emailParts[1]);

        // 11. indexOf() & lastIndexOf()
        System.out.println("Index of @: " + email.indexOf("@"));
        System.out.println("Last index of o: " + email.lastIndexOf("o"));

        // 12. isEmpty() & isBlank()
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("isEmpty: " + emptyStr.isEmpty());
        System.out.println("isBlank: " + blankStr.isBlank());

        // 13. concat()
        String fullMsg = "Dear ".concat(accountHolder.trim()).concat(", your transaction is successful.");
        System.out.println(fullMsg);

        // 14. valueOf()
        int balance = 5000;
        String balanceStr = String.valueOf(balance);
        System.out.println("Balance as String: " + balanceStr);

        // 15. matches() (Regex)
        System.out.println("Valid Account Number: " + accountNumber.matches("[A-Z]{4}[0-9]{7}"));

        // 16. compareTo()
        String bank1 = "SBI";
        String bank2 = "HDFC";
        System.out.println("Compare: " + bank1.compareTo(bank2));

        // 17. toCharArray()
        char[] chars = accountNumber.toCharArray();
        System.out.println("Chars in Account Number:");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        // 18. format()
        String formatted = String.format("Account: %s | Balance: %d", accountNumber, balance);
        System.out.println("\nFormatted: " + formatted);
    }
}