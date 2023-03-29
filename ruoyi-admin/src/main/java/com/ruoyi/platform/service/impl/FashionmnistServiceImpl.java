package com.ruoyi.platform.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.platform.mapper.FashionmnistMapper;
import com.ruoyi.platform.domain.Fashionmnist;
import com.ruoyi.platform.service.IFashionmnistService;
import com.ruoyi.common.core.text.Convert;

/**
 * uploadService业务层处理
 *
 * @author ruoyi
 * @date 2023-02-28
 */
@Service
public class FashionmnistServiceImpl implements IFashionmnistService
{
    @Autowired
    private FashionmnistMapper fashionmnistMapper;

    /**
     * 查询upload
     *
     * @param id upload主键
     * @return upload
     */
    @Override
    public Fashionmnist selectFashionmnistById(Long id)
    {
        return fashionmnistMapper.selectFashionmnistById(id);
    }

    /**
     * 查询upload列表
     *
     * @param fashionmnist upload
     * @return upload
     */
    @Override
    public List<Fashionmnist> selectFashionmnistList(Fashionmnist fashionmnist)
    {
        return fashionmnistMapper.selectFashionmnistList(fashionmnist);
    }

    /**
     * 新增upload
     *
     * @param fashionmnist upload
     * @return 结果
     */
    @Override
    public int insertFashionmnist(Fashionmnist fashionmnist)
    {
        return fashionmnistMapper.insertFashionmnist(fashionmnist);
    }

    /**
     * 修改upload
     *
     * @param fashionmnist upload
     * @return 结果
     */
    @Override
    public int updateFashionmnist(Fashionmnist fashionmnist)
    {
        return fashionmnistMapper.updateFashionmnist(fashionmnist);
    }

    /**
     * 批量删除upload
     *
     * @param ids 需要删除的upload主键
     * @return 结果
     */
    @Override
    public int deleteFashionmnistByIds(String ids)
    {
        return fashionmnistMapper.deleteFashionmnistByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除upload信息
     *
     * @param id upload主键
     * @return 结果
     */
    @Override
    public int deleteFashionmnistById(Long id)
    {
        return fashionmnistMapper.deleteFashionmnistById(id);
    }
}
