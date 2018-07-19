package com.hand.ImplClass;

import com.hand.Interface.ProcessList;

import java.util.*;

public class ListOfThreeFactory implements ProcessList {

	private  static ListOfThreeFactory instancce=new ListOfThreeFactory();

	private ListOfThreeFactory(){}

	public static ListOfThreeFactory getInstancce(){
		return instancce;
	}

	@Override
	public void prepare() {
		List<Integer> sign=new ArrayList<>();
		List<Integer> numbers=new ArrayList<>();
		Map<Integer,List<Integer>> map = new HashMap<>();

		for(int i=0;i<50;i++){
			numbers.add((int)(Math.random()*100));
		}

		numbers.stream().forEach(integer -> {
			int key=integer/10;
			if(map.get(key)==null){
				map.put(key,new ArrayList<Integer>());
				sign.add(key);
			}else{
				map.get(key).add(integer);
			}
		});

		Collection<List<Integer>> list =map.values();
		Iterator<List<Integer>> integerIterator = list.iterator();
		while(integerIterator.hasNext()){
			ProcessImpl.getInstance().process(integerIterator.next());
		}

		for(int i=0;i<sign.size();i++){
			System.out.println(map.get(sign.get(i)).toString());
		}
	}
	@Override
	public void process(List l) {

		}
}
