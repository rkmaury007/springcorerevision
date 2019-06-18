package org.rkm;

public class Mobile {
    private String name;
    private int deviceid;
    private Processor processor;

    /*public Mobile(Processor processor) {
        this.processor = processor;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(int deviceid) {
        this.deviceid = deviceid;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
