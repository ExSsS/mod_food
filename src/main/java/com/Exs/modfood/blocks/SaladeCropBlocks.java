package com.Exs.modfood.blocks;

import com.Exs.modfood.init.ModBlocks;
import com.Exs.modfood.init.ModItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.state.IProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.chunk.BlockStateContainer;

import java.util.Random;

public class SaladeCropBlocks extends BlockCrops {

    public static final IntegerProperty CROP_AGE = IntegerProperty.create("age",0,4);

    public SaladeCropBlocks(Properties builder) {
        super(builder);

    }

    @Override
    protected boolean isValidGround(IBlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.getBlock() == Blocks.FARMLAND;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return CROP_AGE;
    }

    @Override
    public int getMaxAge() {
        return 4;
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModItem.SALAD_SEED_ITEM;
    }

    @Override
    protected IItemProvider getCropsItem() {
        return ModItem.SALAD;
    }


    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return 3;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return true;
    }

}
