package ye.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ye.model.User;
import ye.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestAll {
	@Autowired
	UserService userService;
	@Test
	public void testSpringMybatis(){
		List<User> list = userService.findAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
	@Test
	public void testFindById(){
		User user=userService.findById(3);
		System.out.println(user);
	}
	@Test
	public void testFindMeau(){
		
	}
}
