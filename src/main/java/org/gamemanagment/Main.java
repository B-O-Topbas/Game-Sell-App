package org.gamemanagment;

import org.gamemanagment.dao.PlayerManager;
import org.gamemanagment.model.Player;

public class Main {
    public static void main(String[] args) {
        Player player=new Player(1,"Beytullah","Topbaş","12345678901","01.01.2000","12.12.2023","123","asdasdasd@gmail.com",null,null,null);
        Player player1=new Player(1,"Beytullah","Topbaş","12345678901","01.01.2000","12.12.2023","123","asdasdasd@gmail.com",null,null,null);

        PlayerManager playerManager=new PlayerManager();
        playerManager.registerPlayer(player);
        playerManager.registerPlayer(player1);
        playerManager.show();
        playerManager.delete(1);
        playerManager.delete(1);
        System.out.println("----------------------------");
        playerManager.show();
//        playerManager.updateMail("asddkjhagsdhjkadlk@gmail.com");

//        System.out.println(player);

    }
}