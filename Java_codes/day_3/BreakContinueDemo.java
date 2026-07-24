class BreakContinueDemo {
    public static void main(String[] args) {
        
        // Using break
        System.out.println("Using break:");
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.print(i + " ");
        }

        // Using continue
        System.out.println("\nUsing continue:");
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}