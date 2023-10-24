package net.wqewqeewee.sneakhack;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.InputUtil;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;

public class ActivateSneak {
    private static boolean isSneaking = false;

    public static void init() {
        ClientTickEvents.START_CLIENT_TICK.register(client -> {
            sneakKey(client);
        });
    }
    private static void sneakKey(MinecraftClient client) {
        ClientPlayerEntity player = client.player;

        if (player != null && InputUtil.isKeyPressed(client.getWindow().getHandle(),
                InputUtil.fromTranslationKey("key.keyboard.z").getCode())) {
            player.networkHandler.sendPacket(new ClientCommandC2SPacket(player, ClientCommandC2SPacket.Mode.PRESS_SHIFT_KEY));

            player.setSneaking(true);

            isSneaking = true;
        } else {
            isSneaking = false;
        }

        if (isSneaking) {
            //CustomTextRenderer.drawText("Sneak", 2, 2);
        }
    }
}