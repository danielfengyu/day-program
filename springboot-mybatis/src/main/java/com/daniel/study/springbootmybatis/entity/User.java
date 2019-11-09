package com.daniel.study.springbootmybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.daniel.study.springbootmybatis.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * <p>
 *
 * </p>
 *
 * @author daniel
 * @since 2019-08-04
 */
@Data
@Accessors(chain = true)
@TableName("t_user")
@Entity
@Table(name = "T_USER")
public class User {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID",length = 32)
    private String id;
    /**
     * 用户名
     */
    @TableField("c_user_name")
    @Column(name = "c_user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField("c_password")
    @Column(name = "c_password")
    private String password;

    /**
     * 年龄
     */
    @TableField("c_age")
    @Column(name = "c_age")
    private Integer age;

    /**
     * 公司
     */
    @TableField("c_company")
    @Column(name = "c_company")
    private String company;
}
