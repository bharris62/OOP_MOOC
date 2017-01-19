/**
 * Created by blakebharris on 1/18/2017.
 */
public class Counter {
    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check){
            this.number=startingValue;
            this.check = check;
    }

    public Counter(){
        this(0);
    }

    public Counter(int startingValue){
        this(startingValue, false);
    }


    public Counter(boolean check){
        this(0, check);
    }

    public int value(){
        return this.number;
    }

    public void increase(){
        this.increase(1);
    }

    public void decrease(){
        if(this.check == true) {
            if(this.number > 0) {
               this.number--;
            }
        } else {
            this.number--;
        }
    }

    public void increase(int incraseAmount){
        if(incraseAmount >= 0) {
            this.number += incraseAmount;
        } else {
            return;
        }
    }

    public void decrease(int decreaseAmount){
        if (decreaseAmount < 0) {
            return;
        }

        if(this.check ==false && decreaseAmount > 0) {
            this.number -= decreaseAmount;
        }else {
            this.number = 0;
        }
    }
}

