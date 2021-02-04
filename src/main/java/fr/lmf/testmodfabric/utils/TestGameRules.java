package fr.lmf.testmodfabric.utils;

import fr.lmf.testmodfabric.Main;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameRules;

public class TestGameRules {

    public static final CustomGameRuleCategory TEST_CATEGORY = new CustomGameRuleCategory(new Identifier(Main.MODID, "test"), new TranslatableText("gamerule.category.test").styled(style -> style.withBold(true).withColor(Formatting.DARK_RED)));

    public static final GameRules.Key<GameRules.IntRule> TEST_GAMERULE = GameRuleRegistry.register("test_gamerule", TEST_CATEGORY, GameRuleFactory.createIntRule(9, 0));

    public static void init (){}

}
