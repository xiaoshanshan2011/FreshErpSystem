package com.erp.fresh.dao;

import com.erp.fresh.model.User;

public interface UserDao {
    User queryById(int id);
}
