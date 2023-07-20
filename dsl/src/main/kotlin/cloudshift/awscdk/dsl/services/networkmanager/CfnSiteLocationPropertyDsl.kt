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
import software.amazon.awscdk.services.networkmanager.CfnSite
import kotlin.String

@CdkDslMarker
public class CfnSiteLocationPropertyDsl {
    private val cdkBuilder: CfnSite.LocationProperty.Builder = CfnSite.LocationProperty.builder()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
    }

    public fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
    }

    public fun build(): CfnSite.LocationProperty = cdkBuilder.build()
}
