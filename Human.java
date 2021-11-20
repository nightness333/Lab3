public class Human extends Person {

    private boxWithCandies box;
    private Person inventory;

    public Human (String name) {
        super(name);
    }

    public Human (int age, String name) {
        super(age, name);
    }

    @Override
    public void sound() {
        System.out.println(name + " говорит");
    }

    @Override
    public void move() {
        System.out.println(name + " ходит");
    }

    public void whisper() {
        System.out.println(name + " шепчет");
    }

    public void whisper(Person person) {
        System.out.println(name + " нашептывает что-то " + person.getName());
    }

    public void takeBoxWithCandies(boxWithCandies box) {
        this.box = box;
        if (box != null) {
            System.out.println(name + " получил коробку с конфетами под названием \"" + box.getName() + "\"");
        } else {
            System.out.println(name + " раздал все свои конфеты под названием \"" + box.getName() + "\"");
        }
    }

    public void giveBoxWithCandies(Human human) {
        if (box != null) {
            System.out.println(name + " отдал коробку с конфетами под названием \"" + box.getName() + "\" " + human.getName());
            human.takeBoxWithCandies(this.box);
            this.box = null;
        } else {
            System.out.println("У " + name + "а нет коробки с конфетами");
        }
    }

    public void countCandiesInBox() {
        if (box != null) {
            System.out.println(name + " насчитал " + box.getCounter() + " конфет в коробке с конфетами под названием \"" + box.getName() + "\"");
        } else {
            System.out.println("У " + name + " нет коробки с конфетами");
        }
    }

    public void giveCandy(Human human) {
        System.out.println(name + " дал одну конфету для " + human.getName());
    }

    public void giveCandies(Human ... humans) {
        if (humans.length - 1 <= box.getCounter()) {
            for (Human h : humans) {
                this.giveCandy(h);
            }
        } else {
            System.out.println(name + " не смог угостить всех людей, так как у него не хватило конфет");
        }
    }

    public int getCountCandies() {
        return box.getCounter();
    }

    public boolean hasBox() {
        return box != null;
    }

    public boolean thinkAboutHuman (Human human) {
        if (human.hasBox()) {
            if (name == "Гунилла" && human.getName() == "Карлсон") {
                System.out.println(name + " думает, что " + human.getName() + " раздаст конфеты");
                return true;
            } else if (human.getCountCandies() >= human.getRoom().getPersons().length - 1) {
                if (Math.random() > 0.5) {
                    System.out.println(name + " думает, что " + human.getName() + " раздаст конфеты");
                    return true;
                } else {
                    System.out.println(name + " думает, что " + human.getName() + " не раздаст конфеты");
                    return false;
                }
            } else {
                System.out.println(name + " думает, что " + human.getName() + " не раздаст конфеты, так как у " + human.getName() + " не хватает конфет");
                return false;
            }
        } else {
            System.out.println(name + " думает, что " + human.getName() + " не раздаст конфеты, так как у него нет коробки с конфетами");
            return false;
        }
    }

    public void doesWhatOtherThink (Human human, boolean think) {
        if (this.hasBox()) {
            if (name == "Карлсон" && human.getName() == "Гунилла") {
                System.out.println("Нет, он не раздал конфеты");
            } else if (Math.random() > 0.5) {
                if (think) {
                    System.out.println("Да, он раздал конфеты");
                    human.takeBoxWithCandies(null);
                } else {
                    System.out.println("Да, он не раздал конфеты");
                }
            } else {
                if (think) {
                    System.out.println("Нет, он не раздал конфеты");
                } else {
                    System.out.println("Нет, он раздал конфеты");
                    human.takeBoxWithCandies(null);
                }
            }
        } else {
            System.out.println("Да, он не раздал конфеты");
        }
    }

    public boolean hasInventory() {
        if (inventory != null) {
            return true;
        } else {
            return false;
        }
    }

    public void takeToInventory (Person p) {
        if (this.hasInventory()) {
            System.out.println("Руки заполнены");
        } else {
            this.inventory = p;
            System.out.println(name + " взял в руки " + p.getName());
        }
    }

    public void dropInventory() {
        if (this.hasInventory()) {
            this.inventory = null;
            System.out.println(name + " выпустил " + this.inventory.getName() + " из рук");
        } else {
            System.out.println("У " + name + " нет ничего в руках");
        }
    }

    public void dropInventory(partOfHuman part) {
        if (this.hasInventory()) {
            System.out.println(name + " положил " + this.inventory.getName() + " на " + part.getInRussian());
        } else {
            System.out.println("У " + name + " нет ничего в руках");
        }
    }

}
