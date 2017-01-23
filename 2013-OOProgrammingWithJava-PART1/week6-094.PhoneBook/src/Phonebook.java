import java.util.ArrayList;

/**
 * Created by blakebharris on 1/22/2017.
 */
public class Phonebook {
    private ArrayList<Person> phonebook;

    public Phonebook(){
        this.phonebook = new ArrayList<>();
    }

    public void add(String name, String number) {
        Person toAdd = new Person(name, number);
        phonebook.add(toAdd);
    }

    public void printAll() {
        for(Person person : phonebook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name){
        for (Person person : phonebook) {
            if(person.getName().contains(name)) {
                return person.getNumber();
            }
            return "number not known";
        }

        return "";
    }
}
