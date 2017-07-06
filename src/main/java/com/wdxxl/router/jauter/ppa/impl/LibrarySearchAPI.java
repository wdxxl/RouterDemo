package com.wdxxl.router.jauter.ppa.impl;

import java.io.File;
import java.util.Map;

import com.google.gson.JsonObject;
import com.wdxxl.common.ICommonService;
import com.wdxxl.common.ServiceCategory;
import com.wdxxl.router.jauter.ppa.PPAction;

public class LibrarySearchAPI extends PPAction {

	@Override
	public String Process(JsonObject paramObj, String dataBaseName, File filesPath, String unZippedPath,
			Map<String, String> params, Map<ServiceCategory, ICommonService> commonServices) throws Exception {
		System.out.println("Library Search API - PPAction.");
		return null;
	}

}
