package com.ruoyi.platform.controller;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.platform.domain.FashionmnistVo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.platform.domain.Fashionmnist;
import com.ruoyi.platform.service.IFashionmnistService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * uploadController
 * 
 * @author ruoyi
 * @date 2023-02-28
 */
@Controller
@RequestMapping("/platform/upload")
public class FashionmnistController extends BaseController
{
    private String prefix = "platform/upload";

    @Autowired
    private IFashionmnistService fashionmnistService;


    @GetMapping()
    public String upload()
    {
        return prefix + "/upload";
    }

    /**
     * 查询upload列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Fashionmnist fashionmnist)
    {
        startPage();
        List<Fashionmnist> list = fashionmnistService.selectFashionmnistList(fashionmnist);
        List<FashionmnistVo> list1 = new ArrayList<>();
        for(Fashionmnist i:list){
            FashionmnistVo a = new FashionmnistVo();
            a.set(i);
            list1.add(a);
        }
        return getDataTable1(list, list1);
    }

    /**
     * 导出upload列表
     */
    @Log(title = "upload", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Fashionmnist fashionmnist)
    {
        List<Fashionmnist> list = fashionmnistService.selectFashionmnistList(fashionmnist);
        ExcelUtil<Fashionmnist> util = new ExcelUtil<Fashionmnist>(Fashionmnist.class);
        return util.exportExcel(list, "upload数据");
    }

    /**
     * 新增upload
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存upload
     */
    @Log(title = "upload", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Fashionmnist fashionmnist)
    {
        return toAjax(fashionmnistService.insertFashionmnist(fashionmnist));
    }

    /**
     * 修改upload
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Fashionmnist fashionmnist = fashionmnistService.selectFashionmnistById(id);
        mmap.put("fashionmnist", fashionmnist);
        return prefix + "/edit";
    }

    /**
     * 修改保存upload
     */
    @Log(title = "upload", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Fashionmnist fashionmnist)
    {
        return toAjax(fashionmnistService.updateFashionmnist(fashionmnist));
    }

    /**
     * 删除upload
     */
     @Log(title = "upload", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fashionmnistService.deleteFashionmnistByIds(ids));
    }
}
