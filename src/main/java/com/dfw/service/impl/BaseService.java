package com.dfw.service.impl;

import com.dfw.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;


public class BaseService {

    @Autowired
    protected UserMapper userMapper;
    @Autowired
    protected MyFileMapper myFileMapper;
    @Autowired
    protected FileFolderMapper fileFolderMapper;
    @Autowired
    protected FileStoreMapper fileStoreMapper;
}
