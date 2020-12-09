package top.xx.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import top.xx.entity.TeaUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * user Mapper 接口
 * </p>
 *
 * @author Xx
 * @since 2020-11-18
 */
@Component
@Mapper
public interface TeaUserMapper extends BaseMapper<TeaUser> {

}
