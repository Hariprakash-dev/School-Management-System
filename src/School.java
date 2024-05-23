import java.util.List;

public class School {
    /* 
      many teachers,many students
      so use arraylist
      */

      private List <Teacher> teachers;
      private List <Student> students;
      private static int totalmoneyearned;
      private static int totalmoneyspend;
      
      //new School object created
      //list of student, teachers in the school

      public School(List <Teacher> teachers , List <Student> students){
        this.teachers=teachers;
        this.students=students;
        totalmoneyearned=0;
        totalmoneyspend=0;
      }
      // school everything alter so us get set
      // get--return the list of the students,teachers,me,ms in school
      //set---add the teacher,,...in the school

      public List<Teacher> getTeacher(){
        return teachers;
      }

      public void addTeacher(Teacher teacher){
        teachers.add(teacher);
      }

      public List<Student> getStudent(){
        return students;
      }

      public void addStudent(Student student){
        students.add(student);
      }

      public int gettotalmoneyearned(){
        return totalmoneyearned;

      }

      public static void updatetotalmoneyearned(int Moneyearned){
        totalmoneyearned+=Moneyearned;
      }

      public int gettotalmoneyspend(){
        return totalmoneyspend;
      }
       
      // update the money that spend by school
      //which is the salary given by the school to the teachers

    public static void updatetotalmoneyspend( int Moneyspend){
        totalmoneyearned-=Moneyspend;
        
      }


}
