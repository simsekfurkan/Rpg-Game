import java.util.Scanner;

public class Player {
    private  int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);

    public Player(String name){
        this.name = name;
    }

    public void selectChar(){
       GameChar[] charList = {new Knight(),new Archer(),new Samurai()};
       System.out.println("-----------------------------");
       for(GameChar gameChar : charList){
           System.out.println("Id: \t"+ gameChar.getId() +"Karakter:\t" + gameChar.getName() +  " Hasar:\t" + gameChar.getDamage() + " Can:\t" + gameChar.getHealth() + " Para:\t" + gameChar.getMoney());
       }
       System.out.println("-----------------------------");
         System.out.println("Lütfen bir karakter seçiniz:");
         int selectChar = input.nextInt();
         switch (selectChar){
             case 1:
               initPlayer(new Samurai());
                break;

             case 2:
                    initPlayer(new Archer());
                    break;

             case 3:
                    initPlayer(new Knight());
                    break;
             default:
                    initPlayer(new Samurai());
         }
            System.out.println("Seçtiğiniz karakter: " + this.getCharName() + "\tHasar" + this.getDamage() + "\tSaglık\t" + this.getHealth() + "\tPara\t" + this.getMoney());

    }

    public  void  initPlayer(GameChar gameChar){
        this.damage = gameChar.getDamage();
        this.health = gameChar.getHealth();
        this.money = gameChar.getMoney();
        this.charName = gameChar.getName();
    }







    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
