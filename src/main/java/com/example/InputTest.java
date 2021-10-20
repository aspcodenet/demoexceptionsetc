package com.example;

public class InputTest {

    public int getMinMaxInput(int min, int max){

        while(true){
            try {
                int sel = Integer.parseInt(System.console().readLine());
                if(sel >= min && sel <= max)
                    return sel;
            }
            catch(Exception ex){
                System.out.println("Mata in ett TAL tack!");    
            }
            System.out.println("Mata in mellan " + min + " och " + max);
        }
    }

    public void run(){
        System.out.println("1. Marta in bla bla");
        System.out.println("2. Skriv ut");
        System.out.println("3. dfjkdfs");
        System.out.println("4. Exit");
        int selection = getMinMaxInput(1, 4);
        if(selection == 1){
            System.out.println("aaa");
        }

    }
}
