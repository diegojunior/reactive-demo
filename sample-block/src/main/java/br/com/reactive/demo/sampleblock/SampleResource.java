package br.com.reactive.demo.sampleblock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class SampleResource {

    @Autowired
    private SampleService service;

    @GetMapping
    public BigInteger get()  {
        return service.getCalc();
    }
}
