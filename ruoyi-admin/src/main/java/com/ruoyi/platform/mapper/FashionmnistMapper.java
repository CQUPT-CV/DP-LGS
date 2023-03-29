package com.ruoyi.platform.mapper;

import java.util.List;
import com.ruoyi.platform.domain.Fashionmnist;

/**
 * uploadMapper接口
 *
 * @author ruoyi
 * @date 2023-02-28
 */
public interface FashionmnistMapper
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
     * 删除upload
     *
     * @param id upload主键
     * @return 结果
     */
    public int deleteFashionmnistById(Long id);

    /**
     * 批量删除upload
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFashionmnistByIds(String[] ids);
}
