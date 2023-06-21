package com.github.sqyyy.fabriccomputers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class FabricComputersClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
            drawContext.fillGradient(0, 0, 128, 128, 0xff00ff00, 0x000000ff);
//            drawContext.fill(0, 0, 128, 128, 0xff00ffff);
            drawContext.draw();
        });
    }
}
