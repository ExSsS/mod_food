package com.Exs.modfood;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModFood.MOD_ID)
public class ModFood {
    public static final String MOD_ID = "modfood";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public ModFood()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    private void setup(final FMLCommonSetupEvent e)
    {
        LOGGER.info("modfood setup");
    }

    private  void clientSetup(final FMLCommonSetupEvent e)
    {
        LOGGER.info("modfood client setup");
    }

    private void serverSetup(final FMLCommonSetupEvent e)
    {
        LOGGER.info("modfood server setup");
    }

}
