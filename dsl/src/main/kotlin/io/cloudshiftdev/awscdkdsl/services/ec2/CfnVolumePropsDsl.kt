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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVolumeProps

/**
 * Properties for defining a `CfnVolume`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
 * .availabilityZone("availabilityZone")
 * // the properties below are optional
 * .autoEnableIo(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .multiAttachEnabled(false)
 * .outpostArn("outpostArn")
 * .size(123)
 * .snapshotId("snapshotId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .throughput(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html)
 */
@CdkDslMarker
public class CfnVolumePropsDsl {
    private val cdkBuilder: CfnVolumeProps.Builder = CfnVolumeProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations. By
     *   default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
     *   determines that a volume's data is potentially inconsistent. If the consistency of the
     *   volume is not a concern, and you prefer that the volume be made available immediately if
     *   it's impaired, you can configure the volume to automatically enable I/O.
     */
    public fun autoEnableIo(autoEnableIo: Boolean) {
        cdkBuilder.autoEnableIo(autoEnableIo)
    }

    /**
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations. By
     *   default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
     *   determines that a volume's data is potentially inconsistent. If the consistency of the
     *   volume is not a concern, and you prefer that the volume be made available immediately if
     *   it's impaired, you can configure the volume to automatically enable I/O.
     */
    public fun autoEnableIo(autoEnableIo: IResolvable) {
        cdkBuilder.autoEnableIo(autoEnableIo)
    }

    /**
     * @param availabilityZone The ID of the Availability Zone in which to create the volume. For
     *   example, `us-east-1a` .
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param encrypted Indicates whether the volume should be encrypted. The effect of setting the
     *   encryption state to `true` depends on the volume origin (new or from a snapshot), starting
     *   encryption state, ownership, and whether encryption by default is enabled. For more
     *   information, see
     *   [Encryption by default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see
     * [Supported instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     * .
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted Indicates whether the volume should be encrypted. The effect of setting the
     *   encryption state to `true` depends on the volume origin (new or from a snapshot), starting
     *   encryption state, ownership, and whether encryption by default is enabled. For more
     *   information, see
     *   [Encryption by default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see
     * [Supported instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     * .
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
     * * `gp3` : 3,000 - 16,000 IOPS
     * * `io1` : 100 - 64,000 IOPS
     * * `io2` : 100 - 256,000 IOPS
     *
     * For `io2` volumes, you can achieve up to 256,000 IOPS on
     * [instances built on the Nitro System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . On other instances, you can achieve performance up to 32,000 IOPS.
     *
     * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
     * 3,000 IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard`
     * volumes.
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKeyId The identifier of the AWS KMS key to use for Amazon EBS encryption. If
     *   `KmsKeyId` is specified, the encrypted state must be `true` .
     *
     * If you omit this property and your account is enabled for encryption by default, or
     * *Encrypted* is set to `true` , then the volume is encrypted using the default key specified
     * for your account. If your account does not have a default key, then the volume is encrypted
     * using the AWS managed key .
     *
     * Alternatively, if you want to specify a different key, you can specify one of the following:
     * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Key alias. Specify the alias for the key, prefixed with `alias/` . For example, for a key
     *   with the alias `my_cmk` , use `alias/my_cmk` . Or to specify the AWS managed key , use
     *   `alias/aws/ebs` .
     * * Key ARN. For example,
     *   arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param multiAttachEnabled Indicates whether Amazon EBS Multi-Attach is enabled. AWS
     *   CloudFormation does not currently support updating a single-attach volume to be
     *   multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or
     *   updating the size or number of I/O operations per second (IOPS) of a multi-attach enabled
     *   volume.
     */
    public fun multiAttachEnabled(multiAttachEnabled: Boolean) {
        cdkBuilder.multiAttachEnabled(multiAttachEnabled)
    }

    /**
     * @param multiAttachEnabled Indicates whether Amazon EBS Multi-Attach is enabled. AWS
     *   CloudFormation does not currently support updating a single-attach volume to be
     *   multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or
     *   updating the size or number of I/O operations per second (IOPS) of a multi-attach enabled
     *   volume.
     */
    public fun multiAttachEnabled(multiAttachEnabled: IResolvable) {
        cdkBuilder.multiAttachEnabled(multiAttachEnabled)
    }

    /** @param outpostArn The Amazon Resource Name (ARN) of the Outpost. */
    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * @param size The size of the volume, in GiBs. You must specify either a snapshot ID or a
     *   volume size. If you specify a snapshot, the default is the snapshot size. You can specify a
     *   volume size that is equal to or larger than the snapshot size.
     *
     * The following are the supported volumes sizes for each volume type:
     * * `gp2` and `gp3` : 1 - 16,384 GiB
     * * `io1` : 4 - 16,384 GiB
     * * `io2` : 4 - 65,536 GiB
     * * `st1` and `sc1` : 125 - 16,384 GiB
     * * `standard` : 1 - 1024 GiB
     */
    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    /**
     * @param snapshotId The snapshot from which to create the volume. You must specify either a
     *   snapshot ID or a volume size.
     */
    public fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
    }

    /** @param tags The tags to apply to the volume during creation. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to apply to the volume during creation. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param throughput The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     *   This parameter is valid only for `gp3` volumes. The default value is 125.
     *
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     */
    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    /**
     * @param volumeType The volume type. This parameter can be one of the following values:.
     * * General Purpose SSD: `gp2` | `gp3`
     * * Provisioned IOPS SSD: `io1` | `io2`
     * * Throughput Optimized HDD: `st1`
     * * Cold HDD: `sc1`
     * * Magnetic: `standard`
     *
     * For more information, see
     * [Amazon EBS volume types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Default: `gp2`
     */
    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnVolumeProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
