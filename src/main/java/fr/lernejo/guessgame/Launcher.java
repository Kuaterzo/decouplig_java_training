package fr.lernejo.guessgame;

import java.security.SecureRandom;
import java.util.Scanner;
import java.sql.Date;

public class Launcher {
    public static void main(String[] args) {
        Player player;
        Simulation simulation;
        SecureRandom random;
        long randomNumber;




        switch (args[0]) {

            case "-interactive":

                player = new HumainPlayer();
                simulation = new Simulation(player);
                random = new SecureRandom();
                // long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
                randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
                simulation.initialize(randomNumber);
                simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);



                break;


            case "-auto":

                player = new ComputerPlayer();
                simulation = new Simulation(player);
                random = new SecureRandom();
                // long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
                randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
                simulation.initialize(randomNumber);
                simulation.loopUntilPlayerSucceed(Long.parseLong(args[1]));


                break;
        }
    }


}
