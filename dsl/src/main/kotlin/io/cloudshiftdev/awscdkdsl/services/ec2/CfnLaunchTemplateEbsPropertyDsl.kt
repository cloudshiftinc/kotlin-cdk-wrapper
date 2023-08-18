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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Parameters for a block device for an EBS volume in an Amazon EC2 launch template.
 *
 * `Ebs` is a property of
 * [AWS::EC2::LaunchTemplate BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * EbsProperty ebsProperty = EbsProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateEbsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.EbsProperty.Builder =
        CfnLaunchTemplate.EbsProperty.builder()

    /**
     * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
     *   termination.
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
     *   termination.
     */
    public fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param encrypted Indicates whether the EBS volume is encrypted. Encrypted volumes can only be
     *   attached to instances that support Amazon EBS encryption. If you are creating a volume from
     *   a snapshot, you can't specify an encryption value.
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted Indicates whether the EBS volume is encrypted. Encrypted volumes can only be
     *   attached to instances that support Amazon EBS encryption. If you are creating a volume from
     *   a snapshot, you can't specify an encryption value.
     */
    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS). For `gp3` , `io1` , and `io2`
     *   volumes, this represents the number of IOPS that are provisioned for the volume. For `gp2`
     *   volumes, this represents the baseline performance of the volume and the rate at which the
     *   volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     * * `gp3` : 3,000-16,000 IOPS
     * * `io1` : 100-64,000 IOPS
     * * `io2` : 100-64,000 IOPS
     *
     * For `io1` and `io2` volumes, we guarantee 64,000 IOPS only for
     * [Instances built on the Nitro System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . Other instance families guarantee performance up to 32,000 IOPS.
     *
     * This parameter is supported for `io1` , `io2` , and `gp3` volumes only. This parameter is not
     * supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKeyId The ARN of the symmetric AWS Key Management Service ( AWS KMS ) CMK used for
     *   encryption.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param snapshotId The ID of the snapshot. */
    public fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * @param throughput The throughput to provision for a `gp3` volume, with a maximum of 1,000
     *   MiB/s. Valid Range: Minimum value of 125. Maximum value of 1000.
     */
    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    /**
     * @param volumeSize The size of the volume, in GiBs. You must specify either a snapshot ID or a
     *   volume size. The following are the supported volumes sizes for each volume type:
     * * `gp2` and `gp3` : 1-16,384
     * * `io1` and `io2` : 4-16,384
     * * `st1` and `sc1` : 125-16,384
     * * `standard` : 1-1,024
     */
    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    /**
     * @param volumeType The volume type. For more information, see
     *   [Amazon EBS volume types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnLaunchTemplate.EbsProperty = cdkBuilder.build()
}
