package com.hand;

import java.util.HashMap;
import java.util.Map;

/**
 * 计算工资类
 */
public class ComputeSalary {

	private static ComputeSalary instance=new ComputeSalary();

	private Map<String,Integer> info=new HashMap<>();

	private ComputeSalary(){
		this.info.put("userA",5000);
		this.info.put("userB",10000);
		this.info.put("userC",15000);
		this.info.put("userD",60000);
	}

	public static ComputeSalary getInstance(){
		if(instance!=null){
			return instance;
		}
		return null;
	}

	public double compute(int money){
		int temp=money-3500;
		if(temp>1500&&temp<=4500){
			return 3500+temp*0.9;
		}else if(temp>4500&&temp<=9000){
			return 3500+temp*0.8;
		}else if(temp>9000&&temp<=35000){
			return 3500+temp*0.75;
		}else if(temp>35000&&temp<=55000){
			return 3500+temp*0.7;
		}else if(temp>55500&&temp<=80000){
			return 3500+temp*0.65;
		}else if(temp>80000){
			return 3500+temp*0.55;
		}else if(temp<=1500){
			return 3500+temp*0.97;
		}
		return 0;
	}

	public void out(){
		System.out.println("userA"+"薪资为： "+compute(info.get("userA")));
		System.out.println("userB"+"薪资为： "+compute(info.get("userB")));
		System.out.println("userC"+"薪资为： "+compute(info.get("userC")));
		System.out.println("userD"+"薪资为： "+compute(info.get("userD")));
	}
}
