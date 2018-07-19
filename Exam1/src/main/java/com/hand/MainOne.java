package com.hand;

import java.util.ArrayList;
import java.util.List;

public class MainOne {
	public static void main(String[] args) {
		new MainOne().computeSu();
	}

	/**
	 * 计算素数
	 */
	public void computeSu(){
		List<Integer> list = new ArrayList<>();
		int count=0;

		for(int i=0;i<100;i++){
			if(!isHasOther(101+i)){
				count++;
				list.add(101+i);
			}
		}

		System.out.println("101-200间总共有"+count+"个素数,分别是："+list.toString());

	}

	public boolean isHasOther(int self){
		for(int i=2;i<self;i++){
			if(self%i==0){
				return true;
			}
		}
		return false;
	}
}
