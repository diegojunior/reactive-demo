package br.com.reactive.demo.sampleblock;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
@Service
public class SampleService {

    public BigInteger getCalc() {
        BigInteger variavel = BigInteger.ONE;
        for (int indice = 2; indice <= 100; indice++) {
            variavel = variavel.multiply(BigInteger.valueOf(indice));
        }
        return variavel;
    }
}
