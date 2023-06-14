import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Ayi Bogan Reco");
        vector.add("Resul");
        vector.add("Yahya");
        vector.add("Reis");
        vector.add(2,"Su Aygiri");
        Iterator<String> itr=vector.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
