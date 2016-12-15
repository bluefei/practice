abstract class Person{
    private String name;
    private int age;
    public Person(String name , int age){
        setAge(age);
        setName(name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String info(){
        return "name " + getName() +"age " + getAge();
    }
    public abstract String print();
}
class Student extends Person{
    private String school;
    public Student(String name,int age,String school) {
        super(name, age);
        setSchool(school);
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String info(){
        return "学校" + getSchool()+
        super.info();
    }
    public String print(){
        return getSchool() +getName() +getAge() ;
    }
}
public class shizhan{
    public static void main(String args[]){
        Student stu = new Student("刘鹏飞",19,"清华大学");
        System.out.println(stu.info());
    }
}