package com.ruoyi.platform.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * upload对象 fashionmnist
 * 
 * @author ruoyi
 * @date 2023-02-28
 */
public class FashionmnistVo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    @Excel(name = "")
    private String label;

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
    public void setLabel(String label) 
    {
        this.label = label;
    }

    public String getLabel() 
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

    public void set(com.ruoyi.platform.domain.Fashionmnist po)
    {
        this.id = po.getId();
        this.imagedata = po.getImagedata();
        int label = po.getLabel().intValue();
        String[] image_labels = {"T-shirt", "Trouser", "Pullover", "Dress", "Coat", "Sandal", "Shirt", "Sneaker", "Bag", "Ankle boot"};
        this.label = image_labels[label];
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
