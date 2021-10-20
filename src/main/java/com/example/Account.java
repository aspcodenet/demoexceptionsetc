package com.example;

public class Account {
    private String kontonummer;
    private String namn;
    private int saldo;

    public Account(String kontonummer, String namn) throws Exception {
        super();
        this.kontonummer = kontonummer;
        if(setName(namn) == false){
            throw new Exception("Fel");
        }
    }

    public WithdrawalStatus withdraw(int belopp){
        if(belopp > 3000) return WithdrawalStatus.MAX_BELOPP_300_PER_DAY;
        if(belopp > saldo) return WithdrawalStatus.SALDO_TOO_LOW;
        saldo = saldo - belopp;
        return WithdrawalStatus.OK;

    }

    public boolean setName(String namn){
        if(namn.length() < 3){
            return false;
        }
        else {
            this.namn = namn;
            return true;
        }
    }
}
