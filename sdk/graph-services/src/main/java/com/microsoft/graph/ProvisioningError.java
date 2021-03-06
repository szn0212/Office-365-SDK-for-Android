/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

/**
 * The type Provisioning Error.
*/
public class ProvisioningError extends ODataBaseEntity {

    public ProvisioningError(){
        setODataType("#Microsoft.Graph.ProvisioningError");
    }

    private String errorDetail;

    /**
    * Gets the error Detail.
    *
    * @return the String
    */
    public String geterrorDetail() {
        return this.errorDetail; 
    }

    /**
    * Sets the error Detail.
    *
    * @param value the String
    */
    public void seterrorDetail(String value) { 
        this.errorDetail = value; 
    }

    private Boolean resolved;

    /**
    * Gets the resolved.
    *
    * @return the Boolean
    */
    public Boolean getresolved() {
        return this.resolved; 
    }

    /**
    * Sets the resolved.
    *
    * @param value the Boolean
    */
    public void setresolved(Boolean value) { 
        this.resolved = value; 
    }

    private String service;

    /**
    * Gets the service.
    *
    * @return the String
    */
    public String getservice() {
        return this.service; 
    }

    /**
    * Sets the service.
    *
    * @param value the String
    */
    public void setservice(String value) { 
        this.service = value; 
    }

    private java.util.Calendar timestamp;

    /**
    * Gets the timestamp.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar gettimestamp() {
        return this.timestamp; 
    }

    /**
    * Sets the timestamp.
    *
    * @param value the java.util.Calendar
    */
    public void settimestamp(java.util.Calendar value) { 
        this.timestamp = value; 
    }
}
