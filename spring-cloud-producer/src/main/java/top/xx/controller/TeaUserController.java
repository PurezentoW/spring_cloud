package top.xx.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import top.xx.entity.TeaUser;
import top.xx.service.ITeaUserService;
import top.xx.utils.Result;

import java.util.List;

/**
 * <p>
 * user 前端控制器
 * </p>
 *
 * @author Xx
 * @since 2020-11-18
 */
@RestController
@RequestMapping("/user")
public class TeaUserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TeaUserController.class);

    private final ITeaUserService userService;

    public TeaUserController(ITeaUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody TeaUser user) {
        userService.insert(user);
        return new Result("操作成功", 200);
    }

    @GetMapping("/{id}")
    public Result<TeaUser> getUser(@PathVariable Long id) {
        TeaUser user = userService.getUser(id);
        LOGGER.info("根据id获取用户信息，用户名称为：{}",user.getUserName());
        return new Result<TeaUser>(user);
    }

    @GetMapping("/listUsersByIds")
    public Result<List<TeaUser>> listUsersByIds(@RequestParam List<Long> ids) {
        List<TeaUser> userList= userService.listUsersByIds(ids);
        LOGGER.info("根据ids获取用户信息，用户列表为：{}",userList);
        return new Result<List<TeaUser>>(userList);
    }

    @GetMapping("/getByUsername")
    public Result<TeaUser> getByUsername(@RequestParam String username) {
        TeaUser user = userService.getByUserName(username);
        return new Result<TeaUser>(user);
    }

    @PostMapping("/update")
    public Result update(@RequestBody TeaUser user) {
        userService.update(user);
        return new Result("操作成功", 200);
    }

    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        userService.delete(id);
        return new Result("操作成功", 200);
    }

}
