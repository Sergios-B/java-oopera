import java.util.ArrayList;

import person.*;
import show.*;

public class Theatre {
    public static void main(String[] args) {
        ArrayList<Actor> listOfActors = new ArrayList<>();
        Actor actorAlex = new Actor("Alex", "Gabe", Gender.MALE, 1.87);
        Actor actorBrus = new Actor("Brus", "Vilez", Gender.MALE, 1.80);
        Actor actorInna = new Actor("Inna", "Pinakolada", Gender.FEMALE, 1.57);

        Director directorBob = new Director("Bob", "Marly", Gender.MALE, 3);
        Director directorFinn = new Director("Finn", "Crisp", Gender.MALE, 5);

        Person choreographerEva = new Person("Eva", "Burn", Gender.FEMALE);
        Person authorKik = new Person("Kik", "Butovski", Gender.MALE);

        Show show = new Show("3 cats", 90, directorFinn, listOfActors);
        Opera opera = new Opera("Вольный стрелок", 180, directorBob, listOfActors, authorKik,
                "Одна из вершин немецкого романтизма и первая немецкая национальная опера.", 10);
        Ballet ballet = new Ballet("Тщетная предосторожность", 100, directorBob, listOfActors, authorKik,
                "Балет отличается комедийным характером, вызывая у зрителей смех и радость.", choreographerEva);

        show.newActor(actorAlex);
        show.newActor(actorBrus);
        opera.newActor(actorBrus);
        opera.newActor(actorAlex);
        ballet.newActor(actorInna);
        ballet.newActor(actorBrus);

        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        ballet.setActor(actorAlex, "Pinakolada");
        ballet.printListOfActors();

        opera.setActor(actorInna, "Ivanov");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
