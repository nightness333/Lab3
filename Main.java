public class Main {
    public static void main(String[] args) {
        Human Gunilla = new Human (15, "Гунилла");
        Human Karlson = new Human (18, "Карлсон");
        Human Krister = new Human (13, "Кристер");
        Human Malish = new Human (6, "Малыш");
        Human Kid1 = new Human ("Ребенок 1");
        Human Kid2 = new Human ("Ребенок 2");
        Human Kid3 = new Human ("Ребенок 3");
        Human Kid4 = new Human ("Ребенок 4");
        Human Kid5 = new Human ("Ребенок 5");
        Human[] Kids = {Kid1, Kid2, Kid3, Kid4, Kid5};
        Puppy Alberg = new Puppy (1, "Альберг", "Лабрадор");
        Room room = new Room (Gunilla, Karlson, Krister, Malish, Alberg);
        for (Person p : Kids) {
            room.addPerson(p);
        }
        boxWithCandies box1 = new boxWithCandies("входные конфеты");
        Gunilla.takeBoxWithCandies(box1);
        box1.takeCandies(10);
        Gunilla.giveBoxWithCandies(Karlson);
        boolean humanThinks = Gunilla.thinkAboutHuman(Karlson);
        Karlson.doesWhatOtherThink(Gunilla, humanThinks);
        Karlson.countCandiesInBox();
        for (Person p : Kids) {
            room.leaveHuman(p);
        }
        room.leaveHuman(Gunilla);
        room.leaveHuman(Krister);
        room.leaveHuman(Karlson);
        Malish.reactionToRoom();
        Malish.takeToInventory(Alberg);
        Malish.dropInventory(partOfHuman.KNEES);
        Malish.whisper(Alberg);
        Alberg.lick(Malish, partOfHuman.FACE);
        Alberg.sleep();
    }
}
