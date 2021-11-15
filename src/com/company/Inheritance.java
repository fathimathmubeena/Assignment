package com.company;

public class Inheritance{
    public static void main(String[] args){
    Trainee t = new Trainee("Robosoft","Dhanya",25,"6 month",25000);
    SoftwareEngineer s = new SoftwareEngineer("Robosoft","Anil",26,5,40000,"java");
    DataAnalyst d = new DataAnalyst("Robosoft","Bhavya",28,7,50000,"SQL");
    t.display();
    s.display();
    d.display();
    }
}

class Employee{
    String company;
    String name;
    int age;

    void display(){
        System.out.println("The display method of Super class Employee");
        System.out.println("the details of Employee "+name+":\nCompany-"+company+"\nAge-"+age);
        System.out.println("-----------------------------");
    }
}
class Trainee extends Employee{
    String training_period;
    double salary;
    Trainee(String c,String n,int a,String t,double s){
        company=c;
        name=n;
        age=a;
        training_period=t;
        salary=s;
    }
    void display(){
        System.out.println("The display method of Sub class Trainee");
        System.out.println("The details of Trainee "+name+":\nCompany-"+company+"\nAge-"+age+"\nTraining period-"+training_period+"\nSalary-"+salary);
        System.out.println("-----------------------------");
    }
}
class SoftwareEngineer extends Employee{
    int experience;
    double salary;
    String technology;
    SoftwareEngineer(String c,String n,int a,int e,double s,String t){
        company=c;
        name=n;
        age=a;
        experience=e;
        salary=s;
        technology=t;
    }
    void display(){
        System.out.println("The display method of sub class Software Engineer");
        System.out.println("The details of Software Engineer "+name+":\nCompany-"+company+"\nAge-"+age+"\nExperience-"+experience+"\nSalary-"+salary+"\nTechnology-"+technology);
        System.out.println("-----------------------------");
    }

}
class DataAnalyst extends Employee{
    int experience;
    double salary;
    String database;
    DataAnalyst(String c,String n,int a,int e,double s,String d){
        company=c;
        name=n;
        age=a;
        experience=e;
        salary=s;
        database=d;
    }
    void display(){

        System.out.println("The display method of Sub class Data Analayst");
        System.out.println("The details of Data Analyst "+name+":\nCompany-"+company+"\nAge-"+age+"\nExperience-"+experience+"\nSalary-"+salary+"\nDatabase-"+database);
        System.out.println("-----------------------------");
    }

}