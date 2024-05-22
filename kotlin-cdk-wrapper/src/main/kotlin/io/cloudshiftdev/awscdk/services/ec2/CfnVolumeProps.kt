@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVolume`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
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
public interface CfnVolumeProps {
  /**
   * Indicates whether the volume is auto-enabled for I/O operations.
   *
   * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
   * determines that a volume's data is potentially inconsistent. If the consistency of the volume is
   * not a concern, and you prefer that the volume be made available immediately if it's impaired, you
   * can configure the volume to automatically enable I/O.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-autoenableio)
   */
  public fun autoEnableIo(): Any? = unwrap(this).getAutoEnableIo()

  /**
   * The ID of the Availability Zone in which to create the volume.
   *
   * For example, `us-east-1a` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-availabilityzone)
   */
  public fun availabilityZone(): String

  /**
   * Indicates whether the volume should be encrypted.
   *
   * The effect of setting the encryption state to `true` depends on the volume origin (new or from
   * a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
   * For more information, see [Encryption by
   * default](https://docs.aws.amazon.com/ebs/latest/userguide/work-with-ebs-encr.html#encryption-by-default)
   * in the *Amazon EBS User Guide* .
   *
   * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
   * For more information, see [Supported instance
   * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-encryption-requirements.html#ebs-encryption_supported_instances)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-encrypted)
   */
  public fun encrypted(): Any? = unwrap(this).getEncrypted()

  /**
   * The number of I/O operations per second (IOPS).
   *
   * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are provisioned
   * for the volume. For `gp2` volumes, this represents the baseline performance of the volume and the
   * rate at which the volume accumulates I/O credits for bursting.
   *
   * The following are the supported values for each volume type:
   *
   * * `gp3` : 3,000 - 16,000 IOPS
   * * `io1` : 100 - 64,000 IOPS
   * * `io2` : 100 - 256,000 IOPS
   *
   * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
   * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
   * . On other instances, you can achieve performance up to 32,000 IOPS.
   *
   * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is 3,000
   * IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-iops)
   */
  public fun iops(): Number? = unwrap(this).getIops()

  /**
   * The identifier of the AWS KMS key to use for Amazon EBS encryption.
   *
   * If `KmsKeyId` is specified, the encrypted state must be `true` .
   *
   * If you omit this property and your account is enabled for encryption by default, or *Encrypted*
   * is set to `true` , then the volume is encrypted using the default key specified for your account.
   * If your account does not have a default key, then the volume is encrypted using the AWS managed
   * key .
   *
   * Alternatively, if you want to specify a different key, you can specify one of the following:
   *
   * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
   * * Key alias. Specify the alias for the key, prefixed with `alias/` . For example, for a key
   * with the alias `my_cmk` , use `alias/my_cmk` . Or to specify the AWS managed key , use
   * `alias/aws/ebs` .
   * * Key ARN. For example,
   * arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
   * * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Indicates whether Amazon EBS Multi-Attach is enabled.
   *
   * AWS CloudFormation does not currently support updating a single-attach volume to be
   * multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or updating the
   * size or number of I/O operations per second (IOPS) of a multi-attach enabled volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-multiattachenabled)
   */
  public fun multiAttachEnabled(): Any? = unwrap(this).getMultiAttachEnabled()

  /**
   * The Amazon Resource Name (ARN) of the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-outpostarn)
   */
  public fun outpostArn(): String? = unwrap(this).getOutpostArn()

  /**
   * The size of the volume, in GiBs.
   *
   * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the default
   * is the snapshot size. You can specify a volume size that is equal to or larger than the snapshot
   * size.
   *
   * The following are the supported volumes sizes for each volume type:
   *
   * * `gp2` and `gp3` : 1 - 16,384 GiB
   * * `io1` : 4 - 16,384 GiB
   * * `io2` : 4 - 65,536 GiB
   * * `st1` and `sc1` : 125 - 16,384 GiB
   * * `standard` : 1 - 1024 GiB
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-size)
   */
  public fun size(): Number? = unwrap(this).getSize()

  /**
   * The snapshot from which to create the volume.
   *
   * You must specify either a snapshot ID or a volume size.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-snapshotid)
   */
  public fun snapshotId(): String? = unwrap(this).getSnapshotId()

  /**
   * The tags to apply to the volume during creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
   *
   * This parameter is valid only for `gp3` volumes. The default value is 125.
   *
   * Valid Range: Minimum value of 125. Maximum value of 1000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-throughput)
   */
  public fun throughput(): Number? = unwrap(this).getThroughput()

  /**
   * The volume type. This parameter can be one of the following values:.
   *
   * * General Purpose SSD: `gp2` | `gp3`
   * * Provisioned IOPS SSD: `io1` | `io2`
   * * Throughput Optimized HDD: `st1`
   * * Cold HDD: `sc1`
   * * Magnetic: `standard`
   *
   * For more information, see [Amazon EBS volume
   * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html) .
   *
   * Default: `gp2`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-volumetype)
   */
  public fun volumeType(): String? = unwrap(this).getVolumeType()

  /**
   * A builder for [CfnVolumeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations.
     * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
     * determines that a volume's data is potentially inconsistent. If the consistency of the volume is
     * not a concern, and you prefer that the volume be made available immediately if it's impaired,
     * you can configure the volume to automatically enable I/O.
     */
    public fun autoEnableIo(autoEnableIo: Boolean)

    /**
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations.
     * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
     * determines that a volume's data is potentially inconsistent. If the consistency of the volume is
     * not a concern, and you prefer that the volume be made available immediately if it's impaired,
     * you can configure the volume to automatically enable I/O.
     */
    public fun autoEnableIo(autoEnableIo: IResolvable)

    /**
     * @param availabilityZone The ID of the Availability Zone in which to create the volume. 
     * For example, `us-east-1a` .
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     * The effect of setting the encryption state to `true` depends on the volume origin (new or
     * from a snapshot), starting encryption state, ownership, and whether encryption by default is
     * enabled. For more information, see [Encryption by
     * default](https://docs.aws.amazon.com/ebs/latest/userguide/work-with-ebs-encr.html#encryption-by-default)
     * in the *Amazon EBS User Guide* .
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see [Supported instance
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-encryption-requirements.html#ebs-encryption_supported_instances)
     * .
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     * The effect of setting the encryption state to `true` depends on the volume origin (new or
     * from a snapshot), starting encryption state, ownership, and whether encryption by default is
     * enabled. For more information, see [Encryption by
     * default](https://docs.aws.amazon.com/ebs/latest/userguide/work-with-ebs-encr.html#encryption-by-default)
     * in the *Amazon EBS User Guide* .
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see [Supported instance
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-encryption-requirements.html#ebs-encryption_supported_instances)
     * .
     */
    public fun encrypted(encrypted: IResolvable)

    /**
     * @param iops The number of I/O operations per second (IOPS).
     * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
     * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
     * volume and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     *
     * * `gp3` : 3,000 - 16,000 IOPS
     * * `io1` : 100 - 64,000 IOPS
     * * `io2` : 100 - 256,000 IOPS
     *
     * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
     * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . On other instances, you can achieve performance up to 32,000 IOPS.
     *
     * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
     * 3,000 IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
     */
    public fun iops(iops: Number)

    /**
     * @param kmsKeyId The identifier of the AWS KMS key to use for Amazon EBS encryption.
     * If `KmsKeyId` is specified, the encrypted state must be `true` .
     *
     * If you omit this property and your account is enabled for encryption by default, or
     * *Encrypted* is set to `true` , then the volume is encrypted using the default key specified for
     * your account. If your account does not have a default key, then the volume is encrypted using
     * the AWS managed key .
     *
     * Alternatively, if you want to specify a different key, you can specify one of the following:
     *
     * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Key alias. Specify the alias for the key, prefixed with `alias/` . For example, for a key
     * with the alias `my_cmk` , use `alias/my_cmk` . Or to specify the AWS managed key , use
     * `alias/aws/ebs` .
     * * Key ARN. For example,
     * arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param multiAttachEnabled Indicates whether Amazon EBS Multi-Attach is enabled.
     * AWS CloudFormation does not currently support updating a single-attach volume to be
     * multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or updating
     * the size or number of I/O operations per second (IOPS) of a multi-attach enabled volume.
     */
    public fun multiAttachEnabled(multiAttachEnabled: Boolean)

    /**
     * @param multiAttachEnabled Indicates whether Amazon EBS Multi-Attach is enabled.
     * AWS CloudFormation does not currently support updating a single-attach volume to be
     * multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or updating
     * the size or number of I/O operations per second (IOPS) of a multi-attach enabled volume.
     */
    public fun multiAttachEnabled(multiAttachEnabled: IResolvable)

    /**
     * @param outpostArn The Amazon Resource Name (ARN) of the Outpost.
     */
    public fun outpostArn(outpostArn: String)

    /**
     * @param size The size of the volume, in GiBs.
     * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
     * default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     *
     * The following are the supported volumes sizes for each volume type:
     *
     * * `gp2` and `gp3` : 1 - 16,384 GiB
     * * `io1` : 4 - 16,384 GiB
     * * `io2` : 4 - 65,536 GiB
     * * `st1` and `sc1` : 125 - 16,384 GiB
     * * `standard` : 1 - 1024 GiB
     */
    public fun size(size: Number)

    /**
     * @param snapshotId The snapshot from which to create the volume.
     * You must specify either a snapshot ID or a volume size.
     */
    public fun snapshotId(snapshotId: String)

    /**
     * @param tags The tags to apply to the volume during creation.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to apply to the volume during creation.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param throughput The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     * This parameter is valid only for `gp3` volumes. The default value is 125.
     *
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     */
    public fun throughput(throughput: Number)

    /**
     * @param volumeType The volume type. This parameter can be one of the following values:.
     * * General Purpose SSD: `gp2` | `gp3`
     * * Provisioned IOPS SSD: `io1` | `io2`
     * * Throughput Optimized HDD: `st1`
     * * Cold HDD: `sc1`
     * * Magnetic: `standard`
     *
     * For more information, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html) .
     *
     * Default: `gp2`
     */
    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVolumeProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVolumeProps.builder()

    /**
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations.
     * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
     * determines that a volume's data is potentially inconsistent. If the consistency of the volume is
     * not a concern, and you prefer that the volume be made available immediately if it's impaired,
     * you can configure the volume to automatically enable I/O.
     */
    override fun autoEnableIo(autoEnableIo: Boolean) {
      cdkBuilder.autoEnableIo(autoEnableIo)
    }

    /**
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations.
     * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
     * determines that a volume's data is potentially inconsistent. If the consistency of the volume is
     * not a concern, and you prefer that the volume be made available immediately if it's impaired,
     * you can configure the volume to automatically enable I/O.
     */
    override fun autoEnableIo(autoEnableIo: IResolvable) {
      cdkBuilder.autoEnableIo(autoEnableIo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param availabilityZone The ID of the Availability Zone in which to create the volume. 
     * For example, `us-east-1a` .
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     * The effect of setting the encryption state to `true` depends on the volume origin (new or
     * from a snapshot), starting encryption state, ownership, and whether encryption by default is
     * enabled. For more information, see [Encryption by
     * default](https://docs.aws.amazon.com/ebs/latest/userguide/work-with-ebs-encr.html#encryption-by-default)
     * in the *Amazon EBS User Guide* .
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see [Supported instance
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-encryption-requirements.html#ebs-encryption_supported_instances)
     * .
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     * The effect of setting the encryption state to `true` depends on the volume origin (new or
     * from a snapshot), starting encryption state, ownership, and whether encryption by default is
     * enabled. For more information, see [Encryption by
     * default](https://docs.aws.amazon.com/ebs/latest/userguide/work-with-ebs-encr.html#encryption-by-default)
     * in the *Amazon EBS User Guide* .
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see [Supported instance
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-encryption-requirements.html#ebs-encryption_supported_instances)
     * .
     */
    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param iops The number of I/O operations per second (IOPS).
     * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
     * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
     * volume and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     *
     * * `gp3` : 3,000 - 16,000 IOPS
     * * `io1` : 100 - 64,000 IOPS
     * * `io2` : 100 - 256,000 IOPS
     *
     * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
     * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . On other instances, you can achieve performance up to 32,000 IOPS.
     *
     * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
     * 3,000 IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKeyId The identifier of the AWS KMS key to use for Amazon EBS encryption.
     * If `KmsKeyId` is specified, the encrypted state must be `true` .
     *
     * If you omit this property and your account is enabled for encryption by default, or
     * *Encrypted* is set to `true` , then the volume is encrypted using the default key specified for
     * your account. If your account does not have a default key, then the volume is encrypted using
     * the AWS managed key .
     *
     * Alternatively, if you want to specify a different key, you can specify one of the following:
     *
     * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Key alias. Specify the alias for the key, prefixed with `alias/` . For example, for a key
     * with the alias `my_cmk` , use `alias/my_cmk` . Or to specify the AWS managed key , use
     * `alias/aws/ebs` .
     * * Key ARN. For example,
     * arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param multiAttachEnabled Indicates whether Amazon EBS Multi-Attach is enabled.
     * AWS CloudFormation does not currently support updating a single-attach volume to be
     * multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or updating
     * the size or number of I/O operations per second (IOPS) of a multi-attach enabled volume.
     */
    override fun multiAttachEnabled(multiAttachEnabled: Boolean) {
      cdkBuilder.multiAttachEnabled(multiAttachEnabled)
    }

    /**
     * @param multiAttachEnabled Indicates whether Amazon EBS Multi-Attach is enabled.
     * AWS CloudFormation does not currently support updating a single-attach volume to be
     * multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or updating
     * the size or number of I/O operations per second (IOPS) of a multi-attach enabled volume.
     */
    override fun multiAttachEnabled(multiAttachEnabled: IResolvable) {
      cdkBuilder.multiAttachEnabled(multiAttachEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outpostArn The Amazon Resource Name (ARN) of the Outpost.
     */
    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * @param size The size of the volume, in GiBs.
     * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
     * default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     *
     * The following are the supported volumes sizes for each volume type:
     *
     * * `gp2` and `gp3` : 1 - 16,384 GiB
     * * `io1` : 4 - 16,384 GiB
     * * `io2` : 4 - 65,536 GiB
     * * `st1` and `sc1` : 125 - 16,384 GiB
     * * `standard` : 1 - 1024 GiB
     */
    override fun size(size: Number) {
      cdkBuilder.size(size)
    }

    /**
     * @param snapshotId The snapshot from which to create the volume.
     * You must specify either a snapshot ID or a volume size.
     */
    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * @param tags The tags to apply to the volume during creation.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to apply to the volume during creation.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param throughput The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     * This parameter is valid only for `gp3` volumes. The default value is 125.
     *
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     */
    override fun throughput(throughput: Number) {
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
     * For more information, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html) .
     *
     * Default: `gp2`
     */
    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVolumeProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeProps,
  ) : CdkObject(cdkObject), CfnVolumeProps {
    /**
     * Indicates whether the volume is auto-enabled for I/O operations.
     *
     * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
     * determines that a volume's data is potentially inconsistent. If the consistency of the volume is
     * not a concern, and you prefer that the volume be made available immediately if it's impaired,
     * you can configure the volume to automatically enable I/O.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-autoenableio)
     */
    override fun autoEnableIo(): Any? = unwrap(this).getAutoEnableIo()

    /**
     * The ID of the Availability Zone in which to create the volume.
     *
     * For example, `us-east-1a` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-availabilityzone)
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * Indicates whether the volume should be encrypted.
     *
     * The effect of setting the encryption state to `true` depends on the volume origin (new or
     * from a snapshot), starting encryption state, ownership, and whether encryption by default is
     * enabled. For more information, see [Encryption by
     * default](https://docs.aws.amazon.com/ebs/latest/userguide/work-with-ebs-encr.html#encryption-by-default)
     * in the *Amazon EBS User Guide* .
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see [Supported instance
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-encryption-requirements.html#ebs-encryption_supported_instances)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-encrypted)
     */
    override fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The number of I/O operations per second (IOPS).
     *
     * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
     * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
     * volume and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     *
     * * `gp3` : 3,000 - 16,000 IOPS
     * * `io1` : 100 - 64,000 IOPS
     * * `io2` : 100 - 256,000 IOPS
     *
     * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
     * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . On other instances, you can achieve performance up to 32,000 IOPS.
     *
     * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
     * 3,000 IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-iops)
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * The identifier of the AWS KMS key to use for Amazon EBS encryption.
     *
     * If `KmsKeyId` is specified, the encrypted state must be `true` .
     *
     * If you omit this property and your account is enabled for encryption by default, or
     * *Encrypted* is set to `true` , then the volume is encrypted using the default key specified for
     * your account. If your account does not have a default key, then the volume is encrypted using
     * the AWS managed key .
     *
     * Alternatively, if you want to specify a different key, you can specify one of the following:
     *
     * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Key alias. Specify the alias for the key, prefixed with `alias/` . For example, for a key
     * with the alias `my_cmk` , use `alias/my_cmk` . Or to specify the AWS managed key , use
     * `alias/aws/ebs` .
     * * Key ARN. For example,
     * arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     *
     * AWS CloudFormation does not currently support updating a single-attach volume to be
     * multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or updating
     * the size or number of I/O operations per second (IOPS) of a multi-attach enabled volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-multiattachenabled)
     */
    override fun multiAttachEnabled(): Any? = unwrap(this).getMultiAttachEnabled()

    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-outpostarn)
     */
    override fun outpostArn(): String? = unwrap(this).getOutpostArn()

    /**
     * The size of the volume, in GiBs.
     *
     * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
     * default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     *
     * The following are the supported volumes sizes for each volume type:
     *
     * * `gp2` and `gp3` : 1 - 16,384 GiB
     * * `io1` : 4 - 16,384 GiB
     * * `io2` : 4 - 65,536 GiB
     * * `st1` and `sc1` : 125 - 16,384 GiB
     * * `standard` : 1 - 1024 GiB
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-size)
     */
    override fun size(): Number? = unwrap(this).getSize()

    /**
     * The snapshot from which to create the volume.
     *
     * You must specify either a snapshot ID or a volume size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-snapshotid)
     */
    override fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The tags to apply to the volume during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     *
     * This parameter is valid only for `gp3` volumes. The default value is 125.
     *
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-throughput)
     */
    override fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The volume type. This parameter can be one of the following values:.
     *
     * * General Purpose SSD: `gp2` | `gp3`
     * * Provisioned IOPS SSD: `io1` | `io2`
     * * Throughput Optimized HDD: `st1`
     * * Cold HDD: `sc1`
     * * Magnetic: `standard`
     *
     * For more information, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html) .
     *
     * Default: `gp2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-volumetype)
     */
    override fun volumeType(): String? = unwrap(this).getVolumeType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeProps): CfnVolumeProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnVolumeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeProps): software.amazon.awscdk.services.ec2.CfnVolumeProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVolumeProps
  }
}
