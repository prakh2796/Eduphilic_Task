package jobgar.prakhar.example.com.jobgar;

/**
 * Created by Prakhar Gupta on 08/09/2016.
 */
public class FollowingItem {

    private String companyName, industry;

    public FollowingItem() {
    }

    public FollowingItem(String industry, String companyName) {
        this.industry = industry;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
