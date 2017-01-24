
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {
        Money money = new Money(this.euros + added.euros, this.cents + added.cents);

        return money;
    }

    public boolean less(Money compared){
        return (100 * this.euros + this.cents) < (100 * compared.euros + compared.cents);
    }

    public Money minus(Money decremented) {
        int subOfEuro = this.euros - decremented.euros;
        int subOfCents = this.cents - decremented.cents;

        if(subOfCents < 0) {
            subOfCents+=100;
            subOfEuro--;
        }

        if(subOfEuro < 0) {
            return new Money(0,0);
        }

        return new Money(subOfEuro, subOfCents);

    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }


    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
