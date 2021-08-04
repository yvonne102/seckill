package com.yvonne.seckill.service.impl;

import com.yvonne.seckill.dao.UserDao;
import com.yvonne.seckill.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserService implements com.yvonne.seckill.service.UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

}
