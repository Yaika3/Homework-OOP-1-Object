public class Human {

    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    Human(String name, int yearOfBirth, String town,String jobTitle){
        this.name = name;
        if ( this.name == null||name.isEmpty())
        { this.name = "Информация не указана";
            }
        else this.name = name;


        if (yearOfBirth >= 0) {
            this.yearOfBirth =yearOfBirth;}
        else {
            this.yearOfBirth=Math.abs(yearOfBirth);
        }
        this.town=town;
        if ( this.town == null||town.isEmpty())
        { this.town = "Информация не указана";
        }
        else this.town = town;

        this.jobTitle = jobTitle;
        if ( this.jobTitle == null||jobTitle.isEmpty())
        { this.jobTitle = "Информация не указана";
        }
        else this.jobTitle = jobTitle;}

    @Override
    public String toString() {
        return "Привет! Меня зовут " +
                name + "!" +
                " Я родился в  " + yearOfBirth + "."+
                " Я из города " + town + "." +
                " Я работаю " + jobTitle +
                " Будем знакомы!";
    }
}
