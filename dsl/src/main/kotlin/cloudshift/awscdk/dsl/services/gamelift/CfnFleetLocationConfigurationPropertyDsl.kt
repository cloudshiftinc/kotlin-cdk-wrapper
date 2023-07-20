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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnFleet
import kotlin.String

@CdkDslMarker
public class CfnFleetLocationConfigurationPropertyDsl {
    private val cdkBuilder: CfnFleet.LocationConfigurationProperty.Builder =
        CfnFleet.LocationConfigurationProperty.builder()

    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    public fun locationCapacity(locationCapacity: IResolvable) {
        cdkBuilder.locationCapacity(locationCapacity)
    }

    public fun locationCapacity(locationCapacity: CfnFleet.LocationCapacityProperty) {
        cdkBuilder.locationCapacity(locationCapacity)
    }

    public fun build(): CfnFleet.LocationConfigurationProperty = cdkBuilder.build()
}
