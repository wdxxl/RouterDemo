package com.wdxxl.common;

import java.io.File;
import java.util.Map;

import com.wdxxl.common.impl.ILogService;

public abstract class OfflineCommonParams {
    private String dataBaseName;
    private File basicFilesPath;
    private String unZippedPath;
    private Map<ServiceCategory, ICommonService> commonServices;
    protected ILogService logger;

    public OfflineCommonParams(String dataBaseName, File basicFilesPath, Map<ServiceCategory, ICommonService> commonServices) {
        this.dataBaseName = dataBaseName;
        this.basicFilesPath = basicFilesPath;
        this.commonServices = commonServices;
        logger = (ILogService) commonServices.get(ServiceCategory.LOG_SERVICE);
    }

    public OfflineCommonParams(String dataBaseName, File basicFilesPath, String unZippedPath, Map<ServiceCategory, ICommonService> commonServices) {
        this.dataBaseName = dataBaseName;
        this.basicFilesPath = basicFilesPath;
        this.unZippedPath = unZippedPath;
        this.commonServices = commonServices;
        logger = (ILogService) commonServices.get(ServiceCategory.LOG_SERVICE);
    }

    public String getDataBaseName() {
        return dataBaseName;
    }


    public File getBasicFilesPath() {
        return basicFilesPath;
    }

    public String getUnZippedPath() {
        return unZippedPath;
    }

    public String getBasicPath() {
        return this.getBasicFilesPath().getAbsolutePath();
    }

    public Map<ServiceCategory, ICommonService> getCommonServices() {
        return commonServices;
    }
}
