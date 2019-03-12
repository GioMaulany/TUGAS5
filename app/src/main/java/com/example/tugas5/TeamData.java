package com.example.tugas5;

import java.util.ArrayList;

public class TeamData {
    private static String[] title = new String[]{"Boom","TNC Pro Team","OG", "RRQ","Winstrike","Geek Fam","Virtus Pro","Team Liquid"};
    private static  int[] tumbnail = new int[]{R.drawable.boom,R.drawable.tnc,R.drawable.og,R.drawable.rrq,R.drawable.winstrike,R.drawable.geekfam,R.drawable.virtus_pro,R.drawable.liquid};
    private static String[] descript = new String[]{"BOOM ID is an e-sports organization that was founded in November 2016. They are also active in Counter Strike: Global Offensive.\n" +
            "\n" +
          "On January 30th 2017, the organization entered the Dota 2 scene.","TNC Pro Team is a Southeast Asian multi-gaming organization. They currently field teams in League of Legends, Crossfire, Counter-Strike: Global Offensive, Hearthstone and Dota 2. ","OG was created as the new team of former (monkey) Business players. The team's breakthrough occurred at the Frankfurt Major in late November, 2015. They fought through the lower bracket, defeating TI5 champions and runner-ups, Evil Geniuses and CDEC Gaming. By winning the 2017 Kiev Major, OG became the first team in Dota 2 to win four Dota Major Championships. ",
   "Rex Regum Qeon is an Indonesian Dota team. The team was formed prior to the Asian Cyber Games 2013 tournament.[1] \"Rex Regum\" is latin for \"King of Kings\". Following the breakup of their team after failing to qualify for TI4, Qeon Interactive has decided to re-enter the South East Asian Dota 2 scene, picking up a brand new team from Indonesia. ",
   "Winstrike Team is a Russian organization with teams in CS:GO, Dota 2, Overwatch and Fortnite. ",
    "Geek Fam is a Malaysian esports team established in November 2016.",
    "Virtus.pro is a professional gaming organization based in Russia.\n" +
            "\n" +
            "The organization was represented by more than 50 players. Since 2003 they have won more than 100 gold, 170 silver and 220 bronze medals in more than 10 esports disciplines.[1]\n" +
            "\n" +
            "They added their women's team on September 5, 2012.[2]\n" +
            "\n" +
            "Virtus.pro Polar was formed on September 18, 2014[3] by NVMI players. It was later rebranded to ASUS.Polar as an attempt to create a separate brand under a single ownership, but it didn't turn out to be a success and the team was merged with the main Virtus.pro roster and ceased to exist as a brand.[4]\n" +
            "\n" +
            "At the end of the first transfer deadline before the first Major in 2015, Virtus.pro announce their subs.[5]\n" +
           "\n" +
           "On May 30th 2016, after accusations that the team had used No[o]ne as a standin for ALOHADANCE in The Summit 5 Qualifiers Finals vs Ad Finem, using ALOHADANCE's account to hide the action, Virtus.pro admitted that they had broken the rules, and were removed from the tournament.[6]\n" +
            "\n" +
            "The entire Dota 2 squad was dropped by the organization on 30 June 2016,[7] after increasingly poor results culminated in a disappointing 6th place finish in the Qualifiers for The International 2016, thus failing to qualify for yet another event. Following the International, Virtus pro later revamped their Dota 2 squad and won The Summit 6.[8] "
   ,"Team Liquid is a professional team, founded in the Netherlands in 2000. Originally a Brood War clan, the team switched to StarCraft II during the SC2 Beta in 2010, and became one of the most successful western teams. On December 6, 2012, it was announced that the team had formed a Dota 2 division.[1]\n" +
           "\n" +
          "Team Liquid is also strongly associated with its website, TeamLiquid.net. Launched on May 1, 2001, it has developed through the years into a focal point for StarCraft and Dota 2 coverage, eventually becoming the most-browsed StarCraft-related website in the world, gathering thousands of members (including several professional players) and centralizing news about the global SC2 scene. On August 30, 2012, Teamliquid.net announced expansion into Dota 2 coverage.[2] The website also features a progaming database, the TLPD, as well as a wiki dedicated to Brood War, StarCraft II, Hearthstone, Dota 2, Super Smash Brothers: Melee, Heroes of the Storm and Overwatch, Liquipedia. "};
    public static ArrayList<TeamModel> getListData (){
        TeamModel tm = null;
        ArrayList<TeamModel> list = new ArrayList<>();
        for (int i = 0;i<title.length;i++){
            tm = new TeamModel();
            tm.setTeam_logo(tumbnail[i]);
            tm.setTeam_name(title[i]);
            tm.setTeam_desc(descript[i]);
            list.add(tm);
        }return list;
    }
}
