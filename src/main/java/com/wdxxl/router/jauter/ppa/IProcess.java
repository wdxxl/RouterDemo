package com.wdxxl.router.jauter.ppa;

import java.io.File;
import java.util.Map;

import com.google.gson.JsonObject;
import com.wdxxl.common.ICommonService;
import com.wdxxl.common.ServiceCategory;

public interface IProcess {
	String Process(JsonObject paramObj, String dataBaseName, File filesPath, String unZippedPath,
			Map<String, String> params, Map<ServiceCategory, ICommonService> commonServices) throws Exception;
}
