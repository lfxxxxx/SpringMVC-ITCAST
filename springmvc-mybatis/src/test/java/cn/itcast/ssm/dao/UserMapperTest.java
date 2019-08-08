package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LFX
 * @create 2019-08-06 15:41
 */
public class UserMapperTest {

	private ApplicationContext ctx;

	@Before
	public void before() {
		ctx = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}
}

