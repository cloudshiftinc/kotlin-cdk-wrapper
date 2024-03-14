package io.cloudshiftdev.awscdk.services.appconfig

public enum class GrowthType(
    private val cdkObject: software.amazon.awscdk.services.appconfig.GrowthType,
) {
    LINEAR(software.amazon.awscdk.services.appconfig.GrowthType.LINEAR),
    EXPONENTIAL(software.amazon.awscdk.services.appconfig.GrowthType.EXPONENTIAL),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.GrowthType
        ): GrowthType =
            when (cdkObject) {
                software.amazon.awscdk.services.appconfig.GrowthType.LINEAR -> GrowthType.LINEAR
                software.amazon.awscdk.services.appconfig.GrowthType.EXPONENTIAL ->
                    GrowthType.EXPONENTIAL
            }

        internal fun unwrap(
            wrapped: GrowthType
        ): software.amazon.awscdk.services.appconfig.GrowthType = wrapped.cdkObject
    }
}
