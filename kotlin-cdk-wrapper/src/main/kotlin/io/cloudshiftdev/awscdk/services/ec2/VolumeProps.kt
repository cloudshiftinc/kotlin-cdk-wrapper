@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties of an EBS Volume.
 *
 * Example:
 *
 * ```
 * Instance instance;
 * Role role;
 * Volume volume = Volume.Builder.create(this, "Volume")
 * .availabilityZone("us-west-2a")
 * .size(Size.gibibytes(500))
 * .encrypted(true)
 * .build();
 * volume.grantAttachVolume(role, List.of(instance));
 * ```
 */
public interface VolumeProps {
  /**
   * Indicates whether the volume is auto-enabled for I/O operations.
   *
   * By default, Amazon EBS disables I/O to the volume from attached EC2
   * instances when it determines that a volume's data is potentially inconsistent. If the
   * consistency of the volume is not a concern, and
   * you prefer that the volume be made available immediately if it's impaired, you can configure
   * the volume to automatically enable I/O.
   *
   * Default: false
   */
  public fun autoEnableIo(): Boolean? = unwrap(this).getAutoEnableIo()

  /**
   * The Availability Zone in which to create the volume.
   */
  public fun availabilityZone(): String

  /**
   * Indicates whether Amazon EBS Multi-Attach is enabled.
   *
   * See [Considerations and
   * limitations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html#considerations)
   * for the constraints of multi-attach.
   *
   * Default: false
   */
  public fun enableMultiAttach(): Boolean? = unwrap(this).getEnableMultiAttach()

  /**
   * Specifies whether the volume should be encrypted.
   *
   * The effect of setting the encryption state to true depends on the volume origin
   * (new or from a snapshot), starting encryption state, ownership, and whether encryption by
   * default is enabled. For more information,
   * see [Encryption by
   * Default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
   * in the Amazon Elastic Compute Cloud User Guide.
   *
   * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
   * For more information, see
   * [Supported Instance
   * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances).
   *
   * Default: false
   */
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  /**
   * The customer-managed encryption key that is used to encrypt the Volume.
   *
   * The encrypted property must
   * be true if this is provided.
   *
   * Note: If using an `aws-kms.IKey` created from a `aws-kms.Key.fromKeyArn()` here,
   * then the KMS key **must** have the following in its Key policy; otherwise, the Volume
   * will fail to create.
   *
   * ```
   * {
   * "Effect": "Allow",
   * "Principal": { "AWS": "&lt;arn for your account-user&gt; ex: arn:aws:iam::00000000000:root" },
   * "Resource": "*",
   * "Action": [
   * "kms:DescribeKey",
   * "kms:GenerateDataKeyWithoutPlainText",
   * ],
   * "Condition": {
   * "StringEquals": {
   * "kms:ViaService": "ec2.&lt;Region&gt;.amazonaws.com", (eg: ec2.us-east-1.amazonaws.com)
   * "kms:CallerAccount": "0000000000" (your account ID)
   * }
   * }
   * }
   * ```
   *
   * Default: The default KMS key for the account, region, and EC2 service is used.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The number of I/O operations per second (IOPS) to provision for the volume.
   *
   * The maximum ratio is 50 IOPS/GiB for PROVISIONED_IOPS_SSD,
   * and 500 IOPS/GiB for both PROVISIONED_IOPS_SSD_IO2 and GENERAL_PURPOSE_SSD_GP3.
   * See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
   * for more information.
   *
   * This parameter is valid only for PROVISIONED_IOPS_SSD, PROVISIONED_IOPS_SSD_IO2 and
   * GENERAL_PURPOSE_SSD_GP3 volumes.
   *
   * Default: None -- Required for io1 and io2 volumes. The default for gp3 volumes is 3,000 IOPS if
   * omitted.
   */
  public fun iops(): Number? = unwrap(this).getIops()

  /**
   * Policy to apply when the volume is removed from the stack.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The size of the volume, in GiBs.
   *
   * You must specify either a snapshot ID or a volume size.
   * See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
   * for details on the allowable size for each type of volume.
   *
   * Default: If you're creating the volume from a snapshot and don't specify a volume size, the
   * default is the snapshot size.
   */
  public fun size(): Size? = unwrap(this).getSize()?.let(Size::wrap)

