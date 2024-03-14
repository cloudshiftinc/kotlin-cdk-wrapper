package io.cloudshiftdev.awscdk.services.rds

public enum class AuroraCapacityUnit(
    private val cdkObject: software.amazon.awscdk.services.rds.AuroraCapacityUnit,
) {
    ACU_1(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_1),
    ACU_2(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_2),
    ACU_4(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_4),
    ACU_8(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_8),
    ACU_16(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_16),
    ACU_32(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_32),
    ACU_64(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_64),
    ACU_128(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_128),
    ACU_192(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_192),
    ACU_256(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_256),
    ACU_384(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_384),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.AuroraCapacityUnit
        ): AuroraCapacityUnit =
            when (cdkObject) {
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_1 ->
                    AuroraCapacityUnit.ACU_1
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_2 ->
                    AuroraCapacityUnit.ACU_2
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_4 ->
                    AuroraCapacityUnit.ACU_4
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_8 ->
                    AuroraCapacityUnit.ACU_8
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_16 ->
                    AuroraCapacityUnit.ACU_16
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_32 ->
                    AuroraCapacityUnit.ACU_32
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_64 ->
                    AuroraCapacityUnit.ACU_64
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_128 ->
                    AuroraCapacityUnit.ACU_128
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_192 ->
                    AuroraCapacityUnit.ACU_192
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_256 ->
                    AuroraCapacityUnit.ACU_256
                software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_384 ->
                    AuroraCapacityUnit.ACU_384
            }

        internal fun unwrap(
            wrapped: AuroraCapacityUnit
        ): software.amazon.awscdk.services.rds.AuroraCapacityUnit = wrapped.cdkObject
    }
}
