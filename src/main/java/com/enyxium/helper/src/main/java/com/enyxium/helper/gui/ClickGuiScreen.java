package com.enyxium.helper.gui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ClickGuiScreen extends Screen {
    public ClickGuiScreen() { super(Text.literal("Enyxium Helper Ultimate")); }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        int w = 360, h = 240;
        int x = (this.width - w) / 2, y = (this.height - h) / 2;

        context.fill(x, y, x + w, y + h, 0xF00D0D0D);
        context.drawBorder(x, y, w, h, 0xFFFFFFFF);
        context.drawBorder(x + 1, y + 1, w - 2, h - 2, 0xFF333333);

        context.drawText(this.textRenderer, "ENYXIUM HELPER", x + 16, y + 16, 0xFFFFFFFF, true);
        context.drawText(this.textRenderer, "[ULTIMATE EDITION]", x + 140, y + 16, 0xFF888888, true);

        drawCard(context, "AhHelper / Market Auto-Search", "ACTIVE", x + 16, y + 45);
        drawCard(context, "TargetHUD & ESP Overlay", "ENABLED", x + 16, y + 85);
        drawCard(context, "ChatFilter & Anti-Spam", "PROTECTED", x + 16, y + 125);
        drawCard(context, "FPS Optimizer & Liquid Blur", "BOOSTED", x + 16, y + 165);

        super.render(context, mouseX, mouseY, delta);
    }

    private void drawCard(DrawContext context, String title, String status, int x, int y) {
        context.fill(x, y, x + 328, y + 32, 0x30FFFFFF);
        context.drawBorder(x, y, 328, 32, 0x20FFFFFF);
        context.drawText(this.textRenderer, "• " + title, x + 10, y + 6, 0xFFFFFFFF, true);
        context.drawText(this.textRenderer, "  Status: " + status, x + 10, y + 18, 0xFF55FF55, true);
    }

    @Override public boolean shouldPause() { return false; }
}
