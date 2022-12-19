public class Main {
    public static void main(String[] args) {

        Human максим = new Human("",-1988, "Минск","бренд-менеджером");
        Human аня = new Human("Аня", -1993 , " Москва","методистом образовательных программ");
        Human катя = new Human("Катя", 1992 , " Калининград","продакт-менеджером");
        Human артем = new Human("Артем", 1995 , " Москва","директором по развитию бизнеса");
        Human nulL = new Human(null,-1990,"",null);
        Human владимир = new Human("Владимир",2001,"Казань","не работает");
        System.out.println(максим.toString());
        System.out.println(аня.toString());
        System.out.println(катя.toString());
        System.out.println(артем.toString());
        System.out.println(nulL.toString());
        System.out.println(максим.getYearOfBirth());
        System.out.println(максим.getTown());
        System.out.println(владимир.toString());
        System.out.println(владимир.getTown());
        System.out.println(владимир.getYearOfBirth());

    }
}