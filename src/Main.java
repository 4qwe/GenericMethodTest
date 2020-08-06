import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Collection<String> stringerinos = new ArrayList<>();
        stringerinos.add("soso");
        stringerinos.add("soso2");
        stringerinos.add("soso3");


        liesVorWild(stringerinos);

        Collection<Integer> nurNummern = new ArrayList<>();
        nurNummern.add(01);
        nurNummern.add(02);
        nurNummern.add(03);

        String str = "Ein String für die Collection";
        Integer intForColl = 14;

        addAndReturn(str, stringerinos); //die methode funktioniert aber genau so mit (int, nurNummern)!

        addAndReturn(intForColl, nurNummern);
        liesVorWild(stringerinos);
        liesVorWild(nurNummern);



    }

    //eine Methode zum hinzufügen und zurückgeben eines Objects zu einer collection
    public static <T> void addAndReturn(T s, Collection<T> collection) {

        collection.add(s);
    }

    //eine Methode die jedes Element der Collection vorliest, unabhängig ob String oder Integer

    public static void liesVor(Collection<String> coll) { //o nein! die Methode geht nur mit String-Collection!!
        for (String s : coll) {
            System.out.println(s);
        }
    }

    public static void liesVorWild(Collection<?> coll) { //o ja! jetzt funktionieren auch andere Typen!!
        for (Object s : coll) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

}