class Student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class details{
    public static void main(String args[]){
        Student s1=new Student("ram",32);
        s1.info();
        
    }
}
