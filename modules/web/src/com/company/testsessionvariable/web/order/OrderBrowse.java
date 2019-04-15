package com.company.testsessionvariable.web.order;

import com.company.testsessionvariable.entity.Department;
import com.company.testsessionvariable.entity.Order;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.data.GroupDatasource;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class OrderBrowse extends AbstractLookup {
    @Inject
    private UserSessionSource userSessionSource;
    @Inject
    private GroupDatasource<Order, UUID> ordersDs;

    @Override
    public void init(Map<String, Object> params) {
        Department defaultDepartment = userSessionSource.getUserSession()
                .getAttribute("defaultDepartment");
        if (defaultDepartment != null){
            showNotification("Default department is " + defaultDepartment.getName(), NotificationType.HUMANIZED);
            ordersDs.setQuery("select e from testsessionvariable$Order e where e.department.id = :session$defaultDepartment");
        } else {
            showNotification("Default department is not set", NotificationType.HUMANIZED);
        }
    }
}