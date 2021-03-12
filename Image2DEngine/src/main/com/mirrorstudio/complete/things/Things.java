// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is under LGPL license

package complete.things;

public class Things implements ThingsTemplate {
    private int thingsCode;
    private String thingsName;
    private String thingsDescription;
    private int thingsQuality;

    public int getThingsCode() {
        return thingsCode;
    }

    public String getThingsName() {
        return thingsName;
    }

    public void setThingsCode(int thingsCode) {
        this.thingsCode = thingsCode;
    }

    public String getThingsDescription() {
        return thingsDescription;
    }

    public int getThingsQuality() {
        return thingsQuality;
    }

}
