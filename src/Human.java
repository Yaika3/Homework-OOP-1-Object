public class Human {

    String name;
    int yearOfBirth;
    String town;
    String jobTitle;
    Human(String name, int yearOfBirth, String town,String jobTitle){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;

    }

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
