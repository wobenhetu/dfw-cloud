package com.dfw.mapper;

import com.dfw.entity.FileFolder;
import com.dfw.entity.MyFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
与文件夹相关的数据库操作
 **/
@Mapper
public interface FileFolderMapper {

    /**
     * @Description 根据文件夹的id删除文件夹
     * @Param [fileFolderId]
     * @return java.lang.Integer
     **/
    Integer deleteFileFolderById(Integer fileFolderId);

    /**
     * @Description 根据父文件夹的id删除文件夹
     * @Param [parentFolderId]
     * @return java.lang.Integer
     **/
    Integer deleteFileFolderByParentFolderId(Integer parentFolderId);

    /**
     * @Description 根据仓库的id删除文件夹
     * @Param [fileStoreId]
     * @return java.lang.Integer
     **/
    Integer deleteFileFolderByFileStoreId(Integer fileStoreId);

    /**
     * @Description 增加文件夹
     * @Param [fileFolder]
     * @return java.lang.Integer
     **/
    Integer addFileFolder(FileFolder fileFolder);

    /**
     * @Description 根据文件夹的id获取文件夹
     * @Param [fileFolderId]
     * @return com.moti.entity.FileFolder
     **/
    FileFolder getFileFolderById(Integer fileFolderId);

    /**
     * @Description 根据父文件夹的id获取文件夹
     * @Param  * @param null
     * @return
     **/
    List<FileFolder> getFileFolderByParentFolderId(Integer parentFolderId);

    /**
     * @Description 根据仓库的id获取文件夹
     * @Param [fileStoreId]
     * @return java.util.List<com.moti.entity.FileFolder>
     **/
    List<FileFolder> getFileFolderByFileStoreId(Integer fileStoreId);
    
    /**
     * @Description 获得仓库的文件夹数量
     * @Param [fileStoreId]
     * @return java.lang.Integer
     **/
    Integer getFileFolderCountByFileStoreId(Integer fileStoreId);

    /**
     * @Description 根据仓库Id获得仓库根目录下的所有文件夹
     * @Param [fileStoreId]
     * @return java.util.List<com.molihub.entity.FileFolder>
     **/
    List<FileFolder> getRootFoldersByFileStoreId(Integer fileStoreId);

    /**
     * @Description 根据文件夹的id修改文件夹信息
     * @Param [fileFolder]
     * @return java.lang.Integer
     **/
    Integer updateFileFolderById(FileFolder fileFolder);

    /**
     * @Description 根据文件夹的id获取文件夹下面的文件
     * @Param [fileStoreId]
     * @return java.util.List<com.moti.entity.MyFile>
     **/
    List<MyFile> getFileByFileFolder(Integer fileStoreId);

}