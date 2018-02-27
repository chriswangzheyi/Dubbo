package cn.mldn.mytest01;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzy.api.IMessage.IMessage;

@ContextConfiguration(locations={"classpath:spring-dubbo-consumer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessage {
	@Resource
	private IMessage msg ; 
	@Test 
	public void testEcho() {
		System.out.println(this.msg.echo("hello") + "  ********************** ");
	}
}
