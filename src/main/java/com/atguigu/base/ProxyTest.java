package com.atguigu.base;

import com.atguigu.base.aop.Calculator;
import com.atguigu.base.aop.LogUtil;
import com.atguigu.base.aop.MyMathCalculator;
import com.atguigu.base.aop.ProxyFactory;
import com.atguigu.base.entity.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyTest {

    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("tx.xml");
//    ClassPathXmlApplicationContext ioc = null;
    @Test
    public void test(){
        // 动态代理实现日志增强
        MyMathCalculator myMathCalculator = new MyMathCalculator();
        ProxyFactory<Calculator> proxyFactory = new ProxyFactory<Calculator>();
        Calculator proxyInstance = proxyFactory.getProxyInstance(myMathCalculator);
        int add = proxyInstance.add(1, 2);
        System.out.println(add);
    }

    @Test
    public void test1(){
        Person person =(Person) ioc.getBean(Person.class);
        System.out.println(person.toString());
        Calculator myMathCalculator = ioc.getBean(Calculator.class);
        System.out.println(myMathCalculator.add(1,2));
    }

    /**
     * 当xml配置了Class相同的多个bean时出现的问题
     * NoUniqueBeanDefinitionException: No qualifying bean of type 'com.atguigu.base.entity.Person'
     * available: expected single matching bean but found 2: person,person02
     */
    @Test
    public void testMultiBean(){
//        Person bean = ioc.getBean(Person.class);
        Person person02 = ioc.getBean("person02", Person.class);
        System.out.println(person02.getName()+person02.getAge());
    }

    /**
     * 利用构造器去填充属性
     * <constructor_arg></constructor_arg>
     * 实例类需要对应的构造器才可以
     *
     * 信息抽象了 abstract = true 不能被实例化了，只能被继承
     */
    @Test
    public void testConstructBean(){
        Person person02 = ioc.getBean("personCst", Person.class);
        System.out.println(person02.getName()+"===="+person02.getAge());
    }

    /**
     * p 名称空间的使用
     */
    @Test
    public void testPNameSpaceBean(){
        Person personPns = ioc.getBean("personPns", Person.class);
        System.out.println(personPns.toString());
    }

    /**
     * 复杂属性的赋值和bean之间的定义信息继承
     */
    @Test
    public void testBeanCar(){
        Person personCar = ioc.getBean("personCar", Person.class);
        System.out.println(personCar.toString());
    }

    // list
    @Test
    public void testBeanList(){
        Person personList = ioc.getBean("personList", Person.class);
        System.out.println(personList.toString());
    }

    // map
    @Test
    public void testBeanMap(){
        Person personMap = ioc.getBean("personMap", Person.class);
        System.out.println(personMap.toString());
    }


    // Properties  util:map 级联属性用于被修改
    @Test
    public void testBeanProperties(){
        Person personPrp = ioc.getBean("personPrp", Person.class);
        System.out.println(personPrp.toString());


    }

    // 工厂方法创建对象
    @Test
    public void testBeanFactoryCreateBean(){
        Object airPlaneStatic = ioc.getBean("airPlaneStatic");
        System.out.println(airPlaneStatic);

        System.out.println("=========================");

        Object airplane = ioc.getBean("airPlane");
        System.out.println(airplane);
    }

    // 实现FactoryBean的工厂，被Spring默认识别成BeanFactory
    @Test
    public void testImpFactoryBeanCreateBean(){
        Object book = ioc.getBean("bookFactory");
        System.out.println(book);
    }

    // bean 生命周期方法
    @Test
    public void testBeanSMZQ(){
        System.out.println("容器将关闭！");
        ioc.close();
    }


    // 测试需要将之前写在测试类中的成员变量ioc 注释掉，不然原ioc会被启动
    @Test
    public void testBeanPostProcessor(){
        ClassPathXmlApplicationContext iocNew = new ClassPathXmlApplicationContext("postprocessor.xml");
        iocNew.close();
    }

    @Test
    public void testStaticUtil(){
        LogUtil.logBefore();
    }
}
