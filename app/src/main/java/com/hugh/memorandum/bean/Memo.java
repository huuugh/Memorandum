package com.hugh.memorandum.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Memo {
    @org.greenrobot.greendao.annotation.Id
    private int Id;
    private String Content;
    private String createTime;
    private String updateTime;
    @Generated(hash = 1309893997)
    public Memo(int Id, String Content, String createTime, String updateTime) {
        this.Id = Id;
        this.Content = Content;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    @Generated(hash = 1901232184)
    public Memo() {
    }
    public int getId() {
        return this.Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getContent() {
        return this.Content;
    }
    public void setContent(String Content) {
        this.Content = Content;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


}
