package top.xx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import top.xx.entity.TeaUser;
import top.xx.mapper.TeaUserMapper;
import top.xx.service.ITeaUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * user 服务实现类
 * </p>
 *
 * @author Xx
 * @since 2020-11-18
 */
@Service
public class TeaUserServiceImpl extends ServiceImpl<TeaUserMapper, TeaUser> implements ITeaUserService {

    @Autowired
    private TeaUserMapper userMapper;

    @Override
    public void insert(TeaUser user) {
        userMapper.insert(user);
    }

    @Override
    public TeaUser getUser(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<TeaUser> listUsersByIds(List<Long> ids) {
        return userMapper.selectBatchIds(ids);
    }

    @Override
    public TeaUser getByUserName(String username) {
        QueryWrapper<TeaUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",username);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public void update(TeaUser user) {
        UpdateWrapper<TeaUser> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",user.getId());
        userMapper.update(user,updateWrapper);
    }

    @Override
    public void delete(Long id) {
        userMapper.deleteById(id);
    }
}
