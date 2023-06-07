package hw9.cardGiver;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class CardsGiver {
    public static void main(String[] args) {
        giveMeSomeCards();

    }

    //First level: Дан массив, содержащий все возможные номиналы игральных карт: 6, 7, …, Король, Туз.
    //Дан массив, содержащий все возможные масти игральных карт: "Пик", "Треф", "Бубен", "Червей".
    //Пользователь вводит количество карт, которое ему нужно выдать.
    //Программа случайным образом выбирает из массивов значения номиналов и мастей и выводит требуемое количество карт на экран.

    static void giveMeSomeCards(){
        String[] cardsNumber = {"6","7","8","9","10","Валет","Дама","Король","Туз"};
        String[] cardsType = {"Пик", "Треф", "Бубен", "Червей"};

        Random random = new Random();

        Scanner in = new Scanner(System.in);
        System.out.println("Сколлько карт вы хотите взять");
        int cardsAmount = in.nextInt();

        String cardsArtikel = "";

        for (int i = 1; i <= cardsAmount; i++) {
            cardsArtikel = cardsNumber[random.nextInt(0,cardsNumber.length)] + " " + cardsType[random.nextInt(0,cardsType.length)];
            System.out.println("Номер карты " + i + ": " + cardsArtikel);

        }


    }

}
