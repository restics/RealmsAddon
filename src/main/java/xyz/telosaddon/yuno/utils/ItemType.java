package xyz.telosaddon.yuno.utils;

import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import xyz.telosaddon.yuno.TelosAddon;

public enum ItemType {

	UT_HERALD_ESSENCE,
	EX_HERALD_ESSENCE,
	OBELISK,
	UT_AYAHUASCA_FLASK,
	EX_AYAHUASCA_FLASK,
	UT_MALICE,
	EX_MALICE;

	public static @Nullable ItemType fromItemStack(ItemStack item){
		String name = item.getName().getString().trim();
		String trimmedName = name.substring(1, name.length()-1);
		if(trimmedName.equals("\uD83E\uDF45"))
			return UT_HERALD_ESSENCE;
		if(trimmedName.equals("\uD83E\uDF46"))
			return EX_HERALD_ESSENCE;
		if(trimmedName.equals("\uD857\uDD93"))
			return OBELISK;
		if(trimmedName.equals("\uD83E\uDF9D"))
			return UT_AYAHUASCA_FLASK;
		if(trimmedName.equals("\uD83E\uDF9C"))
			return EX_AYAHUASCA_FLASK;
		if(trimmedName.equals("\uD83D\uDD25"))
			return UT_MALICE;
		if(trimmedName.equals("\uD83D\uDE18"))
			return EX_MALICE;

		return null;
	}
}
