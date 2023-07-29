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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

/**
 * `BlockDevice` is a property of the `EBS` property of the
 * [AWS::AutoScaling::LaunchConfiguration BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html)
 * property type that describes an Amazon EBS volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * BlockDeviceProperty blockDeviceProperty = BlockDeviceProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html)
 */
@CdkDslMarker
public class CfnLaunchConfigurationBlockDevicePropertyDsl {
    private val cdkBuilder: CfnLaunchConfiguration.BlockDeviceProperty.Builder =
        CfnLaunchConfiguration.BlockDeviceProperty.builder()

    /**
     * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
     *   For Amazon EC2 Auto Scaling, the default value is `true` .
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
     *   For Amazon EC2 Auto Scaling, the default value is `true` .
     */
    public fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param encrypted Specifies whether the volume should be encrypted. Encrypted EBS volumes can
     *   only be attached to instances that support Amazon EBS encryption. For more information, see
     *   [Supported instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     *   . If your AMI uses encrypted volumes, you can also only launch it on supported instance
     *   types.
     *
     * If you are creating a volume from a snapshot, you cannot create an unencrypted volume from an
     * encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch configuration.
     *
     * If you enable encryption by default, the EBS volumes that you create are always encrypted,
     * either using the AWS managed KMS key or a customer-managed KMS key, regardless of whether the
     * snapshot was encrypted.
     *
     * For more information, see
     * [Use AWS KMS keys to encrypt Amazon EBS volumes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-data-protection.html#encryption)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted Specifies whether the volume should be encrypted. Encrypted EBS volumes can
     *   only be attached to instances that support Amazon EBS encryption. For more information, see
     *   [Supported instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     *   . If your AMI uses encrypted volumes, you can also only launch it on supported instance
     *   types.
     *
     * If you are creating a volume from a snapshot, you cannot create an unencrypted volume from an
     * encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch configuration.
     *
     * If you enable encryption by default, the EBS volumes that you create are always encrypted,
     * either using the AWS managed KMS key or a customer-managed KMS key, regardless of whether the
     * snapshot was encrypted.
     *
     * For more information, see
     * [Use AWS KMS keys to encrypt Amazon EBS volumes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-data-protection.html#encryption)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param iops The number of input/output (I/O) operations per second (IOPS) to provision for
     *   the volume. For `gp3` and `io1` volumes, this represents the number of IOPS that are
     *   provisioned for the volume. For `gp2` volumes, this represents the baseline performance of
     *   the volume and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     * * `gp3` : 3,000-16,000 IOPS
     * * `io1` : 100-64,000 IOPS
     *
     * For `io1` volumes, we guarantee 64,000 IOPS only for
     * [Instances built on the Nitro System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . Other instance families guarantee performance up to 32,000 IOPS.
     *
     * `Iops` is supported when the volume type is `gp3` or `io1` and required only when the volume
     * type is `io1` . (Not used with `standard` , `gp2` , `st1` , or `sc1` volumes.)
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * @param snapshotId The snapshot ID of the volume to use. You must specify either a
     *   `VolumeSize` or a `SnapshotId` .
     */
    public fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
    }

    /** @param throughput The throughput (MiBps) to provision for a `gp3` volume. */
    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    /**
     * @param volumeSize The volume size, in GiBs. The following are the supported volumes sizes for
     *   each volume type:.
     * * `gp2` and `gp3` : 1-16,384
     * * `io1` : 4-16,384
     * * `st1` and `sc1` : 125-16,384
     * * `standard` : 1-1,024
     *
     * You must specify either a `SnapshotId` or a `VolumeSize` . If you specify both `SnapshotId`
     * and `VolumeSize` , the volume size must be equal or greater than the size of the snapshot.
     */
    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    /**
     * @param volumeType The volume type. For more information, see
     *   [Amazon EBS volume types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Valid values: `standard` | `io1` | `gp2` | `st1` | `sc1` | `gp3`
     */
    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnLaunchConfiguration.BlockDeviceProperty = cdkBuilder.build()
}
