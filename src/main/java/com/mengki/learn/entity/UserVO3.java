package com.mengki.learn.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 用户实体
 * </p>
 *
 * @author Mengki
 * @since 2021/9/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVO3 {
    private Integer userId;
    private String userName;
    private String createTime;
}
