import java.util.LinkedList;


public class Demo02_LinkedList {


    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();


        list.add(10);
        list.add(20);
        list.add(30);


        System.out.println("LinkedList: " + list);


        list.remove(1);
        System.out.println("After removal: " + list);
    }
}
