package com.yzg.service2.entity;

import com.codingapi.txlcn.common.util.id.RandomUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Tdemo
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/5 10:42
 * @Version 1.0
 **/
@Entity
@Table(name = "t_demo")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tdemo implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String kid = RandomUtils.randomKey();
    private String demoField;
    private String groupId;
    private Date createTime;
    private String appName;


}