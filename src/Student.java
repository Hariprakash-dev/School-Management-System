
    /*

     keeping the track of students fees, name, grade & fees paid 
     
    */
    public class Student {
        private int id;
        private String name;
        private int grade;
        private int feespaid;
        private int totalfees;

        /*
         * constructor
         * the role of constructor is to create a new student object by
         * intializing the values
         */

         public Student(int id,String name,int grade){
            this.feespaid=0;
            this.totalfees=70000;
            this.id=id;
            this.name=name;
            this.grade=grade;
         }


         //if you going to alter name prefer set method

         //but im not going alter name,id

         //used to update the student grade
         // grade new grade ofthe student

        public void setgrade(int grade){
            this.grade=grade;
        }


        //feespaid=firstly paid 10000,another paid 50000,+5000
        //keep adding the fees to feespaid
        //so use update method
        //fees---fees the student pay



        public void payfees(int fees){
            feespaid+=fees;
            School.updatetotalmoneyearned(feespaid);

        }

        //return

        public int getid(){
            return id;
        }
         
        public String name(){
            return name;
        }

        public int grade(){
            return grade;
        }

        public int feespaid(){
            return feespaid;
        }

        public int totalfees(){
            return totalfees;
        }

        //return yhe remaining fees

        public int getremainingfees(){
            return totalfees-feespaid;
        }

        @Override
        public String toString() {
            return "Student's name : "+name+ "Total fees paid so far"+feespaid;
        }
        
}
