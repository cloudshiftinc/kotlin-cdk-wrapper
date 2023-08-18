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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Suppresses the specified device included in the block device mapping of the AMI.
 *
 * To suppress a device, specify an empty string.
 *
 * `NoDevice` is a property of the
 * [Amazon EC2 BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html)
 * property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NoDeviceProperty noDeviceProperty = NoDeviceProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-nodevice.html)
 */
@CdkDslMarker
public class CfnInstanceNoDevicePropertyDsl {
    private val cdkBuilder: CfnInstance.NoDeviceProperty.Builder =
        CfnInstance.NoDeviceProperty.builder()

    public fun build(): CfnInstance.NoDeviceProperty = cdkBuilder.build()
}
