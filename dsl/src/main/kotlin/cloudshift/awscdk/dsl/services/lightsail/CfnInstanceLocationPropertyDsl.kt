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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lightsail.CfnInstance
import kotlin.String

@CdkDslMarker
public class CfnInstanceLocationPropertyDsl {
    private val cdkBuilder: CfnInstance.LocationProperty.Builder =
        CfnInstance.LocationProperty.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
    }

    public fun build(): CfnInstance.LocationProperty = cdkBuilder.build()
}
