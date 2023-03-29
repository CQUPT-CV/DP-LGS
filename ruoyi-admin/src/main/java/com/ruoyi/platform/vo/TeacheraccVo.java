package com.ruoyi.platform.vo;

import java.util.Arrays;

public class TeacheraccVo {

    private static final long serialVersionUID = 3L;

    private Integer[] steps;

    private Double[] maxacc;

    private Double[] minacc;


    public TeacheraccVo(Integer[] steps, Double[] maxacc, Double[] minacc) {
        this.steps = steps;
        this.maxacc = maxacc;
        this.minacc = minacc;
    }

    public Integer[] getSteps() {
        return steps;
    }

    public void setSteps(Integer[] steps) {
        this.steps = steps;
    }

    public Double[] getMaxacc() {
        return maxacc;
    }

    public void setMaxacc(Double[] maxacc) {
        this.maxacc = maxacc;
    }

    public Double[] getMinacc() {
        return minacc;
    }

    public void setMinacc(Double[] minacc) {
        this.minacc = minacc;
    }

    @Override
    public String toString() {
        return "TeacheraccVO{" +
                "steps=" + Arrays.toString(steps) +
                ", maxacc=" + Arrays.toString(maxacc) +
                ", minacc=" + Arrays.toString(minacc) +
                '}';
    }
}
