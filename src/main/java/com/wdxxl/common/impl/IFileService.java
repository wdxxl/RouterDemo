package com.wdxxl.common.impl;

import java.io.File;
import java.io.IOException;

import com.wdxxl.common.ServiceCategory;

public interface IFileService{
    public static ServiceCategory CATEGORY = ServiceCategory.FILE_SERVICE;
    public String getFileContent(String filePath) throws IOException;
    public String getFileContent(File file) throws  IOException;
}
