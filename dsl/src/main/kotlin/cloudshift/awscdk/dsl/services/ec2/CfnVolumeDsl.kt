@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVolume
import software.constructs.Construct

@CdkDslMarker
public class CfnVolumeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVolume.Builder = CfnVolume.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Indicates whether the volume is auto-enabled for I/O operations.
   *
   * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
   * determines that a volume's data is potentially inconsistent. If the consistency of the volume is
   * not a concern, and you prefer that the volume be made available immediately if it's impaired, you
   * can configure the volume to automatically enable I/O.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-autoenableio)
   * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations. 
   */
  public fun autoEnableIo(autoEnableIo: Boolean) {
    cdkBuilder.autoEnableIo(autoEnableIo)
  }

  /**
   * Indicates whether the volume is auto-enabled for I/O operations.
   *
   * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
   * determines that a volume's data is potentially inconsistent. If the consistency of the volume is
   * not a concern, and you prefer that the volume be made available immediately if it's impaired, you
   * can configure the volume to automatically enable I/O.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-autoenableio)
   * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations. 
   */
  public fun autoEnableIo(autoEnableIo: IResolvable) {
    cdkBuilder.autoEnableIo(autoEnableIo)
  }

  /**
   * The ID of the Availability Zone in which to create the volume.
   *
   * For example, `us-east-1a` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-availabilityzone)
   * @param availabilityZone The ID of the Availability Zone in which to create the volume. 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * Indicates whether the volume should be encrypted.
   *
   * The effect of setting the encryption state to `true` depends on the volume origin (new or from
   * a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
   * For more information, see [Encryption by
   * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   *
   * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
   * For more information, see [Supported instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-encrypted)
   * @param encrypted Indicates whether the volume should be encrypted. 
   */
  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  /**
   * Indicates whether the volume should be encrypted.
   *
   * The effect of setting the encryption state to `true` depends on the volume origin (new or from
   * a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
   * For more information, see [Encryption by
   * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   *
   * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
   * For more information, see [Supported instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-encrypted)
   * @param encrypted Indicates whether the volume should be encrypted. 
   */
  public fun encrypted(encrypted: IResolvable) {
    cdkBuilder.encrypted(encrypted)
  }

  /**
   * The number of I/O operations per second (IOPS).
   *
   * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are provisioned
   * for the volume. For `gp2` volumes, this represents the baseline performance of the volume and the
   * rate at which the volume accumulates I/O credits for bursting.
   *
   * The following are the supported values for each volume type:
   *
   * * `gp3` : 3,000-16,000 IOPS
   * * `io1` : 100-64,000 IOPS
   * * `io2` : 100-64,000 IOPS
   *
   * `io1` and `io2` volumes support up to 64,000 IOPS only on [Instances built on the Nitro
   * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
   * . Other instance families support performance up to 32,000 IOPS.
   *
   * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is 3,000
   * IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-iops)
   * @param iops The number of I/O operations per second (IOPS). 
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

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
   * @param kmsKeyId The identifier of the AWS KMS key to use for Amazon EBS encryption. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * Indicates whether Amazon EBS Multi-Attach is enabled.
   *
   * AWS CloudFormation does not currently support updating a single-attach volume to be
   * multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or updating the
   * size or number of I/O operations per second (IOPS) of a multi-attach enabled volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-multiattachenabled)
   * @param multiAttachEnabled Indicates whether Amazon EBS Multi-Attach is enabled. 
   */
  public fun multiAttachEnabled(multiAttachEnabled: Boolean) {
    cdkBuilder.multiAttachEnabled(multiAttachEnabled)
  }

  /**
   * Indicates whether Amazon EBS Multi-Attach is enabled.
   *
   * AWS CloudFormation does not currently support updating a single-attach volume to be
   * multi-attach enabled, updating a multi-attach enabled volume to be single-attach, or updating the
   * size or number of I/O operations per second (IOPS) of a multi-attach enabled volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-multiattachenabled)
   * @param multiAttachEnabled Indicates whether Amazon EBS Multi-Attach is enabled. 
   */
  public fun multiAttachEnabled(multiAttachEnabled: IResolvable) {
    cdkBuilder.multiAttachEnabled(multiAttachEnabled)
  }

  /**
   * The Amazon Resource Name (ARN) of the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-outpostarn)
   * @param outpostArn The Amazon Resource Name (ARN) of the Outpost. 
   */
  public fun outpostArn(outpostArn: String) {
    cdkBuilder.outpostArn(outpostArn)
  }

  /**
   * The size of the volume, in GiBs.
   *
   * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the default
   * is the snapshot size. You can specify a volume size that is equal to or larger than the snapshot
   * size.
   *
   * The following are the supported volumes sizes for each volume type:
   *
   * * `gp2` and `gp3` : 1-16,384
   * * `io1` and `io2` : 4-16,384
   * * `st1` and `sc1` : 125-16,384
   * * `standard` : 1-1,024
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-size)
   * @param size The size of the volume, in GiBs. 
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  /**
   * The snapshot from which to create the volume.
   *
   * You must specify either a snapshot ID or a volume size.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-snapshotid)
   * @param snapshotId The snapshot from which to create the volume. 
   */
  public fun snapshotId(snapshotId: String) {
    cdkBuilder.snapshotId(snapshotId)
  }

  /**
   * The tags to apply to the volume during creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-tags)
   * @param tags The tags to apply to the volume during creation. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to apply to the volume during creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-tags)
   * @param tags The tags to apply to the volume during creation. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
   *
   * This parameter is valid only for `gp3` volumes. The default value is 125.
   *
   * Valid Range: Minimum value of 125. Maximum value of 1000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-throughput)
   * @param throughput The throughput to provision for a volume, with a maximum of 1,000 MiB/s. 
   */
  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

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
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
   * Elastic Compute Cloud User Guide* .
   *
   * Default: `gp2`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-volumetype)
   * @param volumeType The volume type. This parameter can be one of the following values:. 
   */
  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnVolume {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
