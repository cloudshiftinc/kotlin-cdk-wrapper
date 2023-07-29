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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies a block device mapping for an instance.
 *
 * You must specify exactly one of the following properties: `VirtualName` , `Ebs` , or `NoDevice` .
 *
 * `BlockDeviceMapping` is a property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
 *
 * After the instance is running, you can modify only the `DeleteOnTermination` parameter for the
 * attached volumes without interrupting the instance. Modifying any other parameter results in
 * instance
 * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .ebs(EbsProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice(NoDeviceProperty.builder().build())
 * .virtualName("virtualName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html)
 */
@CdkDslMarker
public class CfnInstanceBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnInstance.BlockDeviceMappingProperty.Builder =
        CfnInstance.BlockDeviceMappingProperty.builder()

    /**
     * @param deviceName The device name (for example, `/dev/sdh` or `xvdh` ).
     *
     * After the instance is running, this parameter is used to specify the device name of the block
     * device mapping to update.
     */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param ebs Parameters used to automatically set up EBS volumes when the instance is launched.
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results
     * in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
     * .
     */
    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    /**
     * @param ebs Parameters used to automatically set up EBS volumes when the instance is launched.
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results
     * in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
     * .
     */
    public fun ebs(ebs: CfnInstance.EbsProperty) {
        cdkBuilder.ebs(ebs)
    }

    /**
     * @param noDevice To omit the device from the block device mapping, specify an empty string.
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    public fun noDevice(noDevice: IResolvable) {
        cdkBuilder.noDevice(noDevice)
    }

    /**
     * @param noDevice To omit the device from the block device mapping, specify an empty string.
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    public fun noDevice(noDevice: CfnInstance.NoDeviceProperty) {
        cdkBuilder.noDevice(noDevice)
    }

    /**
     * @param virtualName The virtual device name ( `ephemeral` N). The name must be in the form
     *   `ephemeral` *X* where *X* is a number starting from zero (0). For example, an instance type
     *   with 2 available instance store volumes can specify mappings for `ephemeral0` and
     *   `ephemeral1` . The number of available instance store volumes depends on the instance type.
     *   After you connect to the instance, you must mount the volume.
     *
     * NVMe instance store volumes are automatically enumerated and assigned a device name.
     * Including them in your block device mapping has no effect.
     *
     * *Constraints* : For M3 instances, you must specify instance store volumes in the block device
     * mapping for the instance. When you launch an M3 instance, we ignore any instance store
     * volumes specified in the block device mapping for the AMI.
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnInstance.BlockDeviceMappingProperty = cdkBuilder.build()
}
