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
import kotlin.String

@CdkDslMarker
public class CfnSchedulePlacementStrategyPropertyDsl {
    private val cdkBuilder: CfnSchedule.PlacementStrategyProperty.Builder =
        CfnSchedule.PlacementStrategyProperty.builder()

    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSchedule.PlacementStrategyProperty = cdkBuilder.build()
}
