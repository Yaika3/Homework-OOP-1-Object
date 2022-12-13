public class Main {
    public static void main(String[] args) {

        Human максим = new Human("",-1988, "Минск","бренд-менеджером");
        Human аня = new Human("Аня", -1993 , " Москва","методистом образовательных программ");
        Human катя = new Human("Катя", 1992 , " Калининград","продакт-менеджером");
        Human артем = new Human("Артем", 1995 , " Москва","директором по развитию бизнеса");
        Human nulL = new Human(null,-1990,"",null);
        System.out.println(максим.toString());
        System.out.println(аня.toString());
        System.out.println(катя.toString());
        System.out.println(артем.toString());
        System.out.println(nulL.toString());

    }
}