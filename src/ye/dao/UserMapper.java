package ye.dao;

import java.util.List;

import ye.model.User;

public interface UserMapper {
	public List<User> findAll();
	public User findById(Integer id);
}
