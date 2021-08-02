package com.keyword;

import java.util.EnumMap;

enum Activity{WALK,TALK,EAT,SLEEP,STUDY}
public class EnumMapRemove
{
    public static void main(String[] args)
    {
        EnumMap<Activity,String> map = new EnumMap<Activity, String>(Activity.class);
        map.put(Activity.WALK,"Walking");
        map.put(Activity.TALK,"Talking");
        map.put(Activity.EAT,"Eating");
        map.put(Activity.SLEEP,"Sleeping");
        map.put(Activity.STUDY,"Studying");
        System.out.println("The Map is "+map);
        map.remove(Activity.SLEEP);
        System.out.println("After removing the Map is "+map);

    }
}
