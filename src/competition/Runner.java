package competition;

import java.util.LinkedList;

/**
 * Created by dominika on 08.01.18.
 */
public class Runner {

    public static void main(String[] args) {

        Mouse mouse1 = new Mouse("Karol");
        Mouse mouse2 = new Mouse("Bogdan");
        Mouse mouse3 = new Mouse("Julek");
        Mouse mouse0 = new Mouse();
        LinkedList shotsMouse1 = mouse1.RandomNumbers();
        LinkedList shotsMouse2 = mouse2.RandomNumbers();
        LinkedList shotsMouse3 = mouse3.RandomNumbers();
        System.out.println(shotsMouse1);

        int mouse1sum = mouse1.sumOfNumbers(shotsMouse1);
        int mouse2sum = mouse2.sumOfNumbers(shotsMouse2);
        int mouse3sum = mouse3.sumOfNumbers(shotsMouse3);

        System.out.println("Suma strzałów pierwszej z myszy " + mouse1sum);
        System.out.println("Suma strzałów drugiej z myszy " + mouse2sum);
        System.out.println("Suma strzałów trzeciej z myszy " + mouse3sum);

        int mouseWinner = mouse0.victory(mouse1sum, mouse2sum, mouse3sum);

        if(mouseWinner == 1){
            System.out.println("Nagrode mysiego króla - złoty ser- wygrywa:" + mouse1.name);
        }
        else if(mouseWinner == 2){
            System.out.println("Nagrode mysiego króla - złoty ser- wygrywa:" + mouse2.name);
        }
        else if(mouseWinner == 3){
            System.out.println("Nagrode mysiego króla - złoty ser- wygrywa:" + mouse3.name);
        }

    }
}
