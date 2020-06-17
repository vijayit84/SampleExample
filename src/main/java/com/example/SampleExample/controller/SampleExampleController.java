package com.example.SampleExample.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vijay on 12-06-2020.
 */
@RestController
@RequestMapping(value="/sample")
public class SampleExampleController {

@RequestMapping(value="/helloworld",method = RequestMethod.GET)
public String helloWorld()
{

    return "Welcome to the Docker !";

}

}