  /**
   * The snapshot from which to create the volume.
   *
   * You must specify either a snapshot ID or a volume size.
   *
   * Default: The EBS volume is not created from a snapshot.
   */
  public fun snapshotId(): String? = unwrap(this).getSnapshotId()

  /**
   * The throughput that the volume supports, in MiB/s Takes a minimum of 125 and maximum of 1000.
   *
   * Default: - 125 MiB/s. Only valid on gp3 volumes.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-throughput)
   */
  public fun throughput(): Number? = unwrap(this).getThroughput()

  /**
   * The value of the physicalName property of this resource.
   *
   * Default: The physical name will be allocated by CloudFormation at deployment time
   */
  public fun volumeName(): String? = unwrap(this).getVolumeName()

  /**
   * The type of the volume;
   *
   * what type of storage to use to form the EBS Volume.
   *
   * Default: `EbsDeviceVolumeType.GENERAL_PURPOSE_SSD`
   */
  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  /**
   * A builder for [VolumeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations.
     * By default, Amazon EBS disables I/O to the volume from attached EC2
     * instances when it determines that a volume's data is potentially inconsistent. If the
     * consistency of the volume is not a concern, and
     * you prefer that the volume be made available immediately if it's impaired, you can configure
     * the volume to automatically enable I/O.
     */
    public fun autoEnableIo(autoEnableIo: Boolean)

    /**
     * @param availabilityZone The Availability Zone in which to create the volume. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param enableMultiAttach Indicates whether Amazon EBS Multi-Attach is enabled.
     * See [Considerations and
     * limitations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html#considerations)
     * for the constraints of multi-attach.
     */
    public fun enableMultiAttach(enableMultiAttach: Boolean)

    /**
     * @param encrypted Specifies whether the volume should be encrypted.
     * The effect of setting the encryption state to true depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and whether encryption by
     * default is enabled. For more information,
     * see [Encryption by
     * Default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     * in the Amazon Elastic Compute Cloud User Guide.
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see
     * [Supported Instance
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances).
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param encryptionKey The customer-managed encryption key that is used to encrypt the Volume.
     * The encrypted property must
     * be true if this is provided.
     *
     * Note: If using an `aws-kms.IKey` created from a `aws-kms.Key.fromKeyArn()` here,
     * then the KMS key **must** have the following in its Key policy; otherwise, the Volume
     * will fail to create.
     *
     * ```
     * {
     * "Effect": "Allow",
     * "Principal": { "AWS": "&lt;arn for your account-user&gt; ex: arn:aws:iam::00000000000:root"
     * },
     * "Resource": "*",
     * "Action": [
     * "kms:DescribeKey",
     * "kms:GenerateDataKeyWithoutPlainText",
     * ],
     * "Condition": {
     * "StringEquals": {
     * "kms:ViaService": "ec2.&lt;Region&gt;.amazonaws.com", (eg: ec2.us-east-1.amazonaws.com)
     * "kms:CallerAccount": "0000000000" (your account ID)
     * }
     * }
     * }
     * ```
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
     * The maximum ratio is 50 IOPS/GiB for PROVISIONED_IOPS_SSD,
     * and 500 IOPS/GiB for both PROVISIONED_IOPS_SSD_IO2 and GENERAL_PURPOSE_SSD_GP3.
     * See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for more information.
     *
     * This parameter is valid only for PROVISIONED_IOPS_SSD, PROVISIONED_IOPS_SSD_IO2 and
     * GENERAL_PURPOSE_SSD_GP3 volumes.
     */
    public fun iops(iops: Number)

    /**
     * @param removalPolicy Policy to apply when the volume is removed from the stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param size The size of the volume, in GiBs.
     * You must specify either a snapshot ID or a volume size.
     * See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for details on the allowable size for each type of volume.
     */
    public fun size(size: Size)

    /**
     * @param snapshotId The snapshot from which to create the volume.
     * You must specify either a snapshot ID or a volume size.
     */
    public fun snapshotId(snapshotId: String)

