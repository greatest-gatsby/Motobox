package motobox.entity;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.entry.RegistryEntry;

public class VehicleDamageSource extends DamageSource {
    protected VehicleDamageSource(String name) {
        super(RegistryEntry.of(new DamageType("vehicle_damage", 0.1f)));
    }
}
