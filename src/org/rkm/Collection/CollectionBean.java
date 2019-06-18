package org.rkm.Collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
    private List<String> empList;
    private Set<String> empSet;
    private Map empMap;
    private Properties empProperty;

    public List getEmpList() {
        return empList;
    }

    public void setEmpList(List empList) {
        this.empList = empList;
    }

    public Set getEmpSet() {
        return empSet;
    }

    public void setEmpSet(Set empSet) {
        this.empSet = empSet;
    }

    public Map getEmpMap() {
        return empMap;
    }

    public void setEmpMap(Map empMap) {
        this.empMap = empMap;
    }

    public Properties getEmpProperty() {
        return empProperty;
    }

    public void setEmpProperty(Properties empProperty) {
        this.empProperty = empProperty;
    }
}
