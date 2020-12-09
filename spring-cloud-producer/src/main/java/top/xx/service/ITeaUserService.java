package top.xx.service;

import top.xx.entity.TeaUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * user 服务类
 * </p>
 *
 * @author Xx
 * @since 2020-11-18
 */
public interface ITeaUserService extends IService<TeaUser> {

    void insert(TeaUser user);

    TeaUser getUser(Long id);

    List<TeaUser> listUsersByIds(List<Long> ids);

    TeaUser getByUserName(String username);

    void update(TeaUser user);

    void delete(Long id);
}
