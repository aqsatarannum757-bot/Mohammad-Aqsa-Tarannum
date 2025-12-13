class student{
    String name;
    String location;
    String hobbies;
    public void display(){
        System.out.println("name of the student: "+name+" and location: "+location+" and hobbies:"+hobbies);}}
        public class main{
    public static void main(String[] args) {
        student s1= new student();
        s1.name= "aqsa";
        s1.location= "kothagudem";
        s1.hobbies="reading books";
        s1.display();
        
        student s2= new student();
        s2.name= "Afroz";
        s2.location= "palvancha";
        s2.hobbies="playing";
        s2.display();
    }
    }
