package motobox.vehicle.attachment.rear;

import motobox.entity.VehicleEntity;
import motobox.vehicle.attachment.RearAttachmentType;
import net.minecraft.block.BlockState;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;

public class SaddledBarrelRearAttachment extends ChestRearAttachment {
    public SaddledBarrelRearAttachment(RearAttachmentType<?> type, VehicleEntity entity, BlockState block, @Nullable BiFunction<ScreenHandlerContext, BlockRearAttachment, NamedScreenHandlerFactory> screenProvider) {
        super(type, entity, block, screenProvider);
    }

    @Override
    protected SoundEvent getOpenSound() {
        return SoundEvents.BLOCK_BARREL_OPEN;
    }

    @Override
    protected SoundEvent getCloseSound() {
        return SoundEvents.BLOCK_BARREL_CLOSE;
    }

    @Override
    public Text getDisplayName() {
        return TITLE_BARREL;
    }

    @Override
    public boolean isRideable() {
        return true;
    }

    @Override
    public double getPassengerHeightOffset() {
        return 0.94;
    }
}
