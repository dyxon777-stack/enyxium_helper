package com.enyxium.helper.modules;

import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;

public class AhHelper {
    public static void searchCurrentItem(boolean isMarket) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;
        ItemStack item = client.player.getMainHandStack();
        if (item.isEmpty()) return;
        String cleanName = item.getName().getString().replaceAll("§[0-9a-fk-or]", "").replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").trim();
        if (!cleanName.isEmpty()) {
            client.player.networkHandler.sendChatCommand((isMarket ? "market search " : "ah search ") + cleanName);
        }
    }
}
