class Student{
    String name;
    int age;
    // function over loading 
    public static void Info(String name){
        System.out.println(name);
    }
    // function over loading 
    public static void Info(int age){
        System.out.println(age);
    }
    // function over loading 
    public static void Info(String name,int age){
        System.out.println(name+" "+age);
    }
}
class GFG {
	public static void main (String[] args) {
		Student s1=new Student();
		s1.name="Battu";
		s1.age=21;
		s1.Info(s1.name,s1.age);
		s1.Info(s1.name);
		s1.Info(s1.age);
		
	}
}
