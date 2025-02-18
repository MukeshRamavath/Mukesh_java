package com.tnsif.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<Laptop>();
		
		laps.add(new Laptop("dell",50000,5));
		laps.add(new Laptop("apple",100000,9));
		laps.add(new Laptop("hp",30000,2));
		
		Collections.sort(laps);
		for(Laptop l:laps) {
			System.out.println(l);
		}
	}
}

