public class Dog extends Animal{

    protected String breed;

    public Dog (String name) {
        super(name);
        this.breed = "Дворняга";
    }

    public Dog (String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public Dog (int age, String name) {
        super(age, name);
        this.breed = "Дворняга";
    }

    public Dog (int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void sound() {
        System.out.println(name + " гавкает");
    }

    @Override
    public void move() {
        System.out.println(name + " ходит на лапах");
    }

    public void lick(Human human) {
        System.out.println(name + " лижет руку, принадлежащую " + human.getName());
    }

    public void lick(Human human, partOfHuman part) {
        System.out.println(name + " лижет " + part.getInRussian() + ", принадлежащую " + human.getName());
    }

}
