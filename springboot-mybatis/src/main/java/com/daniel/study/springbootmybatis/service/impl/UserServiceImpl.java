package com.daniel.study.springbootmybatis.service.impl;

import com.daniel.study.springbootmybatis.entity.User;
import com.daniel.study.springbootmybatis.mapper.UserMapper;
import com.daniel.study.springbootmybatis.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author daniel
 * @since 2019-08-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
