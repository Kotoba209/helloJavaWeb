package com.dao;

import java.util.List;
import com.entity.User;

public interface UserDao {
    public boolean login(String name, String pwd); // 登录
    public boolean register(User user);
    public List<User> getUserAll();
    public boolean delete(int id);
    public boolean update(int ud, String name, String pwd, String sex, String home, String info);
}
