package net.wyvest.modthattellsyoutogetoffwyvtils;

import gg.essential.universal.ChatColor;
import gg.essential.universal.UDesktop;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.common.FMLCommonHandler;

import java.io.IOException;
import java.net.URI;

public class DeadGui extends GuiScreen {
    private final String[] lines = {ChatColor.RED + "Wyvtils is no longer available or supported.", ChatColor.YELLOW + "You can find downloads for alternatives by clicking the button below.", "Thanks for downloading Wyvtils!"};

    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.add(new GuiButton(0, width / 2 - 100, height - 50, 200, 20, "Alternatives List"));
        this.buttonList.add(new GuiButton(1, width / 2 - 100, height - 28, 200, 20, "Exit Game"));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();

        int offset = Math.max(85 - lines.length * 10, 10);

        for (String line : lines) {
            this.drawCenteredString(mc.fontRendererObj, line, width / 2, offset, -1);
            offset += mc.fontRendererObj.FONT_HEIGHT + 2;
        }

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);
        switch (button.id) {
            case 0:
                UDesktop.browse(URI.create("https://woverflow.cc/wyvtils"));
                break;
            case 1:
                FMLCommonHandler.instance().exitJava(1, false);
        }
    }
}
