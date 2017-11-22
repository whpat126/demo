package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 测试1
 *
 * @author wanghh
 */
@Entity
@Table(name = "t_user")
public class User {
    @Id
    private String openid;
    private Integer scores;

    public User(String openid, Integer scores) {
        this.openid = openid;
        this.scores = scores;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }
}
