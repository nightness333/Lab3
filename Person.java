public class Person {

    private static int id_Counter = 1;
    private int id;
    private Room room;
    protected int age;
    protected String name;
    protected boolean isSleep = false;

    public Person (String name) {
        id = id_Counter;
        id_Counter++;
        this.age = 5;
        this.name = name;
    }

    public Person (int age, String name) {
        id = id_Counter;
        id_Counter++;
        if (age < 0) {
            this.age = 5;
        } else {
            this.age = age;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return this.room;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void sound() {
        System.out.println(name + " издает звуки");
    }

    public void sleep() {
        if (isSleep == false) {
            System.out.println(name + " засыпает");
            isSleep = true;
        } else {
            System.out.println(name + " уже спит");
        }
    }

    public void wakeUp() {
        if (isSleep == true) {
            System.out.println(name + " просыпается");
            isSleep = false;
        } else {
            System.out.println(name + " уже бодрствует");
        }
    }

    public void move() {
        System.out.println(name + " двигается");
    }

    public void reactionToRoom() {
        Room thisRoom = this.getRoom();
        Person[] currentPersons = thisRoom.getPersons();
        Person theoreticalAlberg = new Person("tmp");
        boolean isAlbergHere = false;
        for (Person p : currentPersons){
            if (p.getName() == "Альберг") {
                isAlbergHere = true;
                theoreticalAlberg = p;
                break;
            }
        }
        if (this.getName() == "Малыш" && isAlbergHere) {
            if (thisRoom.isOnlyInRoom(this, theoreticalAlberg)) {
                System.out.println(name + " рад обстановке в комнате");
            }
            else {
                System.out.println(name + " не рад обстановке в комнате");
            }
        }
        else {
            if (Math.random() > 0.5) {
                System.out.println(name + " рад обстановке в комнате");
            } else {
                System.out.println(name + " не рад обстановке в комнате");
            }
        }
    }

    public static boolean equals(Person p1, Person p2) {
        if (p1.getId() == p2.getId()) {
            return true;
        } else {
            return false;
        }
    }
}
