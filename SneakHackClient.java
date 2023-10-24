package net.wqewqeewee.sneakhack;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class SneakHackClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ActivateSneak.init();
    }
}
