package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerPlayer implements Player{

    Scanner scanner = new Scanner(System.in);
    Logger logmachine = LoggerFactory.getLogger( "Player");
    //private int tab[] = new int[100];

    private ArrayList<Long> list = new ArrayList<Long>();
    private int f;
    private int l;
    private int mid;

    public ComputerPlayer(){


        for (long i = 0; i < 100; i++) {
            list.add(i);
        }
        f = 0;
        l = 100 - 1;
        mid = 100/2;
    }

    @Override
    public long askNextGuess() {

        logmachine.log(list.get(mid) + " est le chiffre choisie par la machine \n");
        return list.get(mid);
    }

    @Override
    public void respond(boolean lowerOrGreater) {


        if(lowerOrGreater){
            logmachine.log("c est plus grand ! \n");
            f = mid + 1;
        }
        else{
            logmachine.log("c est plus petit ! \n");
            l = mid - 1;
        }

        mid = (f + l)/2;
    }

}
