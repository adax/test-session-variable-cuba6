package com.company.testsessionvariable.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "TESTSESSIONVARIABLE_DEPARTMENT")
@Entity(name = "testsessionvariable$Department")
public class Department extends StandardEntity {
    private static final long serialVersionUID = -2349817986562815422L;

    @Column(name = "NAME")
    protected String name;
    public void setName(String name) {
        this.name = name;
}
    public String getName() {
        return name;
    }
}