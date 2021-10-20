package com.example;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSplitPaneUI;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Account acc = null;
        while(true){
            try{
                String s = System.console().readLine();
                acc = new Account("2478243234", s);
                break;
            }
            catch(Exception ex){
                System.out.println("Skriv in nåt namn");
            }

        }
        //acc.setName("Stefan Holmberg");

        WithdrawalStatus status = acc.withdraw(500);
        if(status == WithdrawalStatus.OK)
        {

        }
        else if(status == WithdrawalStatus.SALDO_TOO_LOW){

        }
        else if(status == WithdrawalStatus.MAX_BELOPP_300_PER_DAY){
            
        }

        while(true){
            String namn = System.console().readLine();
            if(acc.setName(namn) == true){
                break;
            }
            System.out.println("Skriv in igen tack");
    
        }
        





        InputTest test = new InputTest();
        test.run();



        execptionDemo();

        ArrayList<HockeyPlayer> players = new ArrayList<>();
        players.add(new HockeyPlayer("Mats Sundin", 51, "Toronto", PlayerPosition.Forward));
        players.add(new HockeyPlayer("Peter Forsberg", 48, "Colorado", PlayerPosition.Forward));
        // players.add(new HockeyPlayer("Pekka Lindmark", 63, "Malmö Redhawks", "Goalie"));
        // players.add(new HockeyPlayer("Anders Eldebrink", 59, "Södertälje SK", "Defence"));
        // players.add(new HockeyPlayer("Håkan Södergren", 60, "Djurgårdens IF", "Forward"));
        // players.add(new HockeyPlayer("Niklas Lidström", 51, "Detroit Red Wings", "Defence"));
        // players.add(new HockeyPlayer("Henrik Lundqvist", 40, "New York Rangers", "Goalie"));
        // players.add(new HockeyPlayer("Paul Coffey", 62, "Edmonton Oliers", "Defence"));
        

        // PlayerPosition inmatadPosition;
        // String s = System.console().readLine();
        // if(s.equalsIgnoreCase("forward") || s.equalsIgnoreCase("f"))
        //     inmatadPosition = PlayerPosition.Forward;
        // if(s.equalsIgnoreCase("goalie"))
        //     inmatadPosition = PlayerPosition.Goalie;


        for(HockeyPlayer player : players){
            if(player.getPosition() == PlayerPosition.Forward ){
                System.out.printf("%s, %s\n", player.getName(), 
                    player.getPosition()
                );
            }
        }        
        

        System.out.println("Hello World!");
    }

    private static void execptionDemo() {

        int tal = Integer.parseInt(System.console().readLine());













        // try
        // {
        //     int tal = Integer.parseInt(System.console().readLine());
        // }
        // catch(Exception ex){
        //     System.out.println(ex);
        // }
    }
}
