package com.kue7heh.guardvillagersianasupport.mixin;

import com.kue7heh.guardvillagersianasupport.RangedGunAttackGoalGuard;
import net.minecraft.world.entity.Mob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tallestegg.guardvillagers.common.entities.Guard;

@Mixin(Guard.class)
public abstract class GuardMixin {
    @Inject(method = "registerGoals", at = @At("TAIL"))
    private void guardvillagersianasupport$addIanaGunGoal(CallbackInfo ci) {
        Guard guard = (Guard)(Object)this;
        ((Mob)(Object)this).goalSelector.addGoal(2, new RangedGunAttackGoalGuard(guard));
    }
}