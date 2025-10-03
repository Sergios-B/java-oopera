package Person;

public class Director extends Person {
    int numberOfShows;

    public Director(String name, String surname, gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
}
