package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

public interface ConvertableCurrency {
    CurrencyType type = null;
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate();
    }
    default CurrencyType getType() {
        return type;
    }
}
