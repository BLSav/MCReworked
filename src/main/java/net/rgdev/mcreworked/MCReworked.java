package net.rgdev.mcreworked;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCReworked implements ModInitializer {
	public static final String ID = "mcreworked";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		LOGGER.info(ID + " has successfully been initialized.");


	}
}
