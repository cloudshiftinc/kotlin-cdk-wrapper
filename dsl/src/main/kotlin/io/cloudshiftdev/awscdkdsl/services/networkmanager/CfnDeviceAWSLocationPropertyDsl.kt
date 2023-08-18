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
import software.amazon.awscdk.services.networkmanager.CfnDevice

/**
 * The Amazon Web Services location of the device, if applicable.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * AWSLocationProperty aWSLocationProperty = AWSLocationProperty.builder()
 * .subnetArn("subnetArn")
 * .zone("zone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-awslocation.html)
 */
@CdkDslMarker
public class CfnDeviceAWSLocationPropertyDsl {
    private val cdkBuilder: CfnDevice.AWSLocationProperty.Builder =
        CfnDevice.AWSLocationProperty.builder()

    /**
     * @param subnetArn The Amazon Resource Name (ARN) of the subnet that the device is located in.
     */
    public fun subnetArn(subnetArn: String) {
        cdkBuilder.subnetArn(subnetArn)
    }

    /**
     * @param zone The Zone that the device is located in. Specify the ID of an Availability Zone,
     *   Local Zone, Wavelength Zone, or an Outpost.
     */
    public fun zone(zone: String) {
        cdkBuilder.zone(zone)
    }

    public fun build(): CfnDevice.AWSLocationProperty = cdkBuilder.build()
}
