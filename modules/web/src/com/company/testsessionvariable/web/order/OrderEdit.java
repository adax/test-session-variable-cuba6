package com.company.testsessionvariable.web.order;

import com.company.testsessionvariable.entity.Department;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.testsessionvariable.entity.Order;

import javax.inject.Inject;

public class OrderEdit extends AbstractEditor<Order> {
    @Inject
    private UserSessionSource userSessionSource;

    @Override
    protected void initNewItem(Order item) {
        Department department = userSessionSource
                .getUserSession()
                .getAttribute("defaultDepartment");
        item.setDepartment(department);
    }
}