import java.util.*;
public class ArrayListExample{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.remove("Grapes");

        //Traversing list through Iterator
//        Iterator itr=list.iterator();//getting the Iterator
//        while(itr.hasNext()){//check if iterator has the elements
//            System.out.println(itr.next());//printing the element and move to next
//        }
        for (String list1:list
             ) {
            System.out.println(list1);
        }
    }
}  