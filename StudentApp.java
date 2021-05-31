/*
* Program 4
*/
class Student{
String studentId;
String name;
long mobileNumber;
int age;
public  void displayStudentDetails(){
System.out.println("Student Id:"+studentId);
System.out.println("Name:"+name);
System.out.println("Mobile Number:"+mobileNumber);
System.out.println("Age:"+age);
}
}
class StudentApp{
public static void main(String args[]){
 Student student=new Student();
         student.studentId="A11221";
         student.name="kumar";
         student.mobileNumber=7788778855L;
         student.age=25;
          student.displayStudentDetails();
}
}

