public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    //create a new Teacher object

    public Teacher(int id, String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    
    }
    public int getid(){
        return id;
    }

    public int getsalary(){
        return salary;
    }
    


    public String getname(){
        return name;

    }

   

    

   /*adds the salaryEarned
    * subtract the total money  earned by the school
    */


    public void recieveSalary(int salary){
        salaryEarned+=salary;
        School.updatetotalmoneyspend(salary);
        
       
    }
    @Override
    public String toString(){
        return " Name of the teacher : " +name +"Total salary earned so far "+ salaryEarned;
    }


}
