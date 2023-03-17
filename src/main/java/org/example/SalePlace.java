package org.example;

public class SalePlace {

    private User gamer;
    private Game game;
    private Campaign campaign;

    public SalePlace() {
    }

    public SalePlace(User gamer, Game game, Campaign campaign) {
        this.gamer = gamer;
        this.game = game;
        this.campaign = campaign;
    }

    public SalePlace(Campaign campaign) {

        this.campaign = campaign;
    }

    public User getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
    public void sell(Gamer gamer, Game game){

        System.out.println(gamer.getFirstName()+gamer.getLastName()+" oyuncu "+game.getName()+" adlı oyunu "+game.getPrice()+ " fiyatına aldı");
    }
    public  void sell(Campaign campaign){
        System.out.println(campaign.getGamer().getFirstName()+" "+campaign.getGamer().getLastName()+" adlı oyuncu "+getCampaign().getGames().getName()+" adlı oyunu indirimle "+getCampaign().getGames().getPriceAfterDiscpunt()+" fiyatına satın aldı");
    }
    @Override
    public String toString() {
        return "SalePlace{" +
                "gamer=" + gamer +
                ", game=" + game +
                ", campaign=" + campaign +
                '}';
    }

}
