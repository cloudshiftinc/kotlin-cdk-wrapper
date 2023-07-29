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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDisk

/**
 * Location of a resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * LocationProperty locationProperty = LocationProperty.builder()
 * .availabilityZone("availabilityZone")
 * .regionName("regionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-location.html)
 */
@CdkDslMarker
public class CfnDiskLocationPropertyDsl {
    private val cdkBuilder: CfnDisk.LocationProperty.Builder = CfnDisk.LocationProperty.builder()

    /**
     * @param availabilityZone The Availability Zone in which to create your disk. Use the following
     *   format: us-east-2a (case sensitive). Be sure to add the include Availability Zones
     *   parameter to your request.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param regionName The Region Name in which to create your disk. */
    public fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
    }

    public fun build(): CfnDisk.LocationProperty = cdkBuilder.build()
}
