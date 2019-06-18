package org.rkm.Required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.scheduling.annotation.Scheduled;

public class EmpBean {
    private String designation;

    public String getDesignation() {
        return designation;
    }

    @Required
    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
