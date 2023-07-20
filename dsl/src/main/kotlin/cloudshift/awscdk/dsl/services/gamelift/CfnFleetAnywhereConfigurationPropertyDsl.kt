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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.gamelift.CfnFleet
import kotlin.String

@CdkDslMarker
public class CfnFleetAnywhereConfigurationPropertyDsl {
    private val cdkBuilder: CfnFleet.AnywhereConfigurationProperty.Builder =
        CfnFleet.AnywhereConfigurationProperty.builder()

    public fun cost(cost: String) {
        cdkBuilder.cost(cost)
    }

    public fun build(): CfnFleet.AnywhereConfigurationProperty = cdkBuilder.build()
}
