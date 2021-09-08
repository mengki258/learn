package com.mengki.learn.converter;

import com.mengki.learn.entity.User;
import com.mengki.learn.entity.UserVO1;
import com.mengki.learn.entity.UserVO2;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <p>
 * 用户转换器
 * </p>
 *
 * @author Mengki
 * @since 2021/9/10
 */
@Mapper
public interface UserCovertBasic {
    UserCovertBasic INSTANCE = Mappers.getMapper(UserCovertBasic.class);

    /**
     * 字段数量类型数量相同，利用工具BeanUtils也可以实现类似效果
     * @param source
     * @return
     */
    public UserVO1 toConvertVO1(User source);
    public User fromConvertEntity1(UserVO1 userVO1);

    /**
     * 字段数量类型相同,数量少：仅能让多的转换成少的，故没有fromConvertEntity2
     * @param source
     * @return
     */
    public UserVO2 toConvertVO2(User source);
}
