package capg_Day2;
//1 Nested Class
//2 Method
//3 Variable
//4 Block
class Std {



  // nested static class
  static class Address {
      
      //variable
      int houseNo;
      String streetName;



      //method
      public void print() {
          System.out.println("Nested class");
          
      }
      
      



  }



  // static block
  // it is special block in the java which will run as first statement of program
  // no need to call this block it will call automatically by the compiler
  static {
      System.out.println("I am static");
  }



  public String toString() {
      return "Student [rollno=" + rollno + ", name=" + name + " School name " + schoolName + "]";
  }



  public Std(int rollno, String name) {
      super();
      this.rollno = rollno;
      this.name = name;
  }



  private int rollno;
  private String name;
  // static variable
  static String schoolName;



  // static method
  public static void staticMethod() {
      System.out.println("School Name" + schoolName);
  }



}



public class myStatic {



  public static void main(String args[]) {



      Std.schoolName = "Abc school";



      Std s1 = new Std(1001, "Ansar");
      Std s3 = new Std(1002, "Priya");
      Std s2 = new Std(1003, "Mehesh");



      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);



      Std.staticMethod();



      Std.Address address = new Std.Address();
      address.print();



  }



}
