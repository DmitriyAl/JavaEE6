package entity;

/**
 * @author D. Albot
 * @date 22.06.2016
 */
public class UsStateBean {
    private String stateName;
    private String stateCode;

    public UsStateBean(String stateName, String stateCode) {
        this.stateName = stateName;
        this.stateCode = stateCode;
    }

    public String getStateCode()
    {
        return stateCode;
    }

    public void setStateCode(String stateCode)
    {
        this.stateCode = stateCode;
    }

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }
}
