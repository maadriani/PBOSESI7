import java.util.*;

public class CollectionPrinter {
    
    public static <E> void printerCollection(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }
}
