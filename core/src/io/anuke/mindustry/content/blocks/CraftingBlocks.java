package io.anuke.mindustry.content.blocks;

import io.anuke.mindustry.content.Items;
import io.anuke.mindustry.content.Liquids;
import io.anuke.mindustry.graphics.Fx;
import io.anuke.mindustry.resource.Item;
import io.anuke.mindustry.resource.ItemStack;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.blocks.types.production.*;

public class CraftingBlocks {
    public static final Block

    smelter = new Smelter("smelter") {{
        health = 70;
        inputs = new Item[]{Items.iron};
        fuel = Items.coal;
        result = Items.steel;
        craftTime = 25f;
    }},

    alloysmelter = new Smelter("alloysmelter") {{
        health = 90;
        inputs = new Item[]{Items.titanium, Items.steel};
        fuel = Items.coal;
        result = Items.densealloy;
        burnDuration = 45f;
        craftTime = 25f;
    }},

    poweralloysmelter = new PowerSmelter("poweralloysmelter") {{
        health = 90;
        craftEffect = Fx.smeltsmoke;
        inputs = new ItemStack[]{new ItemStack(Items.titanium, 4), new ItemStack(Items.thorium, 4)};
        result = Items.densealloy;
        powerUse = 0.3f;
        craftTime = 25f;
        size = 2;
    }},

    powersmelter = new PowerSmelter("powersmelter") {{
        health = 90;
        craftEffect = Fx.smeltsmoke;
        inputs = new ItemStack[]{new ItemStack(Items.coal, 1), new ItemStack(Items.iron, 1)};
        result = Items.steel;
        powerUse = 0.1f;
        craftTime = 25f;
        size = 2;
    }},

    cryofluidmixer = new LiquidMixer("cryofluidmixer") {{
        health = 200;
        inputLiquid = Liquids.water;
        outputLiquid = Liquids.cryofluid;
        inputItem = Items.titanium;
        liquidPerItem = 50f;
        itemCapacity = 50;
        powerUse = 0.1f;
        size = 2;
    }},

    melter = new PowerCrafter("melter") {{
        health = 200;
        outputLiquid = Liquids.lava;
        outputLiquidAmount = 0.05f;
        input = new ItemStack(Items.stone, 1);
        itemCapacity = 50;
        craftTime = 10f;
        powerUse = 0.1f;
        hasLiquids = hasPower = true;
    }},

    separator = new Separator("separator") {{
        liquid = Liquids.water;
        item = Items.stone;
        results = new Item[]{
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            Items.stone, Items.stone, Items.stone, Items.stone, Items.stone, Items.stone, Items.stone, Items.stone, Items.stone,
            Items.iron, Items.iron, Items.iron, Items.iron,
            Items.lead, Items.lead,
            Items.coal, Items.coal,
            Items.titanium
        };

        liquidUse = 0.2f;
        filterTime = 40f;
        itemCapacity = 40;

        health = 50;
    }},

    centrifuge = new GenericCrafter("centrifuge") {{
        inputItem = new ItemStack(Items.stone, 6);
        inputLiquid = Liquids.water;
        liquidUse = 0.1f;
        output = Items.coal;
        health = 50;
        craftTime = 50;
        hasInventory = hasLiquids = true;
        size = 2;
    }},

    plasticFormer = new GenericCrafter("plasticformer") {{
        inputLiquid = Liquids.oil;
        liquidUse = 0.3f;
        liquidCapacity = 60f;
        powerUse = 0.3f;
        craftTime = 80f;
        output = Items.plastic;
        itemCapacity = 30;
        size = 2;
        health = 320;
        hasPower = hasLiquids = true;
    }},

    biomatterCompressor = new Compressor("biomattercompressor") {{
        input = new ItemStack(Items.biomatter, 1);
        liquidCapacity = 60f;
        itemCapacity = 50;
        powerUse = 0.05f;
        craftTime = 10f;
        outputLiquid = Liquids.oil;
        outputLiquidAmount = 0.08f;
        size = 2;
        health = 320;
        hasLiquids = true;
    }},

    oilRefinery = new GenericCrafter("oilrefinery") {{
        inputLiquid = Liquids.oil;
        liquidUse = 0.1f;
        liquidCapacity = 56f;
        output = Items.coal;
        health = 80;
        craftEffect = Fx.purifyoil;
        hasInventory = hasLiquids = true;
    }},

    stoneFormer = new GenericCrafter("stoneformer") {{
        inputLiquid = Liquids.lava;
        liquidUse = 0.1f;
        liquidCapacity = 21f;
        craftTime = 12;
        output = Items.stone;
        health = 80;
        craftEffect = Fx.purifystone;
    }},

    weaponFactory = new WeaponFactory("weaponfactory") {{
        size = 2;
        health = 250;
    }};
}
