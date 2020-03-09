package com.dfw.service;


import com.dfw.entity.FileStore;

/**
文件仓库业务层接口
 **/
public interface FileStoreService {

    /**
     * @Description 添加文件仓库（用户注册时调用）
     * @return java.lang.Integer 返回影响数据库的行数，新增文件仓库id封装在实体类的id属性
     **/
    public Integer addFileStore(FileStore fileStore);

    /**
     * @Description 根据用户id获得文件仓库
     * @return com.molihub.entity.FileStore
     **/
    public FileStore getFileStoreByUserId(Integer userId);

    /**
     * @Description 根据文件仓库id获得文件仓库
     * @return com.molihub.entity.FileStore
     **/
    public FileStore getFileStoreById(Integer fileStoreId);

    /**
     * @Description 修改仓库当前已使用的容量
     * @return java.lang.Integer
     **/
    public Integer addSize(Integer id, Integer size);

    /**
     * @Description 修改仓库当前已使用的容量
     * @Param [id,size]
     * @return java.lang.Integer
     **/
    public Integer subSize(Integer id, Integer size);

}
