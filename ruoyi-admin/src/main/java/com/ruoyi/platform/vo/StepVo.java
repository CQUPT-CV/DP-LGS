package com.ruoyi.platform.vo;

import java.util.Arrays;

public class StepVo {

    private static final long serialVersionUID =4L;

    private Integer[] step;

    public StepVo(Integer[] step) {
        this.step = step;
    }

    public Integer[] getStep() {
        return step;
    }

    public void setStep(Integer[] step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "StepVo{" +
                "step=" + Arrays.toString(step) +
                '}';
    }
}
