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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

/**
 * `BlockDeviceMapping` specifies a block device mapping for the `BlockDeviceMappings` property of
 * the
 * [AWS::AutoScaling::LaunchConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html)
 * resource.
 *
 * Each instance that is launched has an associated root device volume, either an Amazon EBS volume
 * or an instance store volume. You can use block device mappings to specify additional EBS volumes
 * or instance store volumes to attach to an instance when it is launched.
 *
 * For more information, see
 * [Example block device mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#block-device-mapping-ex)
 * in the *Amazon EC2 User Guide for Linux Instances* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .ebs(BlockDeviceProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice(false)
 * .virtualName("virtualName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html)
 */
@CdkDslMarker
public class CfnLaunchConfigurationBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder =
        CfnLaunchConfiguration.BlockDeviceMappingProperty.builder()

    /**
     * @param deviceName The device name assigned to the volume (for example, `/dev/sdh` or `xvdh`
     *   ). For more information, see
     *   [Device naming on Linux instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * To define a block device mapping, set the device name and exactly one of the following
     * properties: `Ebs` , `NoDevice` , or `VirtualName` .
     */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /** @param ebs Information to attach an EBS volume to an instance at launch. */
    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    /** @param ebs Information to attach an EBS volume to an instance at launch. */
    public fun ebs(ebs: CfnLaunchConfiguration.BlockDeviceProperty) {
        cdkBuilder.ebs(ebs)
    }

    /**
     * @param noDevice Setting this value to `true` prevents a volume that is included in the block
     *   device mapping of the AMI from being mapped to the specified device name at launch. If
     *   `NoDevice` is `true` for the root device, instances might fail the EC2 health check. In
     *   that case, Amazon EC2 Auto Scaling launches replacement instances.
     */
    public fun noDevice(noDevice: Boolean) {
        cdkBuilder.noDevice(noDevice)
    }

    /**
     * @param noDevice Setting this value to `true` prevents a volume that is included in the block
     *   device mapping of the AMI from being mapped to the specified device name at launch. If
     *   `NoDevice` is `true` for the root device, instances might fail the EC2 health check. In
     *   that case, Amazon EC2 Auto Scaling launches replacement instances.
     */
    public fun noDevice(noDevice: IResolvable) {
        cdkBuilder.noDevice(noDevice)
    }

    /**
     * @param virtualName The name of the instance store volume (virtual device) to attach to an
     *   instance at launch. The name must be in the form ephemeral *X* where *X* is a number
     *   starting from zero (0), for example, `ephemeral0` .
     */
    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnLaunchConfiguration.BlockDeviceMappingProperty = cdkBuilder.build()
}
