public class Animal extends Person {

    public Animal (String name) {
        super(name);
    }

    public Animal (int age, String name) {
        super(age, name);
    }

    @Override
    public void sound() {
        System.out.println(name + " издает звуки животного");
    }

}
