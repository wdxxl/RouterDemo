package com.wdxxl.router.jauter.ppa.impl;

import java.io.File;
import java.util.Map;

import com.google.gson.JsonObject;
import com.wdxxl.common.ICommonService;
import com.wdxxl.common.ServiceCategory;
import com.wdxxl.router.jauter.ppa.PPAction;
import com.wdxxl.service.IFullTextSearchService;
import com.wdxxl.service.IFullTextSearchServiceImpl;

public class FullTextSearchAPI extends PPAction {

	@Override
	public String Process(JsonObject paramObj, String dataBaseName, File filesPath, String unZippedPath,
			Map<String, String> params, Map<ServiceCategory, ICommonService> commonServices) throws Exception {
		
		IFullTextSearchService fullTextSearchService = new IFullTextSearchServiceImpl(unZippedPath, filesPath, unZippedPath, commonServices);
		String result = fullTextSearchService.fullTextSearchInit();
		
		System.out.println("Full Text Search API - PPAction.");
		return result.replaceAll("full", "wdxxl full");
	}

}
