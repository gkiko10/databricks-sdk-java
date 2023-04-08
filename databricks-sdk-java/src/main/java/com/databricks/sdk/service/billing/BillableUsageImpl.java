// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of BillableUsage */
class BillableUsageImpl implements BillableUsageService {
    private final ApiClient apiClient;

    public BillableUsageImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public void download(DownloadRequest request) {
        String path = String.format("/api/2.0/accounts//usage/download");
        apiClient.GET(path, request, Void.class);
    }
    
}