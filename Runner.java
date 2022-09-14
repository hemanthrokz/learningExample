import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> lst=new ArrayList<>();
        lst.add(new Laptop("hp",16,800));
        lst.add(new Laptop("apple",8,1200));
        lst.add(new Laptop("lenovo",12,1800));

//        Comparator<Laptop> laptopComparator=new Comparator<Laptop>() {
//            @Override
//            public int compare(Laptop o1, Laptop o2) {
//                if(o1.getPrice()< o2.getPrice()){
//                    return 1;
//                }
//                else {
//                    return -1;
//                }
//
//            }
//        };
       Collections.sort(lst);
       // Collections.sort(lst,laptopComparator);
for (Laptop l:lst) {
    System.out.println(l);
}
    }
}
