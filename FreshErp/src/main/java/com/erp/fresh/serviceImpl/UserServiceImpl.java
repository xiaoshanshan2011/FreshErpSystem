package com.erp.fresh.serviceImpl;

import com.erp.fresh.dao.UserDao;
import com.erp.fresh.model.User;
import com.erp.fresh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryByName(String username) {
        return userDao.queryByName(username);
    }
}
