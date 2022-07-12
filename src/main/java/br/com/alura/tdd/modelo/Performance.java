package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Performance {
    BAD{
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.03");
        }
    },
    GOOD{
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.15");
        }
    },
    EXCELLENT{
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.2");
        }
    },
    AMAZING{
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.4");
        }
    };

    public abstract BigDecimal percentageReadjustment();

}
