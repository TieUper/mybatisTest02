package com.tie.model;

/**
 * 转账记录
 */
public class Log {

    private int id;

    private int acc_in_no;

    private int acc_out_no;

    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountInNo() {
        return acc_in_no;
    }

    public void setAccountInNo(int accountInNo) {
        this.acc_in_no = accountInNo;
    }

    public int getAccountOutNo() {
        return acc_out_no;
    }

    public void setAccountOutNo(int accountOutNo) {
        this.acc_out_no = accountOutNo;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", accountInNo=" + acc_in_no +
                ", accountOutNo=" + acc_out_no +
                ", money=" + money +
                '}';
    }
}
