package com.bitespeed.ir.constant.enums;

public enum LinkPrecedence {
    PRIMARY("primary"),

    SECONDARY("secondary");

    private final String linkPrecedence;
    LinkPrecedence(String linkPrecedence) {
        this.linkPrecedence = linkPrecedence;
    }

    public String toString(){
        return linkPrecedence;
    }
}
