package de.revivemc;

import de.revivemc.events.GenericListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class ReviveMCDiscord {


    public static void main(String[] args) throws InterruptedException {
        JDA jda = JDABuilder.createDefault("MTI4MDU4NjcwMDEwMzQ4MzUxNQ.G298fz.QguALi35OQbPk7N_XtEED73c9X82qbMRSMW6pw")
                .addEventListeners(new GenericListener())
                .build();

        jda.awaitReady();
    }
}