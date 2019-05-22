package ye.service;

import java.util.List;

import ye.model.User;

public interface UserService {
	public List<User> findAll();
	public User findById(Integer id);
}
