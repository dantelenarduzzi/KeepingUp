package com.example.keepingup;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link featured#newInstance} factory method to
 * create an instance of this fragment.
 */
public class featured extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public featured() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment featured.
     */
    // TODO: Rename and change types and number of parameters
    public static featured newInstance(String param1, String param2) {
        featured fragment = new featured();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_featured, container, false);
       CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(getChildFragmentManager());
        ViewPager viewPager = view.findViewById(R.id.featuredContent);
        viewPager.setAdapter(adapter);
        return view;


    }

    public class CustomViewPagerAdapter extends FragmentPagerAdapter {


        public CustomViewPagerAdapter(FragmentManager fm) {
            super(fm);
    }

              @NonNull
              @Override
        public Fragment getItem(int position) {

                      switch (position) {
                          case 0:
                              return featuredFragment.newInstance("World of Warcraft", "World of Warcraft (WoW)" +
                                      " is a massively multiplayer online role-playing game (MMORPG) released in 2004 by Blizzard Entertainment. " +
                                      "It is the fourth released game set in the Warcraft fantasy universe.");
                          case 1:
                              return featuredFragment.newInstance("League Of Legends", "League of Legends is a team-based strategy game where two teams of five powerful champions face off to destroy the other's base. " +
                                      "Choose from over 140 champions to make epic plays, secure kills, and take down towers as you battle your way to victory.");
                          case 2:
                              return featuredFragment.newInstance("Counter-Strike: Global Offensive", "The game pits two teams against each other: the Terrorists and the Counter-Terrorists. " +
                                      "Both sides are tasked with eliminating the other while also completing separate objectives.");
                          case 3:
                              return featuredFragment.newInstance("Slay the Spire ", "In Slay the Spire, the player, through one of four characters, attempts to ascend a spire of multiple floors, created through procedural generation, battling through enemies and bosses. Combat takes place through a collectible card game-based system, with the player gaining new cards as rewards from combat and other means, " +
                                      "requiring the player to use strategies of deck-building games to construct an effective deck to complete the climb.");
                          case 4:
                              return featuredFragment.newInstance("Escape from Tarkov", "The game is set in the fictional Norvinsk region in Northwest Russia, where a war is taking place between two private military companies (United Security \"USEC\" and the Battle Encounter Assault Regiment \"BEAR\"). " +
                                      "Players join matches in which they fight other players for loot and aim to survive and escape; dying results in the loss of almost all items the player used and found during that game.");
                          case 5:
                              return featuredFragment.newInstance("Rust ", "The objective of Rust is to survive in the wilderness using gathered or stolen materials. Players must successfully manage their hunger, thirst, and health, or risk dying. Despite the looming threat of bears and wolves, " +
                                      "the primary menace is other players due to the game being solely multiplayer. Combat is accomplished through firearms and various weapons, such as bows. ");
                          case 6:
                              return featuredFragment.newInstance("DayZ ", "The game places the player in the fictional post-Soviet Republic of Chernarus, where a mysterious plague has turned most of the population into violent \"infected\". As a survivor, the player must scavenge the world for food, water, weapons, and medicine, " +
                                      "while killing or avoiding the infected, and killing, avoiding, or cooperating with other players in an effort to survive the outbreak.");
                          default: return featuredFragment.newInstance("Featured","Come back next week for a new selection of games!");

                      }
                  }

        @Override
        public int getCount() {
            return 7;
        }
    }
}