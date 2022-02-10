package net.wyvest.modthattellsyoutogetoffwyvtils;

import gg.essential.api.EssentialAPI;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(name = "TheModThatTellsYouToGetOffWyvtils", modid = "themodthattellsyoutogetoffwyvtils", version = "1.0.0")
public class TheModThatTellsYouToGetOffWyvtils {
    @Mod.EventHandler
    protected void onInit(FMLInitializationEvent event) {
        EssentialAPI.getGuiUtil().openScreen(new DeadGui());
    }
}
