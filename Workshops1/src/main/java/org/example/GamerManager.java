package org.example;

import java.util.ArrayList;
import java.util.List;

public class GamerManager extends BaseUserManager{

    private GamerCheckService gamerCheckService;
    List<User> gamerList;

    public GamerManager(GamerCheckService gamerCheckService, List<User> gamers) {
        this.gamerCheckService = gamerCheckService;
        this.gamerList = gamers;
    }

    public void save(User user) {
        if (gamerCheckService.CheckIfRealPerson(user))
        {
            super.save(user);
            addGamer(user);
        }
        else {
            System.out.println("Oyuncu eklenemedi");
        }
    }

    public  void  addGamer(User gamer){
        gamerList.add(gamer);
    }
    public void deleteGamer(Gamer gamer){
        gamerList.remove(gamer);
    }

    public void update(int id, User user) {
        boolean a = false;
        for (User user1 : gamerList) {
            if (id == user1.getId()) {
                a=true;
                gamerList.remove(user1);
                addGamer(user);
                System.out.println("oyuncu güncellendi");
            }
        }
        if (a==false){
            System.out.println("güncellenemedi");
        }

    }

    public List<User> getList()
    {
        return gamerList;
    }

    @Override
    public String toString() {
        return "GamerManager{" +
                "gamers=" + gamerList +
                '}';
    }
}
