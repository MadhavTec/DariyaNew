package com.tutorial.first;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BuyingTicket {
	
	static long waitingTime(int[] tickets, int p) {
		long times = 0;
	    int[] temp = Arrays.copyOf(tickets, tickets.length);
	    for(int i = 0; i < tickets.length; i++ ) {
	       temp[i] = tickets[i] - tickets[p];
	    }
	    for(int i = 0; i < tickets.length; i++ ) {
	       if(temp[i] < 0) times += tickets[i];
	       else {
	          if(i <= p) times += tickets[p];
	          else times += tickets[p] - 1;
	       }
	    }
	    return times;
	}
	
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] tickets = new int[t];
		for(int i = 0; i<t; i++) {
			tickets[i] = sc.nextInt();
		}
		int p = sc.nextInt();
		sc.close();
		System.out.println(waitingTime(tickets, p));
	}
}
