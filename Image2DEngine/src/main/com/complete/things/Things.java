// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is under LGPL license

package complete.things;

public class Things implements ThingsTemplate {
    int thingsCode;
    String thingsName;
    String thingsDescription;
    int thingsQuality;

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
    public void setThingsDescription(String thingsDescription) {
        this.thingsDescription = thingsDescription;
    }
    public void setThingsName(String thingsName) {
        this.thingsName = thingsName;
    }
    public void setThingsQuality(int thingsQuality) {
        this.thingsQuality = thingsQuality;
    }
}
