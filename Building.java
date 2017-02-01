/**
 * Created by robculclasure on 1/30/17.
 * Class Building represents a building that may be leased, purchased, insured, etc by clients.
 */
public class Building {

    public String name;
    public Boolean commercial;
    public Boolean residential;
    public Boolean industrial;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCommercial() {
        return commercial;
    }
    public void setCommercial(Boolean commercial) {
        if(commercial == true) {
            this.commercial = commercial;
            System.out.println("Great. Our firm is interested in developing your commercial property. \n");
        }
        else if(commercial == false){
            this.commercial = commercial;
            System.out.println("Sorry, our firm is looking for a commerical property. \n");
        }

    }

    public Boolean getResidential() {
        return residential;
    }
    public void setResidential(Boolean residential) {
        this.residential = residential;
    }

    public Boolean getIndustrial() {
        return industrial;
    }
    public void setIndustrial(Boolean industrial) {
        this.industrial = industrial;
    }

    Building(String name, Boolean commercial, Boolean residential, Boolean industrial){
        setName(name);
        setCommercial(commercial);
        setResidential(residential);
        setIndustrial(industrial);
    }

}

