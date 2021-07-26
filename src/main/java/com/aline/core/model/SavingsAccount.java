package com.aline.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue(AccountType.Values.SAVINGS)
public class SavingsAccount extends Account {

    /**
     * Annual Percentage Yield
     * <p>
     *     This is the amount of interest this
     *     account will earn per year.
     * </p>
     */
    private float apy;
}
