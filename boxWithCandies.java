public class boxWithCandies {

    private static int idCounter = 1;
    private String name;
    private int counter = 1;
    private int id;

    public boxWithCandies(String name) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
    }

    public void takeCandy() {
        this.counter++;
        System.out.println("Взята одна конфета в коробку с \"" + name + "\"");
    }

    public void takeCandies (int number) {
        this.counter += number;
        System.out.println("Положено " + number + " конфет в коробку с \"" + name + "\"");
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (counter >= 0) {
            this.counter = counter;
        } else {
            System.out.println("Недопустимое количество");
        }
    }
}
