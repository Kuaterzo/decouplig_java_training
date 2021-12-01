package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumainPlayer implements Player{

    Scanner scanner = new Scanner(System.in);
    Logger log = LoggerFactory.getLogger( "Player");


    @Override
    public long askNextGuess() {

        System.out.print("Ecrire un nombre: ");

        //Lit l'entier écrit par l'utilisateur et l'affecte
        // à  la variable nombre du programme
        long nombre = scanner.nextInt();
        // Affiche le nombre saisit par l'utilisateur
        return nombre;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

            if(lowerOrGreater){
                System.out.print("c est plus! \n");
            }
            else{
                System.out.print("c est moin! \n");
            }
    }
}
