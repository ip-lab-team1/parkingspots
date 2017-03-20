package com.ip.parkingspots;
import java.util.Array;
import java.util.ArrayList;

public class PersonDb {

    public ArrayList<Person> myPerson;

    public PersonDb() {
        myPerson = new ArrayList<Person>();
    }

    public addPerson(Person person) {
        myPerson.add(myPerson.size(), person);
    }

    public removePerson(Person person){
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person person2 = it.next();
            if (person2.equals(person)) {
                it.remove();
            }
        }
    }
}