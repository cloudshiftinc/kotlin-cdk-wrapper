@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Block device options for an EBS volume.
 *
 * Example:
 *
 * ```
 * BastionHostLinux host = BastionHostLinux.Builder.create(this, "BastionHost")
 * .vpc(vpc)
 * .blockDevices(List.of(BlockDevice.builder()
 * .deviceName("/dev/sdh")
 * .volume(BlockDeviceVolume.ebs(10, EbsDeviceOptions.builder()
 * .encrypted(true)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
public interface EbsDeviceOptions : EbsDeviceOptionsBase {
  /**
   * Specifies whether the EBS volume is encrypted.
   *
   * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
   */
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

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
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * A builder for [EbsDeviceOptions]
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
     * @param volumeType The EBS volume type.
     */
    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EbsDeviceOptions.Builder =
        software.amazon.awscdk.services.ec2.EbsDeviceOptions.builder()

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
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * @param volumeType The EBS volume type.
     */
    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.EbsDeviceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceOptions,
  ) : CdkObject(cdkObject), EbsDeviceOptions {
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
     * The EBS volume type.
     *
     * Default: `EbsDeviceVolumeType.GP2`
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
     */
    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceOptions):
        EbsDeviceOptions = CdkObjectWrappers.wrap(cdkObject) as? EbsDeviceOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceOptions):
        software.amazon.awscdk.services.ec2.EbsDeviceOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.EbsDeviceOptions
  }
}
