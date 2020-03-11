import list.*;

/**
 * Implementasi Linkedlist di java
 * 
 * @author Aqil Fiqran Dzi'Ul Haq
 * @since 10-Maret-2020
 */
public class Main {
    public static void main(String a[]) {
        Linkedlist ll = new Linkedlist();

        ll.add(new Data("tes"));
        ll.add(new Data("aqil"));
        ll.add(new Data("fiqran"));
        ll.delete("tes");
        ll.display();
    }
}