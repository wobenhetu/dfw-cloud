package com.dfw.mapper;

import com.dfw.entity.FileStoreStatistics;
import com.dfw.entity.MyFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
与文件相关的数据库操作
 **/
@Mapper
public interface MyFileMapper {

    /**
     * @Description 添加文件
     * @Param [myFile]
     * @return java.lang.Integer
     **/
    Integer addFileByFileStoreId(MyFile myFile);

    /**
     * @Description 根据文件id修改文件
     * @Param [myFile]
     * @return java.lang.Integer
     **/
    Integer updateFileByFileId(MyFile myFile);

    /**
     * @Description 根据文件的id删除文件
     * @Param [myFileId]
     * @return java.lang.Integer
     **/
    Integer deleteByFileId(Integer myFileId);

    /**
     * @Description 根据父文件夹的id删除文件
     * @Param [id]
     * @return java.lang.Integer
     **/
    Integer deleteByParentFolderId(Integer id);

    /**
     * @Description 根据文件的id获取文件
     * @Param [myFileId]
     * @return com.moti.entity.MyFile
     **/
    MyFile getFileByFileId(Integer myFileId);

    /**
     * @Description 获得仓库根目录下的所有文件
     * @Param [fileStoreId]
     * @return java.util.List<com.molihub.entity.MyFile>
     **/
    List<MyFile> getRootFilesByFileStoreId(Integer fileStoreId);
    
    /**
     * @Description 根据父文件夹id获得文件
     * @Param [parentFolderId]
     * @return java.util.List<com.molihub.entity.MyFile>
     **/
    List<MyFile> getFilesByParentFolderId(Integer parentFolderId);
    
    /**
     * @Description 根据类别获取文件
     * @Param [storeId, type]
     * @return java.util.List<com.moti.entity.MyFile>
     **/
    List<MyFile> getFilesByType(Integer storeId,Integer type);

    /**
     * @Description 获取仓库的统计信息
     * @Param [id]
     * @return com.molihub.entity.FileStoreStatistics
     **/
    FileStoreStatistics getCountStatistics(Integer id);
}