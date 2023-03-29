package com.ruoyi.platform.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * upload对象 fashionmnist
 *
 * @author ruoyi
 * @date 2023-02-28
 */
public class Fashionmnist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    @Excel(name = "")
    private Long label;

    /**  */
    @Excel(name = "")
    private String imagedata;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setLabel(Long label)
    {
        this.label = label;
    }

    public Long getLabel()
    {
        return label;
    }
    public void setImagedata(String imagedata)
    {
        this.imagedata = imagedata;
    }

    public String getImagedata()
    {
        return imagedata;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("label", getLabel())
                .append("imagedata", getImagedata())
                .toString();
    }
}
