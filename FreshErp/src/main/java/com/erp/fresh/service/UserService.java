package com.erp.fresh.service;

import com.erp.fresh.model.User;

public interface UserService {
    User queryByName(String username);
}
