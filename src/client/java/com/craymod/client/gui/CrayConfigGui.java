package com.craymod.client.gui;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.controller.BooleanControllerBuilder;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class CrayConfigGui {
    public static Screen createScreen(Screen parent) {
        return YetAnotherConfigLib.createBuilder()
                .title(Component.literal("Cray Mod Configuration"))
                .category(ConfigCategory.createBuilder()
                        .name(Component.literal("General"))
                        .tooltip(Component.literal("General settings for Cray Mod"))
                        .group(OptionGroup.createBuilder()
                                .name(Component.literal("Test Settings"))
                                .option(Option.<Boolean>createBuilder()
                                        .name(Component.literal("Test Option"))
                                        .description(OptionDescription.of(Component.literal("This is a placeholder option for testing the GUI.")))
                                        .binding(
                                                false, // Default value
                                                () -> false, // Getter
                                                newValue -> { /* Setter */ }
                                        )
                                        .controller(opt -> BooleanControllerBuilder.create(opt).yesNoFormatter())
                                        .build())
                                .build())
                        .build())
                .build()
                .generateScreen(parent);
    }
}