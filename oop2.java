abstract class shape{
    String color;
    //abstract methods
    abstract double area();
    public abstract String toString();

    public shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }
    //concrete method
    public String getColor(){ return color; }
}

class circle extends shape{
    double radius;
    public circle(String color,double radius){
        //calling shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
    @Override double area(){
        return Math.PI * Math.pow(radius,2);
    }
    @Override public String toString(){
        return "circle color is " + super.getColor()+" and area is : " + area();
    }
}

 class person{
    //encapsulating name and age
    private String name;
    private int age;

    public String getname(){ return name;}
    public void setname(String name) { this.name = name; }

    public int getage(){ return age;}
    public void setage(int age){ this.age = age;}
 }

//compile-time polymorphism (method overloading)
class helper{
    static int multiply(int a,int b){ return a*b; }
    static int multiply(int a,int b,int c){ return a*b*c; }
    static double multiply(double a,double b){ return a*b; }
}
//run-time polymorphism (method overriding)
class parent{
    void print(){ System.out.println("parent class"); }
}
class subclass1 extends parent{ void print() { System.out.println("subclass1");}}

class employee{
    int salary=10000;
}
class engineer extends employee{ int benefits = 5000; }

class one{
    public void print_1(){ System.out.println("print_1"); }
}
//single inheritance
class two extends one{
    public void print_2(){ System.out.println("print_2"); }
}
//multilevel inheritence
class three extends two{
    public void print_3(){ System.out.println("print_3"); }
}
//heirarchical inheritence
class four extends two{
    public void print_4(){ System.out.println("print_4"); }
}
//multiple inheritence(using interface)
interface a{ public void print_5a(); }
interface b{ public void print_5b(); }
interface five extends a,b{
    public void print_5a();
    public void print_5b();
}
class child implements five{
    @Override public void print_5a(){ System.out.println("print_5a"); }
    @Override public void print_5b(){ System.out.println("print_5b"); }
}


public class oop2 {
    public static void main(String[] args){

        shape s = new circle("red", 2.2);
        System.out.println(s.toString());

        person p = new person();
        p.setname("John");
        p.setage(30);
        System.out.println(p.getname());
        System.out.println(p.getage());

        System.out.println(helper.multiply(5,6));
        System.out.println(helper.multiply(2, 5, 10));
        System.out.println(helper.multiply(2.2,2.5));

        parent a;
        a = new subclass1();
        a.print();

        engineer e = new engineer();
        System.out.println("salary : "+e.salary+" ------- benefits : "+e.benefits);

        one g1 = new one();
        g1.print_1();
        two g2 = new two();
        g2.print_1();
        g2.print_2();
        three g3 = new three();
        g3.print_1();
        g3.print_2();
        g3.print_3();
        four g4 = new four();
        g4.print_1();
        g4.print_2();
        g4.print_4();
        child g5 = new child();
        g5.print_5a();
        g5.print_5b();
    }
}
