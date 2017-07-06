package com.wdxxl.service;

import java.io.File;
import java.util.Map;

import com.wdxxl.common.ICommonService;
import com.wdxxl.common.OfflineCommonParams;
import com.wdxxl.common.ServiceCategory;

public class IFullTextSearchServiceImpl extends OfflineCommonParams implements IFullTextSearchService {
	public static final String FULLTEXT_SEARCH_INIT = "ftsSearch/init/:libraryID";
	
    public IFullTextSearchServiceImpl(String dataBaseName, File basicFilesPath, String unZippedPath, Map<ServiceCategory, ICommonService> commonServices) {
        super(dataBaseName, basicFilesPath, unZippedPath, commonServices);
    }
	
	@Override
	public String fullTextSearchInit() {
		System.out.println("IFullTextSearchServiceImpl - fullTextSearchInit()");
		return "fullTextSearchInitResponse";
	}
}
