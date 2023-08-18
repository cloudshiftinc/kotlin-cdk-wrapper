@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnSite

/**
 * Describes a location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * LocationProperty locationProperty = LocationProperty.builder()
 * .address("address")
 * .latitude("latitude")
 * .longitude("longitude")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html)
 */
@CdkDslMarker
public class CfnSiteLocationPropertyDsl {
    private val cdkBuilder: CfnSite.LocationProperty.Builder = CfnSite.LocationProperty.builder()

    /** @param address The physical address. */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /** @param latitude The latitude. */
    public fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
    }

    /** @param longitude The longitude. */
    public fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
    }

    public fun build(): CfnSite.LocationProperty = cdkBuilder.build()
}
