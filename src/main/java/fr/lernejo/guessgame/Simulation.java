package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me

        long UserImpute = player.askNextGuess();
        if (UserImpute == numberToGuess) {

            logger.log("c'est le bon chiffre bravo ! :D ");
            return true;
        } else {
            logger.log("faux, essaye encore !  ");

            if(UserImpute > numberToGuess){
                player.respond(false);
            }
            else {
                player.respond(true);
            }

            return false;
        }
    }

    public void loopUntilPlayerSucceed(long iteration) {
        //TODO implement me

        long i = 0;
        boolean verification = false;

        long timestampDeb = System.currentTimeMillis();

        while (i <= iteration){

            verification = nextRound();

            if(verification){
                i = iteration;
            }
            i++;
        }

        logger.log("end \n");

        if(verification){
            logger.log("bravo t'a trouvée, c'est gagnée! :D \n Le nombre était " + numberToGuess);
        }
        else{
            logger.log("c'est pas ça c'est perdu. :( \n Le nombre était " + numberToGuess);
        }

        long timestampFin = System.currentTimeMillis();
        long timestampMS = timestampFin - timestampDeb;
        String now = new SimpleDateFormat("mm:ss.SS").format(new Date(timestampMS));
        logger.log(" sa a duree :" + now);

    }
}
