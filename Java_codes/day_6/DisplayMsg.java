interface Message {
    void show();
}

public class DisplayMsg {
    public static void main(String[] args){
        Message m = () -> System.out.println("welcome");
        m.show();
    }
}