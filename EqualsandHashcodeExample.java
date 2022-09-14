import java.util.*;

public class EqualsandHashcodeExample {
    String name;
    int id;

    public EqualsandHashcodeExample(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsandHashcodeExample that = (EqualsandHashcodeExample) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public static void main(String[] args) {
EqualsandHashcodeExample employee1=new EqualsandHashcodeExample("hemanth",112);
        EqualsandHashcodeExample employee2=new EqualsandHashcodeExample("hemanth",112);


        Set employee=new HashSet();
        employee.add(employee1);
        employee.add(employee2);
        System.out.println(employee);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id=" + id ;
    }
}
