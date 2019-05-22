package ye.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ye.dao.UserMapper;
import ye.model.User;
import ye.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	/*
	 * £¨·Ç Javadoc£©
	 * @see ye.service.UserService#findAll()
	 */
	@Override
	public List<User> findAll() {
		//public JSONArray findAll() {
		List<User> find = userMapper.findAll();
		
		return find;
	}
	@Override
	public User findById(Integer id) {
		return userMapper.findById(id);
	}

}
