package competition;
import java.util.LinkedList;
import java.util.Random;


/**
 * Created by dominika on 08.01.18.
 * Zadanie o ślepych myszkach łucznikach:
 6 ślepych myszek zrobiło sobie zawody łucznicze
 Są 3 tury i każda mysza strzela tylko raz na daną turę
 Wypisz mysz, która zdobyła najwięcej punktów (najwięcej to 10 za strzał a najmniej to 0 czyli pudło). Maksimum sumy punktów dla myszki to 30 (bo są 3 tury).
 Strzały do celu losuj
 Jako komunikat końcowy możesz wypisać: "Nagrode mysiego króla - złoty ser- wygrywa: (imie myszy)
 */

public class Mouse {


  String name;

    public Mouse(String name){
        this.name = name;
    }

    // public String getName(){return name;}
    // public void setName(String name){this.name = name;}
        public Mouse(){}

    public int RandomNumber() {
        int number;
        Random generator = new Random();
        number = generator.nextInt(10);
        return number;
    }

    public LinkedList RandomNumbers(){

        LinkedList numbers = new LinkedList();
        Random generator = new Random();

        for(int i =0; i<3; i++){

            int rand = generator.nextInt(10);
            numbers.add(rand);

        }
        return numbers;
    }

    public int sumOfNumbers(LinkedList shots){

        int sum = 0;
        for(int i=0;i<shots.size(); i++){
            sum = sum + (int)shots.get(i);
        }

        return sum;
    }
    public int victory(int a, int b, int c) {

      int winner = 0;

        if (a > b && a > c) {
            winner = 1;
            return winner;
        } else if (b > a && b > c) {
            winner = 2;
            return winner;
        } else if (c > a && c > b) {
            winner = 3;
            return winner;
        }
        return winner;
    }

}
