package buildcraft.core;

import buildcraft.api.tools.IToolWrench;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import buildcraft.core.DefaultProps;
public class ItemWrench extends ItemBuildCraft implements IToolWrench {

	public ItemWrench(int i) {
		super(i);
		setCreativeTab(DefaultProps.CREATIVE_TAB);
	}

	@Override
	public boolean canWrench(EntityPlayer player, int x, int y, int z) {
		return true;
	}

	@Override
	public void wrenchUsed(EntityPlayer player, int x, int y, int z) {}
}
