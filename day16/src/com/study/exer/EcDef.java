package com.study.exer;
// 自定义异常类
public class EcDef extends Exception{

    static final long serialVersionUID = -7034897190845766939L;

    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }
}
