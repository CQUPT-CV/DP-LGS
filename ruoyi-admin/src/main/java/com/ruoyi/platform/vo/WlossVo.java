package com.ruoyi.platform.vo;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Arrays;

public class WlossVo extends BaseEntity
{
    private static final long serialVersionUID = 2L;

    /**  */
    private Integer[] step;

    private Double[] wloss;

    public WlossVo(Integer[] step, Double[] wloss) {
        this.step = step;
        this.wloss = wloss;
    }

    public Integer[] getStep() {
        return step;
    }

    public void setStep(Integer[] step) {
        this.step = step;
    }

    public Double[] getWloss() {
        return wloss;
    }

    public void setWloss(Double[] wloss) {
        this.wloss = wloss;
    }

    @Override
    public String toString() {
        return "WlossVo{" +
                "step=" + Arrays.toString(step) +
                ", wloss=" + Arrays.toString(wloss) +
                '}';
    }
}
