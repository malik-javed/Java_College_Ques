import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(10);
        list.addLast(6);

        list.remove();

        list.clear();
        // System.out.println(list);

        //for loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //for-each loop
        for(int i:list)
        {
            System.out.println(i);
        }
    }
}
