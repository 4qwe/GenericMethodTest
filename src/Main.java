import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Collection<String> stringerinos = new ArrayList<>();
        stringerinos.add("soso");
        stringerinos.add("soso2");
        stringerinos.add("soso3");


        for (Object susu : stringerinos) {
            System.out.println(susu);
        }

        Collection<Integer> nurNummern = new ArrayList<>();
        nurNummern.add(01);
        nurNummern.add(02);
        nurNummern.add(03);

        String str = "Ein String für die Collection";
        Integer intForColl = 14;

        addAndReturn(str, stringerinos); //die methode funktioniert aber genau so mit (int, nurNummern)!

        for (Object susu : stringerinos) {
            System.out.println(susu);

        }

    }

    //eine Methode zum hinzufügen und zurückgeben eines Objects zu einer collection
    public static <T> T addAndReturn(T s, Collection<T> collection) {

        collection.add(s);
        return s;
    }

}