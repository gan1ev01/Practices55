public class Programmer extends Person{
    private final String companyName;
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
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
    public void coding(){
        System.out.println("pishet kod ");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}'+ super.toString();
    }
}
