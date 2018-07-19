package com.hand.ImplClass;

import com.hand.Interface.ProcessList;

import java.util.List;

public class ProcessImpl implements ProcessList {
	@Override
	public void prepare() {

	}

	public static ProcessList getInstance(){
		return new ProcessImpl();
	}

	@Override
	public void process(List l) {
		for(int i=0;i<l.size();i++){
			int temp=(int)l.get(i);
			for(int j=i;j<l.size();j++){
				int tempj=(int)l.get(j);
				if(tempj<temp){
					l.remove(i);
					l.add(i,tempj);
					l.remove(j);
					l.add(j,temp );
				}
			}
		}
	}
}
