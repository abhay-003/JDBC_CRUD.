
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        db s = new db();

        Scanner sc = new Scanner(System.in);
       while(true) {
           System.out.println("1. Insert, 2. Read, 3. Update, 4. Delete");
           int choice = sc.nextInt();
           if (choice < 1 || choice > 4) break;
           switch (choice) {
               case (1):
                   System.out.println("id , name , email , salary");
                   int id = sc.nextInt();
                   sc.nextLine();
                   String nm = sc.nextLine();
                   String em = sc.nextLine();
                   int sly = sc.nextInt();
                   s.insert(id, nm, em, sly);

                   break;

               case (2):
                   s.read();
                   break;

               case (3):
                   System.out.println("id ,name ");
                   int i = sc.nextInt();
                   sc.nextLine();
                   String sm = sc.nextLine();
                   s.update(i, sm);
                   break;
               case (4):
                   System.out.println("id");
                   int a = sc.nextInt();
                   s.delete(a);
                   break;


           }

       }
    }
}