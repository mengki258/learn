package com.mengki.learn.controller;

import com.mengki.learn.converter.UserCovertBasic;
import com.mengki.learn.entity.User;
import com.mengki.learn.entity.UserVO1;
import com.mengki.learn.entity.UserVO2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 测试前置控制器
 * </p>
 *
 * @author Mengki
 * @since 2021/9/10
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("convert")
    public Object convertEntity() {
        User user = User.builder()
                .id(1)
                .name("张三")
                .createTime("2020-04-01 11:05:07")
                .updateTime(LocalDateTime.now())
                .build();
        List<Object> objectList = new ArrayList<>();

        objectList.add(user);

        // 使用mapstruct

        log.info("userVO1:" + UserCovertBasic.INSTANCE.toConvertVO1(user));
        log.info("userVO1转换回实体类user:" + UserCovertBasic.INSTANCE.fromConvertEntity1(UserCovertBasic.INSTANCE.toConvertVO1(user)));
        log.info("user to user3:"+UserCovertBasic.INSTANCE.toConvertVO3(user));


        return objectList;
    }
}
