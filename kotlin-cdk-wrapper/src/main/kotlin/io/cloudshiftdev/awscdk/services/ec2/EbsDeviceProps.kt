@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties of an EBS block device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Key key;
 * EbsDeviceProps ebsDeviceProps = EbsDeviceProps.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKey(key)
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType(EbsDeviceVolumeType.STANDARD)
 * .build();
 * ```
 */
public interface EbsDeviceProps : EbsDeviceSnapshotOptions, EbsDeviceOptions {
  /**
   * Indicates whether to delete the volume when the instance is terminated.
   *
   * Default: - true for Amazon EC2 Auto Scaling, false otherwise (e.g. EBS)
   */
  public override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

  /**
   * The number of I/O operations per second (IOPS) to provision for the volume.
   *
   * Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
   *
   * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
   * you need at least 100 GiB storage on the volume.
   *
   * Default: - none, required for `EbsDeviceVolumeType.IO1`
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
   */
  public override fun iops(): Number? = unwrap(this).getIops()

  /**
   * The snapshot ID of the volume to use.
   *
   * Default: - No snapshot will be used
   */
  public fun snapshotId(): String? = unwrap(this).getSnapshotId()

  /**
   * The throughput to provision for a `gp3` volume.
   *
   * Valid Range: Minimum value of 125. Maximum value of 1000.
   *
   * `gp3` volumes deliver a consistent baseline throughput performance of 125 MiB/s.
   * You can provision additional throughput for an additional cost at a ratio of 0.25 MiB/s per
   * provisioned IOPS.
   *
   * Default: - 125 MiB/s.
   *
   * [Documentation](https://docs.aws.amazon.com/ebs/latest/userguide/general-purpose.html#gp3-performance)
   */
  public override fun throughput(): Number? = unwrap(this).getThroughput()

  /**
   * The EBS volume type.
   *
   * Default: `EbsDeviceVolumeType.GENERAL_PURPOSE_SSD` or
   * `EbsDeviceVolumeType.GENERAL_PURPOSE_SSD_GP3` if
   * `@aws-cdk/aws-ec2:ebsDefaultGp3Volume` is enabled.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
   */
  public override fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  /**
   * A builder for [EbsDeviceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deleteOnTermination Indicates whether to delete the volume when the instance is
     * terminated.
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    /**
     * @param encrypted Specifies whether the EBS volume is encrypted.
     * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
     * Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
     *
     * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
     * you need at least 100 GiB storage on the volume.
     */
    public fun iops(iops: Number)

    /**
     * @param kmsKey The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     * You have to ensure that the KMS CMK has the correct permissions to be used by the service
     * launching the ec2 instances.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param snapshotId The snapshot ID of the volume to use.
     */
    public fun snapshotId(snapshotId: String)

    /**
     * @param throughput The throughput to provision for a `gp3` volume.
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     *
     * `gp3` volumes deliver a consistent baseline throughput performance of 125 MiB/s.
     * You can provision additional throughput for an additional cost at a ratio of 0.25 MiB/s per
     * provisioned IOPS.
     */
    public fun throughput(throughput: Number)

    /**
     * @param volumeSize The volume size, in Gibibytes (GiB).
     * If you specify volumeSize, it must be equal or greater than the size of the snapshot.
     */
    public fun volumeSize(volumeSize: Number)

    /**
     * @param volumeType The EBS volume type.
     */
    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EbsDeviceProps.Builder =
        software.amazon.awscdk.services.ec2.EbsDeviceProps.builder()

    /**
     * @param deleteOnTermination Indicates whether to delete the volume when the instance is
     * terminated.
     */
    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param encrypted Specifies whether the EBS volume is encrypted.
     * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
     * Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
     *
     * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
     * you need at least 100 GiB storage on the volume.
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKey The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     * You have to ensure that the KMS CMK has the correct permissions to be used by the service
     * launching the ec2 instances.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param snapshotId The snapshot ID of the volume to use.
     */
    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * @param throughput The throughput to provision for a `gp3` volume.
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     *
     * `gp3` volumes deliver a consistent baseline throughput performance of 125 MiB/s.
     * You can provision additional throughput for an additional cost at a ratio of 0.25 MiB/s per
     * provisioned IOPS.
     */
    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    /**
     * @param volumeSize The volume size, in Gibibytes (GiB).
     * If you specify volumeSize, it must be equal or greater than the size of the snapshot.
     */
    override fun volumeSize(volumeSize: Number) {
      cdkBuilder.volumeSize(volumeSize)
    }

    /**
     * @param volumeType The EBS volume type.
     */
    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.EbsDeviceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceProps,
  ) : CdkObject(cdkObject),
      EbsDeviceProps {
    /**
     * Indicates whether to delete the volume when the instance is terminated.
     *
     * Default: - true for Amazon EC2 Auto Scaling, false otherwise (e.g. EBS)
     */
    override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

    /**
     * Specifies whether the EBS volume is encrypted.
     *
     * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     */
    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    /**
     * The number of I/O operations per second (IOPS) to provision for the volume.
     *
     * Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
     *
     * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
     * you need at least 100 GiB storage on the volume.
     *
     * Default: - none, required for `EbsDeviceVolumeType.IO1`
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     *
     * You have to ensure that the KMS CMK has the correct permissions to be used by the service
     * launching the ec2 instances.
     *
     * Default: - If encrypted is true, the default aws/ebs KMS key will be used.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#ebs-encryption-requirements)
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * The snapshot ID of the volume to use.
     *
     * Default: - No snapshot will be used
     */
    override fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The throughput to provision for a `gp3` volume.
     *
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     *
     * `gp3` volumes deliver a consistent baseline throughput performance of 125 MiB/s.
     * You can provision additional throughput for an additional cost at a ratio of 0.25 MiB/s per
     * provisioned IOPS.
     *
     * Default: - 125 MiB/s.
     *
     * [Documentation](https://docs.aws.amazon.com/ebs/latest/userguide/general-purpose.html#gp3-performance)
     */
    override fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The volume size, in Gibibytes (GiB).
     *
     * If you specify volumeSize, it must be equal or greater than the size of the snapshot.
     *
     * Default: - The snapshot size
     */
    override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * The EBS volume type.
     *
     * Default: `EbsDeviceVolumeType.GENERAL_PURPOSE_SSD` or
     * `EbsDeviceVolumeType.GENERAL_PURPOSE_SSD_GP3` if
     * `@aws-cdk/aws-ec2:ebsDefaultGp3Volume` is enabled.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
     */
    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceProps): EbsDeviceProps
        = CdkObjectWrappers.wrap(cdkObject) as? EbsDeviceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceProps): software.amazon.awscdk.services.ec2.EbsDeviceProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.EbsDeviceProps
  }
}
