package com.company.testsessionvariable.web.department;

import com.company.testsessionvariable.entity.Department;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.OptionsList;

import javax.inject.Inject;

public class Selectdefaultdepartment extends AbstractWindow {

    @Inject
    private OptionsList deptList;
    @Inject
    private UserSessionSource userSessionSource;

    public void onOkBtnClick(Component source) {
        Department value = deptList.getValue();
        userSessionSource.getUserSession()
                .setAttribute("defaultDepartment", value);
        showNotification("Default department set to " + value.getName(), NotificationType.HUMANIZED);
        close(COMMIT_ACTION_ID);
    }

    public void onCancelBtnClick(Component source) {
        close(CLOSE_ACTION_ID);
    }
}