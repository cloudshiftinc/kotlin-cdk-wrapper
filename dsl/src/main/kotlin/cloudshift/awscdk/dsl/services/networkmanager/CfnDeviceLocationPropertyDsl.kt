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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkmanager.CfnDevice
import kotlin.String

@CdkDslMarker
public class CfnDeviceLocationPropertyDsl {
    private val cdkBuilder: CfnDevice.LocationProperty.Builder = CfnDevice.LocationProperty.builder()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
    }

    public fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
    }

    public fun build(): CfnDevice.LocationProperty = cdkBuilder.build()
}
