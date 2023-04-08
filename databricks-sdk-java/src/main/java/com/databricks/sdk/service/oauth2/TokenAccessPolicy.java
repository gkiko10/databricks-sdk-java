// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TokenAccessPolicy {
    /**
     * access token time to live in minutes
     */
    @JsonProperty("access_token_ttl_in_minutes")
    private Object /* MISSING TYPE */ accessTokenTtlInMinutes;
    
    /**
     * refresh token time to live in minutes
     */
    @JsonProperty("refresh_token_ttl_in_minutes")
    private Object /* MISSING TYPE */ refreshTokenTtlInMinutes;
    
    public TokenAccessPolicy setAccessTokenTtlInMinutes(Object /* MISSING TYPE */ accessTokenTtlInMinutes) {
        this.accessTokenTtlInMinutes = accessTokenTtlInMinutes;
        return this;
    }

    public Object /* MISSING TYPE */ getAccessTokenTtlInMinutes() {
        return accessTokenTtlInMinutes;
    }
    
    public TokenAccessPolicy setRefreshTokenTtlInMinutes(Object /* MISSING TYPE */ refreshTokenTtlInMinutes) {
        this.refreshTokenTtlInMinutes = refreshTokenTtlInMinutes;
        return this;
    }

    public Object /* MISSING TYPE */ getRefreshTokenTtlInMinutes() {
        return refreshTokenTtlInMinutes;
    }
    
}
