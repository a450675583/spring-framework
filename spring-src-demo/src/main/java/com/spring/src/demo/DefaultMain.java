package com.spring.src.demo;

import com.spring.src.demo.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * demo test
 * @author zxs
 * 2020/12/9
 */
public class DefaultMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.spring");
		SpringBean bean = applicationContext.getBean(SpringBean.class);
		bean.sayHello();
	}
}
