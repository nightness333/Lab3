public class Puppy extends Dog {

    public Puppy (String name) {
        super(name);
    }

    public Puppy (String name, String breed) {
        super(name, breed);
    }

    public Puppy (int age, String name) {
        super(age, name);
    }

    public Puppy (int age, String name, String breed) {
        super(age, name, breed);
    }

    @Override
    public void sound() {
        System.out.println(name + " тявкает");
    }

    @Override
    public void sleep() {
        if (isSleep == false) {
            System.out.println(name + " засыпает и посапывает");

            isSleep = true;
        } else {
            System.out.println(name + " уже спит");
        }
    }

}
