package com.java.phoenix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PlayingCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Ace");
		list.add("2"); list.add("3"); list.add("4"); list.add("5"); list.add("6"); list.add("7");
		list.add("8"); list.add("9"); list.add("10"); list.add("J"); list.add("Q"); list.add("K");
		System.out.println("Before Playing Cards"+ list);
			//List shuffledlist =PlayingCards.shuffle(list);
			//List l1 = PlayingCards.shuffle(shuffledlist);
			//System.out.println("New shuffled list "+l1);
			PlayingCards.cut(list, 9);
	}

	public  static List shuffle(List<String> list){
		
		//Collections.shuffle(list);
		//System.out.println("After Playing Cards"+ list);
		
		Random random = new Random();
		String next = "";
		for(int i=0;i<list.size();i++) {
			int randomIndex = random.nextInt(13);
			String found = list.get(randomIndex);
			if(randomIndex+1 == list.size()) {
				 next = list.get(randomIndex -2 );
			} else {
				 next = list.get(randomIndex+1);
			}
			System.out.println("Found "+found+"Next "+next);
			String temp = found;
			found = next;
			next = temp;
			list.remove(randomIndex);
			list.add(randomIndex, found);
			if(!(randomIndex+1 == list.size())) {
				list.remove(randomIndex+1);
				list.add(randomIndex+1, next);
			}
			else {
				list.remove(randomIndex-2);
				list.add(randomIndex-2, next);
			}
			System.out.println("Found "+found+"Next "+next);
			
		}
		System.out.println("New list "+list);
		return list;
	}
	public static void cut(List list, int cardNumber){
		List topList = list.subList(cardNumber, list.size());
		System.out.println(list.size());
		List bottomList = list.subList(0, cardNumber);
		//list.clear();
		//System.out.println("Before"+list);
		List finalList = new ArrayList();
		finalList.addAll(topList);
		finalList.addAll(bottomList);
		System.out.println("FinalList"+finalList);
		
	}

}
