public class Dancer extends Person{
    private final String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    public void learn(){
        System.out.println("learning : ");
    }
    public void walk(){
        System.out.println("walked : ");
    }
    public void eat(){
        System.out.println("eating : ");
    }
    public void dancing(){
        System.out.println("danced ");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}'+ super.toString();
    }
}
