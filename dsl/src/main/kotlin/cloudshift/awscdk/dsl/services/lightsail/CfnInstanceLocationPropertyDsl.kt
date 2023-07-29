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
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `Location` is a property of the
 * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
 * resource. It describes the location for an instance.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-location.html)
 */
@CdkDslMarker
public class CfnInstanceLocationPropertyDsl {
    private val cdkBuilder: CfnInstance.LocationProperty.Builder =
        CfnInstance.LocationProperty.builder()

    /** @param availabilityZone The Availability Zone for the instance. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param regionName The name of the AWS Region for the instance. */
    public fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
    }

    public fun build(): CfnInstance.LocationProperty = cdkBuilder.build()
}
