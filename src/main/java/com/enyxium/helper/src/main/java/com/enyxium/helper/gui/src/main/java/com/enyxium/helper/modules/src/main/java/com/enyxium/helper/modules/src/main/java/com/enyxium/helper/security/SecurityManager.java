package com.enyxium.helper.security;

import net.minecraft.client.MinecraftClient;

public class SecurityManager {
    public static void verify() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.getSession() == null) return;
    }
}
