public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void learn(){
        System.out.println("learning : ");
    }
    public void walk(){
        System.out.println("walk :");
    }
    public void eat(){
        System.out.println("eating :");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}'+ super.toString();
    }
}
