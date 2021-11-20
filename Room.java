import java.sql.SQLOutput;
import java.util.ArrayList;

public class Room {

    private static int id_Counter = 1;
    private int id;
    private ArrayList<Person> persons = new ArrayList<Person>();

    public Room () {
        this.id = id_Counter;
        id_Counter++;
    }

    public Room (Person ... persons) {
        this.id = id_Counter;
        id_Counter++;
        for (Person p : persons) {
            this.addPerson(p);
            p.setRoom(this);
        }
    }

    public void addPerson (Person person) {
        this.persons.add(person);
        person.setRoom(this);
        System.out.println(person.getName() + " зашел в комнату " + this.id);
    }

    public Person[] getPersons() {
        Person[] persons_array = new Person[persons.size()];
        for (int i = 0; i < persons.size(); i++){
            persons_array[i] = persons.get(i);
        }
        return persons_array;
    }

    public void leaveHuman (Person person) {
        if (persons.contains(person)) {
            int index = persons.indexOf(person);
            persons.remove(index);
            System.out.println(person.getName() + " ушел из комнаты " + this.id);
            person.setRoom(null);
        } else {
            System.out.println(person.getName() + " нету в комнате");
        }
    }

    public boolean isInRoom (Person ... persons) {
        boolean flag = true;
        for (Person p : persons) {
            if (this.persons.contains(p) != true) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("Да, ");
            for (Person p : persons) {
                System.out.print(p.getName() + ",");
            }
            System.out.println(" в комнате");
            return true;
        } else {
            System.out.println("Нет, они не в комнате");
            return false;
        }
    }

    public boolean isOnlyInRoom (Person ... persons) {
        if (isInRoom(persons) && persons.length == this.persons.size()) {
            System.out.print("Да, только ");
            for (Person p : persons) {
                System.out.print(p.getName() + ",");
            }
            System.out.println(" в комнате");
            return true;
        } else {
            System.out.println("Нет, не только они в комнате");
            return false;
        }
    }

}
