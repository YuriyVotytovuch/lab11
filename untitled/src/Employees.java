public class Employees {
 String name;
 String surname;
 int age;
 int salary;
 int workhourse;
 int code;
 void empployess_info(){
   System.out.println("Робтіник: "+name + " " + surname);
   System.out.println("Вік робітника: "+age);
   System.out.println("Зарплатня за договором: "+salary+"$");
 }
 int salarye(){
   int salarye=workhourse*salary;
   System.out.println("Зарплатня відносно відпрацьованого часу: " +salarye+"$");
   return salarye;
  }
 public Employees(String n, String s, int a, int sal, int wh, int cd){
  this.name=n;
  this.surname=s;
  this.age=a;
  this.salary=sal;
  this.workhourse=wh;
  this.code=cd;
 }
}