    /**
     * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125
     * and maximum of 1000.
     */
    public fun throughput(throughput: Number)

    /**
     * @param volumeName The value of the physicalName property of this resource.
     */
    public fun volumeName(volumeName: String)

    /**
     * @param volumeType The type of the volume;.
     * what type of storage to use to form the EBS Volume.
     */
    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VolumeProps.Builder =
        software.amazon.awscdk.services.ec2.VolumeProps.builder()

    /**
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations.
     * By default, Amazon EBS disables I/O to the volume from attached EC2
     * instances when it determines that a volume's data is potentially inconsistent. If the
     * consistency of the volume is not a concern, and
     * you prefer that the volume be made available immediately if it's impaired, you can configure
     * the volume to automatically enable I/O.
     */
    override fun autoEnableIo(autoEnableIo: Boolean) {
      cdkBuilder.autoEnableIo(autoEnableIo)
    }

    /**
     * @param availabilityZone The Availability Zone in which to create the volume. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param enableMultiAttach Indicates whether Amazon EBS Multi-Attach is enabled.
     * See [Considerations and
     * limitations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html#considerations)
     * for the constraints of multi-attach.
     */
    override fun enableMultiAttach(enableMultiAttach: Boolean) {
      cdkBuilder.enableMultiAttach(enableMultiAttach)
    }

    /**
     * @param encrypted Specifies whether the volume should be encrypted.
     * The effect of setting the encryption state to true depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and whether encryption by
     * default is enabled. For more information,
     * see [Encryption by
     * Default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     * in the Amazon Elastic Compute Cloud User Guide.
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see
     * [Supported Instance
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances).
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encryptionKey The customer-managed encryption key that is used to encrypt the Volume.
     * The encrypted property must
     * be true if this is provided.
     *
     * Note: If using an `aws-kms.IKey` created from a `aws-kms.Key.fromKeyArn()` here,
     * then the KMS key **must** have the following in its Key policy; otherwise, the Volume
     * will fail to create.
     *
     * ```
     * {
     * "Effect": "Allow",
     * "Principal": { "AWS": "&lt;arn for your account-user&gt; ex: arn:aws:iam::00000000000:root"
     * },
     * "Resource": "*",
     * "Action": [
     * "kms:DescribeKey",
     * "kms:GenerateDataKeyWithoutPlainText",
     * ],
     * "Condition": {
     * "StringEquals": {
     * "kms:ViaService": "ec2.&lt;Region&gt;.amazonaws.com", (eg: ec2.us-east-1.amazonaws.com)
     * "kms:CallerAccount": "0000000000" (your account ID)
     * }
     * }
     * }
     * ```
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
     * The maximum ratio is 50 IOPS/GiB for PROVISIONED_IOPS_SSD,
     * and 500 IOPS/GiB for both PROVISIONED_IOPS_SSD_IO2 and GENERAL_PURPOSE_SSD_GP3.
     * See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for more information.
     *
     * This parameter is valid only for PROVISIONED_IOPS_SSD, PROVISIONED_IOPS_SSD_IO2 and
     * GENERAL_PURPOSE_SSD_GP3 volumes.
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param removalPolicy Policy to apply when the volume is removed from the stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param size The size of the volume, in GiBs.
     * You must specify either a snapshot ID or a volume size.
     * See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for details on the allowable size for each type of volume.
     */
    override fun size(size: Size) {
      cdkBuilder.size(size.let(Size.Companion::unwrap))
    }

    /**
     * @param snapshotId The snapshot from which to create the volume.
     * You must specify either a snapshot ID or a volume size.
     */
    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125
     * and maximum of 1000.
     */
    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    /**
     * @param volumeName The value of the physicalName property of this resource.
     */
    override fun volumeName(volumeName: String) {
      cdkBuilder.volumeName(volumeName)
    }

