package net.incomatic;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class IncomaticBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(Incomatic.MOD_ID);

	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new).register();

	public static void init() {
		// load the class and register everything
		Incomatic.LOGGER.info("Registering blocks for " + Incomatic.NAME);
	}
}
