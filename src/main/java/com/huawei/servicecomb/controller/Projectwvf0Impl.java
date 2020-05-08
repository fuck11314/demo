package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-05-08T08:49:35.810Z")

@RestSchema(schemaId = "projectwvf0")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectwvf0Impl {

    @Autowired
    private Projectwvf0Delegate userProjectwvf0Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectwvf0Delegate.helloworld(name);
    }

}
