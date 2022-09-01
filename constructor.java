class Student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("Constructer Access");
    }
}

class details{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.name="Battu";
        s1.age=21;
        
        s2.name="Bittu";
        s2.age=22;
        
        s1.info();
        s2.info();
    }
}
