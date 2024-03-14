package io.cloudshiftdev.awscdk

public enum class CfnTrafficRoutingType(
    private val cdkObject: software.amazon.awscdk.CfnTrafficRoutingType,
) {
    ALL_AT_ONCE(software.amazon.awscdk.CfnTrafficRoutingType.ALL_AT_ONCE),
    TIME_BASED_CANARY(software.amazon.awscdk.CfnTrafficRoutingType.TIME_BASED_CANARY),
    TIME_BASED_LINEAR(software.amazon.awscdk.CfnTrafficRoutingType.TIME_BASED_LINEAR),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.CfnTrafficRoutingType
        ): CfnTrafficRoutingType =
            when (cdkObject) {
                software.amazon.awscdk.CfnTrafficRoutingType.ALL_AT_ONCE ->
                    CfnTrafficRoutingType.ALL_AT_ONCE
                software.amazon.awscdk.CfnTrafficRoutingType.TIME_BASED_CANARY ->
                    CfnTrafficRoutingType.TIME_BASED_CANARY
                software.amazon.awscdk.CfnTrafficRoutingType.TIME_BASED_LINEAR ->
                    CfnTrafficRoutingType.TIME_BASED_LINEAR
            }

        internal fun unwrap(
            wrapped: CfnTrafficRoutingType
        ): software.amazon.awscdk.CfnTrafficRoutingType = wrapped.cdkObject
    }
}
