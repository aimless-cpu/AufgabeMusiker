import com.company.*;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Max", "Muster", 10);
        Artist a1 = new Artist("MAXI", "Max", "Muster", 10);

        Musician m1 = new Musician("M","Muh","Muster",50);

        GuitarPlayer g1 = new GuitarPlayer("M","Max","Muster",40);
        BasePlayer b1 = new BasePlayer("M","Max","Muster",40);

        m1.makeMusic();
        g1.makeMusic();
        b1.makeMusic();
        p1.makeMusic();




        extracted();


        //p1.setAge(-100);
        //System.out.println(p1.getAge());







	// write your code here
    }

    private static void extracted() {
        System.out.println("test");
    }
}
