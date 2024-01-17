package rvt;

public class Money{

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }
    public Money(){
        this.euros = 0;
        this.cents = 0;
    }
    public Money(int euros){
        this.euros = euros;
        this.cents = 0;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

public Money plus(Money addition) {

    int newEuros = this.euros + addition.euros;

    int newCents = this.cents + addition.cents;

    if (newCents >= 100){
        newCents -= 100;
        newEuros ++;
    }

    Money newMoney = new Money(newEuros, newCents); 

    return newMoney;
    }

    public Money plus(int euroAmount){

        int newEuros = this.euros + euroAmount;
        return new Money(newEuros);
    }

}