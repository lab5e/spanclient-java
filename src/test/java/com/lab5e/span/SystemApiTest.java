/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.0.12 reported-davon
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiException;
import com.lab5e.span.model.RuntimeError;
import com.lab5e.span.model.SystemInfoResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemApi
 */
@Ignore
public class SystemApiTest {

    private final SystemApi api = new SystemApi();

    
    /**
     * System information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemInfoTest() throws ApiException {
        SystemInfoResponse response = api.getSystemInfo();

        // TODO: test validations
    }
    
}
