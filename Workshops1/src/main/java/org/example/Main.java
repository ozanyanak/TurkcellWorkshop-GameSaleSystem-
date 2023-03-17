package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new Gamer(1, "12345", "ozan", "ozan", "yanak", "ozanyanak1@gmail.com", "12345", new Date(2001, 01, 8));
        User user2 = new Gamer(2, "12345", "altan", "altan", "anay", "altan@altan.com", "12345", new Date(2001, 01, 8));
        List<User> gamers = new ArrayList<User>();
        GamerManager gamerManager = new GamerManager(new MernisCheck(), gamers);
        gamerManager.save(user);
        gamerManager.save(user2);
        User user3 = new Gamer(3, "12345", "test", "altan", "anay", "altan@altan.com", "12345", new Date(2001, 01, 9));
        gamerManager.update(2, user3);
        System.out.println(user3.getFirstName());
        Game game = new Game(1, "gta 5", 100);
        Game game2 = new Game(2, "forza horizon", 500);
        List<Campaign> campaignList = new ArrayList<Campaign>();
        Campaign campaign = new Campaign(1, user, game, 12);
        Campaign campaign1 = new Campaign(2, user, game2, 50);
        CampaignManager campaignManager = new CampaignManager(campaignList);
        campaignManager.addCampain(campaign);
        campaignManager.addCampain(campaign1);
        var result2 = campaignManager.getCampaigns();
        for (Campaign campaign3 : result2)
        {
            System.out.println(campaign3.getGames().getName() + "-" + campaign3.getGames().getPrice());
        }
        SalePlace salePlaceNew = new SalePlace(user2, game2, campaign1);
        salePlaceNew.sell(campaign1);
        SalePlace salePlace = new SalePlace(user, game, campaign);
        salePlace.sell(campaign);
        campaign.getGames();
        Campaign campaign2 = new Campaign(2, user, game2, 25);
        campaignManager.update(2, campaign2);
        SalePlace salePlace1 = new SalePlace(user2, game2, campaign2);
        salePlace1.sell(campaign2);
    }
}