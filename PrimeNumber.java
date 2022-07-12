package week1.day2;

import java.util.Iterator;

public class PrimeNumber {
public static void main(String[] args) {
	int p=13;
	boolean flag = false;
	for(int i=2;i<=p/2;i++) {
		if (p%i==0) {
			flag = true;
			break;
		}
	}
	if (flag) {
		System.out.println("Not a prime number");
	}else {
		System.out.println("Is a prime number");
	}
	}
}
