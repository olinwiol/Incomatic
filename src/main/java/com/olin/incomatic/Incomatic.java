package com.olin.incomatic;

import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.simibubi.create.foundation.data.CreateRegistrate;

@Mod(Incomatic.MODID)
public class Incomatic {
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "incomatic";

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(Incomatic.MODID);

    public Incomatic() {
        LOGGER.info("Create Incomatic is loaded.");
    }

}
