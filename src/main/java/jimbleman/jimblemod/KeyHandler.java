package jimbleman.jimblemod;

import net.minecraft.client.settings.GameSettings;
import net.minecraftforge.fml.client.FMLClientHandler;

public class KeyHandler {
    public static boolean isKeyDown(Key key) {
        GameSettings settings = FMLClientHandler.instance().getClient().gameSettings;

        switch (key) {
            case Forward:
                return settings.keyBindForward.isKeyDown();
            case Back:
                return settings.keyBindBack.isKeyDown();
            case Left:
                return settings.keyBindLeft.isKeyDown();
            case Right:
                return settings.keyBindRight.isKeyDown();
            case Jump:
                return settings.keyBindJump.isKeyDown();
            case Sneak:
                return settings.keyBindSneak.isKeyDown();
            default:
                return false;
        }
    }

    public static boolean isAnyKeyDown(Key[] keys) {
        for (Key key : keys) {
            if (isKeyDown(key)) {
                return true;
            }
        }
        return false;
    }

    public static boolean areAllKeysDown(Key[] keys) {
        for (Key key : keys) {
            if (!isKeyDown(key)) {
                return false;
            }
        }
        return true;
    }
}
