package br.com.reactive.demo.samplenonblock;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Service
public class ReactiveService {

    public Publisher<BigInteger> call() {
        return Mono.just(getCalc());
    }

    private BigInteger getCalc() {
        BigInteger variavel = BigInteger.ONE;
        for (int indice = 2; indice <= 100; indice++) {
            variavel = variavel.multiply(BigInteger.valueOf(indice));
        }
        return variavel;
    }
}
