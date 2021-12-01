package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;

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

    public void loopUntilPlayerSucceed() {
        //TODO implement me

        while (!nextRound()){

        }

    }
}
