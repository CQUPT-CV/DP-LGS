package com.ruoyi.platform.vo;

public class MaxstepVo {

    private static final long serialVersionUID =5L;

    private Integer maxstep;

    public MaxstepVo(Integer maxstep) {
        this.maxstep = maxstep;
    }

    public Integer getMaxstep() {
        return maxstep;
    }

    public void setMaxstep(Integer maxstep) {
        this.maxstep = maxstep;
    }

    @Override
    public String toString() {
        return "MaxstepVo{" +
                "maxstep=" + maxstep +
                '}';
    }
}
