package com.study.test.services.test1Service.impl

import com.study.test.services.test1Service.IAction
import org.springframework.stereotype.Component;

@Component
class Action implements IAction{

	@Override
	public void execute(String str) {
		println "groovy class say:hello"+str;
	}

}
