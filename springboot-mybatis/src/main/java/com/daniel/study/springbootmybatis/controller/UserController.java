package com.daniel.study.springbootmybatis.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daniel.study.springbootmybatis.common.BaseController;
import com.daniel.study.springbootmybatis.entity.User;
import com.daniel.study.springbootmybatis.service.IUserService;
import com.daniel.study.springbootmybatis.vo.JsonVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author daniel
 * @since 2019-08-04
 */
@RestController
@RequestMapping("/springbootmybatis/user")
@Slf4j
@Api(value = "用户接口")
@ApiResponses({@ApiResponse(code = 500, message = "服务器内部错误", response = Error.class)})
public class UserController extends BaseController {
    @Autowired
    private IUserService userSvc;

    @GetMapping(value = "/show")
    @ApiOperation(value = "查询所有的用户名字", notes = "查询所有的用户名字")
    public JsonVO<IPage<User>> testEnum(@ModelAttribute Page<User> page, @ModelAttribute User user) {
        page.setSearchCount(true);
        IPage<User> users = userSvc.page(page, new QueryWrapper<User>().eq("c_user_name", user.getUserName()));


        return new JsonVO<IPage<User>>(0, "", users);
    }

    @PostMapping(value = "/add")
    @ApiOperation(value = "增加用户", notes = "增加用户")
    public JsonVO addUser() {
        User user = new User();
        user.setUserName("yangyuanli");
        userSvc.save(user);
        return new JsonVO(0, "");
    }
}
