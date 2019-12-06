package com.yzg.service1.entity;

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
 * @Date 2019/12/5 10:50
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_demo_copy1")
public class Tdemo implements Serializable {
    @Id
    private String id;
    private String kid = RandomUtils.randomKey();
    private String groupId;
    private String userName;

}