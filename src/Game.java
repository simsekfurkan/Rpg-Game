import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
           public void start(){
                System.out.println("Maceraya hoşgeldin!");
                System.out.println("Lütfen bir isim giriniz:");
                String playerName = input.nextLine();
                Player player = new Player(playerName);
                System.out.println("Sayın " + player.getName()+" Bu karanlık dünyaya hoşgeldiniz");
                System.out.println("Bir karakter seçiniz.");
                player.selectChar();

           }


}
