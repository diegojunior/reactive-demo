package br.com.reactive.demo.samplenonblock;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class SampleReactiveResource {

    private ReactiveService service;

    public SampleReactiveResource(ReactiveService service) {
        this.service = service;
    }

    @GetMapping
    public Publisher<BigInteger> get() {
        return this.service.call();
    }

}
