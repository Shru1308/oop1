public class oop1 {
    public static void main(String[] args) {
        Student mm = new Student();
        
        mm.greeting();

        //......error.....When a non primitive datatype, you cannot reassign it
        // A = new Student(12); 
       

        //memory allocation of ´new´ keyword
        Student stud1 = new Student();
        Student stud2 = stud1 ;
        System.out.println(stud2.name);


        //Wrapper classes
        Integer num = new Integer(87);  //or we can simply write --->
        Integer num2 =45;
        
        
        // final keyword
        final Student A = new Student(11);
        System.out.println(A.rno);
        A.rno = 1100;
        System.out.println(A.rno);


        Student random = new Student(A);                       //constructor overloading
        System.out.println(random.name+random.rno);

    }
}

class Student{
    int rno;
    String name;
    void greeting(){
        System.out.println("hello "+this.name);
    }
    Student(){
        //calling a constructor from another constructor
        this(14);
    }

    Student (Student other){           //Student taking value from other type of student
        this.name = other.name;        //constructor overloading
        this.rno= other.rno;
    }

    Student(int k){
        this.name="mine";
        this.rno=k;
    }

    // //....Garbage collection -->
    // @Override
    // protected void finalize() throws Throwable{
    //    // super.finalize();
    //    System.out.println("The object is destroyed");
}

