package com.ruoyi.platform.service;

import java.util.List;
import com.ruoyi.platform.domain.Fashionmnist;

/**
 * uploadService接口
 *
 * @author ruoyi
 * @date 2023-02-28
 */
public interface IFashionmnistService
{
    /**
     * 查询upload
     *
     * @param id upload主键
     * @return upload
     */
    public Fashionmnist selectFashionmnistById(Long id);

    /**
     * 查询upload列表
     *
     * @param fashionmnist upload
     * @return upload集合
     */
    public List<Fashionmnist> selectFashionmnistList(Fashionmnist fashionmnist);

    /**
     * 新增upload
     *
     * @param fashionmnist upload
     * @return 结果
     */
    public int insertFashionmnist(Fashionmnist fashionmnist);

    /**
     * 修改upload
     *
     * @param fashionmnist upload
     * @return 结果
     */
    public int updateFashionmnist(Fashionmnist fashionmnist);

    /**
     * 批量删除upload
     *
     * @param ids 需要删除的upload主键集合
     * @return 结果
     */
    public int deleteFashionmnistByIds(String ids);

    /**
     * 删除upload信息
     *
     * @param id upload主键
     * @return 结果
     */
    public int deleteFashionmnistById(Long id);
}
