package com.project.IPL.utils;

import java.util.Random;

public class RandomDescriptionGenerator {

    private static String[] descriptionForOffer =
            {"Users", "Downloader per month", "Roster Files", "Unlimited Downlodes",
                    "Fully-Editable Files", "Custom Packs", "200+ Custom Icons"};

    public static String getDescriptionForOffer() {
        Random random = new Random();
        int randomIndex = random.nextInt(descriptionForOffer.length);
        return descriptionForOffer[randomIndex];
    }

    private static final String[] descriptionForSubscription =
            {"Freelancers", "Teams", "Students", "Organization",
                    "agencies"};

    public static String getDescriptionForSubscription() {
        Random random = new Random();
        int randomIndex = random.nextInt(descriptionForSubscription.length);
        return descriptionForSubscription[randomIndex];
    }

    private static final String[] types = {"gold", "silver", "platinum", "free"};

    public static String getTypes() {
        Random random = new Random();
        int randomIndex = random.nextInt(types.length);
        return types[randomIndex];
    }

}
