class Animal {
    private String type;
    public Animal(String type) {
        this.type = type;}
    public String getType() {
        return type; }
}
class Lion extends Animal {
    public Lion() {
        super("Lion");}   
   }
class Monkey extends Animal {
    public Monkey() {
        super("Monkey");}
}
class Peacock extends Animal {
    public Peacock() {
        super("Peacock");}
}
class tiger extends Animal {
    public tiger() {
        super("tiger");}}
class ZooInfo {
    private String zooName;
    private String caretaker;
    public ZooInfo(String zooName, String caretaker) {
        this.zooName = zooName;
        this.caretaker = caretaker;}
    public void displayInfo() {
        System.out.println("Zoo Name: " + zooName);
        System.out.println("Caretaker: " + caretaker);}
    public void showAnimal(Animal animal) {
        System.out.println("Animal: " + animal.getType());
    }
}
public class zoo {
    public static void main(String[] args) {
        ZooInfo myZoo = new ZooInfo("KASS ZOO", "Sathvikaa");
        Animal lion = new Lion();
        Animal monkey = new Monkey();
        Animal peacock = new Peacock();
        Animal tiger = new tiger();
        myZoo.displayInfo();
        System.out.println();
        myZoo.showAnimal(lion);
        myZoo.showAnimal(monkey);
        myZoo.showAnimal(peacock);
        myZoo.showAnimal(tiger);
    }
}