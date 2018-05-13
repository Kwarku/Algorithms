package pl.narodzinyprograsmity;

public class Factorial {

    public int count(int num) {
        if (num < 1) {
            return 1;
        }else {
            return num * count(num - 1);
        }
    }
}
