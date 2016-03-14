package com.sushil.sob.gen;

import java.util.Set;

import java.util.Random;

import java.util.HashSet;

public class Generator {

Random r;
int length;
Set<String> seen;

public Generator(int l){
    seen = new HashSet<String>();
    length = l;
    r = new Random();
    r.setSeed(System.currentTimeMillis());
}

public String generate(){   
    String retval = "";
    int i = 0;
    while(i<length){
        int rand = r.nextInt(93)+33;
        if(rand!=96){
            retval+= (char)rand;
            i++;
        }
    }
    return retval;
}

public String generateNoRepeat(){
    String retval;
    int i;
    do{
        retval ="";
        i = 0;
        while(i<length){
            int rand = r.nextInt(93)+33;
            if(rand!=96){
                retval+= (char)rand;
                i++;
            }
        }
    }while(!seen.add(retval));
    return retval;
}
}