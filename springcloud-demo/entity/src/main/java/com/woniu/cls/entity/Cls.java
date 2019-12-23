package com.woniu.cls.entity;

import java.io.Serializable;

public class Cls implements Serializable {
    private Integer cno;

    private String cname;

    private static final long serialVersionUID = 1L;

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cno=").append(cno);
        sb.append(", cname=").append(cname);
        sb.append("]");
        return sb.toString();
    }
}