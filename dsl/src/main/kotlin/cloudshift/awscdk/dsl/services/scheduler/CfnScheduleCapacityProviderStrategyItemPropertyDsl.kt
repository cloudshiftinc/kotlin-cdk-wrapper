@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.scheduler.CfnSchedule
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnScheduleCapacityProviderStrategyItemPropertyDsl {
    private val cdkBuilder: CfnSchedule.CapacityProviderStrategyItemProperty.Builder =
        CfnSchedule.CapacityProviderStrategyItemProperty.builder()

    public fun base(base: Number) {
        cdkBuilder.base(base)
    }

    public fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnSchedule.CapacityProviderStrategyItemProperty = cdkBuilder.build()
}
