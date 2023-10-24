package net.wqewqeewee.sneakhack;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SneakHack implements ModInitializer {
	public static final String MOD_ID = "sneakhack";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ActivateSneak.init();
	}
}