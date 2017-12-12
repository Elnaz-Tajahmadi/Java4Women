package tes4zack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Tes4Zack {

    public static void main(String[] args) {
        String[] his = {"zack", "arvid", "william", "Anna", "albert", "agust", "doris"};
        String[] hers = {"stefan", "sara", "sune", "lotta", "Anna", "adam", "albert", "anton"};
        String[] zack = {"hugo", "albert", "arvid", "anna"};

        ArrayList<String> hisFriend = new ArrayList<>(Arrays.asList(his));
        ArrayList<String> herFriend = new ArrayList<>(Arrays.asList(hers));
        ArrayList<String> zacksFriend = new ArrayList<>(Arrays.asList(zack));

        //invait all to party
        HashSet<String> invited = new HashSet<>(hisFriend);
        invited.addAll(herFriend);
        //but zack is not invited
        invited.remove(zack);
        //no anyone zacks frinde
        invited.removeAll(zacksFriend);
        //if both doris and william is invited remove william
        if (invited.contains("doris") && invited.contains("william")) {
            invited.remove("william");
            //if Lotta is invited remove all quests whos name starts with an a
            Iterator<String> iter = invited.iterator();
            while (iter.hasNext()) {
                String who = iter.next();
                if (who.startsWith("A")) {
                    iter.remove();
                }
            }
            //create a random placment list
            ArrayList<String> invitedList = new ArrayList<>(invited);
            Collections.shuffle(invitedList);
        }
    }
}
