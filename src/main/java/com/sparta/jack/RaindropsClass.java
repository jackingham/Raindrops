package com.sparta.jack;

public class RaindropsClass {

    public String raindrops(int n){
        StringBuilder builder = new StringBuilder();
        if (n % 3 == 0){
            builder.append("Pling");
        }
        if (n % 5 == 0){
            builder.append("Plang");
        }
        if (n % 7 == 0){
            builder.append("Plong");
        }
        if (builder.length() == 0){
            return Integer.toString(n);
        } else {
            return builder.toString();
        }
    }
}
