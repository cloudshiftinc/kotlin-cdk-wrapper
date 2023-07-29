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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnInstance

/**
 * Describes a block device mapping.
 *
 * This data type maps directly to the Amazon EC2
 * [BlockDeviceMapping](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html)
 * data type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * .ebs(EbsBlockDeviceProperty.builder()
 * .deleteOnTermination(false)
 * .iops(123)
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice("noDevice")
 * .virtualName("virtualName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html)
 */
@CdkDslMarker
public class CfnInstanceBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnInstance.BlockDeviceMappingProperty.Builder =
        CfnInstance.BlockDeviceMappingProperty.builder()

    /**
     * @param deviceName The device name that is exposed to the instance, such as `/dev/sdh` . For
     *   the root device, you can use the explicit device name or you can set this parameter to
     *   `ROOT_DEVICE` and AWS OpsWorks Stacks will provide the correct device name.
     */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param ebs An `EBSBlockDevice` that defines how to configure an Amazon EBS volume when the
     *   instance is launched. You can specify either the `VirtualName` or `Ebs` , but not both.
     */
    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    /**
     * @param ebs An `EBSBlockDevice` that defines how to configure an Amazon EBS volume when the
     *   instance is launched. You can specify either the `VirtualName` or `Ebs` , but not both.
     */
    public fun ebs(ebs: CfnInstance.EbsBlockDeviceProperty) {
        cdkBuilder.ebs(ebs)
    }

    /**
     * @param noDevice Suppresses the specified device included in the AMI's block device mapping.
     */
    public fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
    }

    /**
     * @param virtualName The virtual device name. For more information, see
     *   [BlockDeviceMapping](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html)
     *   . You can specify either the `VirtualName` or `Ebs` , but not both.
     */
    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnInstance.BlockDeviceMappingProperty = cdkBuilder.build()
}
