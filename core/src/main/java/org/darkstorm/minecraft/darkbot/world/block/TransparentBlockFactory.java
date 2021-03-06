package org.darkstorm.minecraft.darkbot.world.block;

import org.darkstorm.minecraft.darkbot.world.*;

public class TransparentBlockFactory implements BlockFactory<Block> {
	private static class BasicBlock extends AbstractBlock {
		public BasicBlock(World world, Chunk chunk, BlockLocation location, int id, int metadata) {
			super(world, chunk, location, id, metadata);
		}
		
		@Override
		public BoundingBox[] getBoundingBoxes() {
			return new BoundingBox[0];
		}
		
		@Override
		public BoundingBox getConvexBoundingBox() {
			return EMPTY;
		}
	}
	
	private static final BoundingBox EMPTY = BoundingBox.getBoundingBox(0, 0, 0, 0, 0, 0);
	
	private final BlockType type;
	
	protected TransparentBlockFactory(BlockType type) {
		this.type = type;
	}
	
	@Override
	public Block createBlock(World world, Chunk chunk, BlockLocation location, int metadata) {
		return new BasicBlock(world, chunk, location, type.getId(), metadata);
	}
	
	@Override
	public BlockType getType() {
		return type;
	}
	
	public static TransparentBlockFactory getInstance(BlockType type) {
		return new TransparentBlockFactory(type);
	}
}
