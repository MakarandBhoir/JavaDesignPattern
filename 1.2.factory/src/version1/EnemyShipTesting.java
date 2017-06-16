package version1;

import java.util.Scanner;


public class EnemyShipTesting {

    public static void main(String[] args) {

        // old way (direct inheritance at compile time)
        EnemyShip ufoShip = new UFOEnemyShip();
        doStuffEnemy(ufoShip);

        // dynamic way.
        // creation is closely tied to the program
        EnemyShip dynamicShip = null;
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship (U / R)");

        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
        }

        if (enemyShipOption.equals("U")) {
            dynamicShip = new UFOEnemyShip();
        } else {
            dynamicShip = new RocketEnemyShip();
        }

        doStuffEnemy(dynamicShip);

        // Factory pattern way
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip shipToBuild = null;

        System.out.println("What type of ship (U / R / B)");
        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();

            shipToBuild = shipFactory.makeEnemyShip(typeOfShip);
        }

        if (shipToBuild != null) {
            doStuffEnemy(shipToBuild);
        } else {
            System.out.println("error");
        }

    }

    private static void doStuffEnemy(EnemyShip enemyShip) {

        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();

    }

}