    /**
     * @param volumeType The type of the volume;.
     * what type of storage to use to form the EBS Volume.
     */
    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.VolumeProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.VolumeProps,
  ) : CdkObject(cdkObject),
      VolumeProps {
    /**
     * Indicates whether the volume is auto-enabled for I/O operations.
     *
     * By default, Amazon EBS disables I/O to the volume from attached EC2
     * instances when it determines that a volume's data is potentially inconsistent. If the
     * consistency of the volume is not a concern, and
     * you prefer that the volume be made available immediately if it's impaired, you can configure
     * the volume to automatically enable I/O.
     *
     * Default: false
     */
    override fun autoEnableIo(): Boolean? = unwrap(this).getAutoEnableIo()

    /**
     * The Availability Zone in which to create the volume.
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     *
     * See [Considerations and
     * limitations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html#considerations)
     * for the constraints of multi-attach.
     *
     * Default: false
     */
    override fun enableMultiAttach(): Boolean? = unwrap(this).getEnableMultiAttach()

    /**
     * Specifies whether the volume should be encrypted.
     *
     * The effect of setting the encryption state to true depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and whether encryption by
     * default is enabled. For more information,
     * see [Encryption by
     * Default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     * in the Amazon Elastic Compute Cloud User Guide.
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see
     * [Supported Instance
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances).
     *
     * Default: false
     */
    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    /**
     * The customer-managed encryption key that is used to encrypt the Volume.
     *
     * The encrypted property must
     * be true if this is provided.
     *
     * Note: If using an `aws-kms.IKey` created from a `aws-kms.Key.fromKeyArn()` here,
     * then the KMS key **must** have the following in its Key policy; otherwise, the Volume
     * will fail to create.
     *
     * ```
     * {
     * "Effect": "Allow",
     * "Principal": { "AWS": "&lt;arn for your account-user&gt; ex: arn:aws:iam::00000000000:root"
     * },
     * "Resource": "*",
     * "Action": [
     * "kms:DescribeKey",
     * "kms:GenerateDataKeyWithoutPlainText",
     * ],
     * "Condition": {
     * "StringEquals": {
     * "kms:ViaService": "ec2.&lt;Region&gt;.amazonaws.com", (eg: ec2.us-east-1.amazonaws.com)
     * "kms:CallerAccount": "0000000000" (your account ID)
     * }
     * }
     * }
     * ```
     *
     * Default: The default KMS key for the account, region, and EC2 service is used.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The number of I/O operations per second (IOPS) to provision for the volume.
     *
     * The maximum ratio is 50 IOPS/GiB for PROVISIONED_IOPS_SSD,
     * and 500 IOPS/GiB for both PROVISIONED_IOPS_SSD_IO2 and GENERAL_PURPOSE_SSD_GP3.
     * See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for more information.
     *
     * This parameter is valid only for PROVISIONED_IOPS_SSD, PROVISIONED_IOPS_SSD_IO2 and
     * GENERAL_PURPOSE_SSD_GP3 volumes.
     *
     * Default: None -- Required for io1 and io2 volumes. The default for gp3 volumes is 3,000 IOPS
     * if omitted.
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * Policy to apply when the volume is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The size of the volume, in GiBs.
     *
     * You must specify either a snapshot ID or a volume size.
     * See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for details on the allowable size for each type of volume.
     *
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the
     * default is the snapshot size.
     */
    override fun size(): Size? = unwrap(this).getSize()?.let(Size::wrap)

    /**
     * The snapshot from which to create the volume.
     *
     * You must specify either a snapshot ID or a volume size.
     *
     * Default: The EBS volume is not created from a snapshot.
     */
    override fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The throughput that the volume supports, in MiB/s Takes a minimum of 125 and maximum of 1000.
     *
     * Default: - 125 MiB/s. Only valid on gp3 volumes.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-throughput)
     */
    override fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The value of the physicalName property of this resource.
     *
     * Default: The physical name will be allocated by CloudFormation at deployment time
     */
    override fun volumeName(): String? = unwrap(this).getVolumeName()

    /**
     * The type of the volume;
     *
     * what type of storage to use to form the EBS Volume.
     *
     * Default: `EbsDeviceVolumeType.GENERAL_PURPOSE_SSD`
     */
    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VolumeProps): VolumeProps =
        CdkObjectWrappers.wrap(cdkObject) as? VolumeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VolumeProps): software.amazon.awscdk.services.ec2.VolumeProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VolumeProps
  }
}
