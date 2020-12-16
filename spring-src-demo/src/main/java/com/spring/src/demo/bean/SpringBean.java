package com.spring.src.demo.bean;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author zxs
 * 2020/12/9
 */
@Component
@DependsOn(value = {"simpleBean"})
public class SpringBean implements SmartInitializingSingleton {

	@Autowired
	private SimpleBean simpleBean;

	public void sayHello(){
		System.out.println("hello");
	}

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("after init。。。。");
	}
}
