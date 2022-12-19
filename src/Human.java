public class Human {

    String name;
    private int yearOfBirth;
    private String town;
    String jobTitle;

    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void seYearOfBrith(int yearOfBirth){
        if (yearOfBirth >= 0) {
            this.yearOfBirth =yearOfBirth;}
        else {
            this.yearOfBirth=Math.abs(yearOfBirth);
        }
    }
    // Спросил у ребят,кто как сделал...по их ответам,никак.   Нельзя сравнить int по null, Empty. (можно в строку переделать,Но тогда на <0, не проверить)
    //Так же на empty не проверить int , так как если не заполнить поле то все ломается,а в кавычках число не пишется)
    public String getTown(){
        return town;
    }
    public void setTown( String town){
        this.town=town;
        if ( this.town == null||town.isEmpty())
        { this.town = "Информация не указана";
        }
        else this.town = town;
    }


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
