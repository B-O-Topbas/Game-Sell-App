package org.gamemanagment.dao;

import org.gamemanagment.model.Player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class PlayerManager {


    private ArrayList<Player> players;

    public PlayerManager() {
       players=new ArrayList<>();
    }

    public void registerPlayer(Player player) {
        if (dogrula(player)){
            System.out.println("Kayit başarili");
            players.add(player);
        }else {
            System.err.println("Böyle birisi yok");
        }

    }
    public void show(){
        for (Player p:players){
            System.out.println(p);
        }
    }
    public void delete(int id){
//        for (Player p:players){
//           if (id==p.getId()){
//               System.out.println("asdkjasd");
//               players.remove(p);
//           }
//        }
        for (int i=0;i<players.size();i++){
            Player p=players.get(i);
            if (p.getId()==id){
                players.remove(i);
            }
        }
    }

//    public void updateMail(String mail){
//        player.seteMail(mail);
//
//    }
//    public void updateUserName(String userName){
//        player.setUserName(userName);
//    }

// * update kısımları gelecek

    public boolean dogrula(Player player) {
        File file = new File("C:\\Users\\dilek\\OneDrive\\Masaüstü\\Odev1\\src\\main\\java\\org\\gamemanagment\\dao\\edevlet.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s;
            while ((s = reader.readLine()) != null) {
                String temp[] = s.split(" ");
                if (temp[0].equals(player.getNationalIdentity()) && temp[1].equals(player.getName()) && temp[2].equals(player.getSurName()) && temp[3].equals(player.getBirthDate())) {
                    return true;
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

}
