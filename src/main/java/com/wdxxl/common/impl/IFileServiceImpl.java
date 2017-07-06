package com.wdxxl.common.impl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.wdxxl.common.ICommonService;

public class IFileServiceImpl extends ICommonService implements IFileService {

	@Override
	public String getFileContent(String filePath) throws IOException {
		return FileUtils.readFileToString(new File(filePath), "UTF-8");
	}

	@Override
	public String getFileContent(File file) throws IOException {
		return FileUtils.readFileToString(file, "utf-8");
	}
}
