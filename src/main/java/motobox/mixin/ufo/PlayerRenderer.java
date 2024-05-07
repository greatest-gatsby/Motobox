package motobox.mixin.ufo;

import motobox.entity.ufo.AbstractUfoEntity;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntityRenderer.class)
public class PlayerRenderer {
    @Inject(method = "Lnet/minecraft/client/render/entity/PlayerEntityRenderer;render(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V", at = @At("HEAD"), cancellable = true)
    public void render(AbstractClientPlayerEntity player, float f, float g, MatrixStack matrices, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (player.hasVehicle() && player.getVehicle() instanceof AbstractUfoEntity) {
            //ci.cancel();
        }
    }
}