package com.neusoft.elmboot.po;

public class Position {
    private String jnum;
    private String jname;
    private String jtype;

    public Position(){}
    public Position(String jnum,String jname,String jtype){
        this.jnum=jnum;
        this.jname=jname;
        this.jtype=jtype;
    }

    public String getJnum() {
        return jnum;
    }

    public void setJnum(String jnum) {
        this.jnum = jnum;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getJtype() {
        return jtype;
    }

    public void setJtype(String jtype) {
        this.jtype = jtype;
    }
}
