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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnRule
import kotlin.String

@CdkDslMarker
public class CfnRulePlacementStrategyPropertyDsl {
    private val cdkBuilder: CfnRule.PlacementStrategyProperty.Builder =
        CfnRule.PlacementStrategyProperty.builder()

    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnRule.PlacementStrategyProperty = cdkBuilder.build()
}
