package com.okan.SpringBooteBean.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Product extends BaseModel {

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Price> prices;

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(final List<Price> prices) {
        this.prices = prices;
    }
}
