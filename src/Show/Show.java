package Show;

import java.util.ArrayList;

import Person.*;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors() {
        System.out.println("Список актеров:");
        for (Actor x : listOfActors) {
            System.out.println(x.toString());
        }
    }

    public void newActor(Actor actor) {
        boolean inList = false;
        for (Actor x : listOfActors) {
            if (x.equals(actor)) {
                inList = true;
            }
        }
        if (inList) {
            System.out.println("Предупреждающее сообщение! Такой огурчик уже в баночке!");
        } else {
            listOfActors.add(actor);
            System.out.println("Добавлен новый актер: " + actor.toString());
        }

    }

    public void setActor(Actor actor, String surname) {
        boolean change = false;
        for (Actor x : listOfActors) {
            if (x.getSurname().equals(surname)) {
                listOfActors.set(listOfActors.indexOf(x), actor);
                change = true;
                System.out.println(x.toString() + "заменен на " + actor.toString());
                break;
            }
        }
        if (!change) System.out.println("Такого огурчика тут нет");
    }
}