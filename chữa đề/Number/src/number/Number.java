/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Number {
    private int value;
    private int min;
    private int max;

    public Number() {
    }

    
    public Number(int value, int min, int max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Number{" + "value=" + value + ", min=" + min + ", max=" + max + '}';
    }
    
    public boolean isPrime (){
        if (value < 2)
            return false;
        for (int i=2; i<=Math.sqrt(value);i++)
        {
            if (value%i==0)
                return false;
        }
        return true;
    }
    
    
    
}
