import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Teacher lissy = new Teacher(1, "lissy", 15000);
       Teacher panda = new Teacher(2, "panda", 20000);
       Teacher lion  = new Teacher(3, "lion", 25000);

       List<Teacher> teacherlist=new ArrayList<>();
       teacherlist.add(lissy);
       teacherlist.add(panda);
       teacherlist.add(lion);

       Student hari=new Student(1, "hari", 9);
       Student prakash=new Student(2, "prakash", 7);
       Student ben = new Student(3, "ben", 8); 

       List<Student> studentList =new ArrayList<>();
       studentList.add(hari);
       studentList.add(prakash);
       studentList.add(ben);

       School Bpbhs =new School(teacherlist, studentList);

       hari.payfees(50000);
       prakash.payfees(30000);
       System.out.println("Bphss has earned "+ Bpbhs.gettotalmoneyearned());

       System.out.println("------Making school pay salary------");

       lissy.recieveSalary(lissy.getsalary());
       System.out.println("Bphss has spent for salary to "+ lissy.getname()+" and now has " + 
       Bpbhs.gettotalmoneyearned());
       
       panda.recieveSalary(panda.getsalary());
        System.out.println("Bphss has spent for salary to "+ panda.getname()+" and now has " + 
        Bpbhs.gettotalmoneyearned());

        System.out.println(hari);
        System.out.println(panda);

    }

}
