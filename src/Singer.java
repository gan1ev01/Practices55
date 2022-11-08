public class Singer extends Person{
    private String name5;
    public Singer(String name, String designation, String name1) {
        super(name, designation);
        this.name5 = name5;
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
    public void singing(){
        System.out.println("singered ");
    }
    public void playGitara(){
        System.out.println("plays guitar");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name5='" + name5 + '\'' +
                '}'+ super.toString();
    }
}
