package org.example;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager extends BaseUserManager{

    private List<Campaign> campaigns;

    public CampaignManager(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    public  void addCampain(Campaign campaign){
        campaigns.add(campaign);
    }
    public void deletCampain(Campaign campaign){
        campaigns.remove(campaign);
    }

    public void update(int id, Campaign campaign) {
        boolean a = false;
        for (Campaign campaign1 : campaigns) {
            if (id == campaign1.getId()) {
                a=true;
                campaigns.remove(campaign1);
                campaigns.add(campaign);
                System.out.println("kampanya güncellendi");
            }
        }
        if (a==false){
            System.out.println("kampanya mevcut değil");
        }

    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(ArrayList<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    @Override
    public String toString() {
        return "CampainManager{" +
                "campaigns=" + campaigns +
                '}';
    }

    public void save(User user) {
        super.save(user);
    }
}