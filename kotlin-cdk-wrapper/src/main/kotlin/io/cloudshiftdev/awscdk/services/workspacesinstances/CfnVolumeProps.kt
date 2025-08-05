@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesinstances

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
 * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
 * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
 * .availabilityZone("availabilityZone")
 * // the properties below are optional
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .sizeInGb(123)
 * .snapshotId("snapshotId")
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .throughput(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html)
 */
public interface CfnVolumeProps {
  /**
   * The Availability Zone in which to create the volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-availabilityzone)
   */
  public fun availabilityZone(): String

  /**
   * Indicates whether the volume should be encrypted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-encrypted)
   */
  public fun encrypted(): Any? = unwrap(this).getEncrypted()

  /**
   * The number of I/O operations per second (IOPS).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-iops)
   */
  public fun iops(): Number? = unwrap(this).getIops()

  /**
   * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for
   * Amazon EBS encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The size of the volume, in GiBs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-sizeingb)
   */
  public fun sizeInGb(): Number? = unwrap(this).getSizeInGb()

  /**
   * The snapshot from which to create the volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-snapshotid)
   */
  public fun snapshotId(): String? = unwrap(this).getSnapshotId()

  /**
   * The tags passed to EBS volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-tagspecifications)
   */
  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-throughput)
   */
  public fun throughput(): Number? = unwrap(this).getThroughput()

  /**
   * The volume type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-volumetype)
   */
  public fun volumeType(): String? = unwrap(this).getVolumeType()

  /**
   * A builder for [CfnVolumeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The Availability Zone in which to create the volume. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     */
    public fun encrypted(encrypted: IResolvable)

    /**
     * @param iops The number of I/O operations per second (IOPS).
     */
    public fun iops(iops: Number)

    /**
     * @param kmsKeyId The identifier of the AWS Key Management Service (AWS KMS) customer master
     * key (CMK) to use for Amazon EBS encryption.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param sizeInGb The size of the volume, in GiBs.
     */
    public fun sizeInGb(sizeInGb: Number)

    /**
     * @param snapshotId The snapshot from which to create the volume.
     */
    public fun snapshotId(snapshotId: String)

    /**
     * @param tagSpecifications The tags passed to EBS volume.
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * @param tagSpecifications The tags passed to EBS volume.
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * @param tagSpecifications The tags passed to EBS volume.
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * @param throughput The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     */
    public fun throughput(throughput: Number)

    /**
     * @param volumeType The volume type.
     */
    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeProps.Builder =
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeProps.builder()

    /**
     * @param availabilityZone The Availability Zone in which to create the volume. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     */
    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param iops The number of I/O operations per second (IOPS).
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKeyId The identifier of the AWS Key Management Service (AWS KMS) customer master
     * key (CMK) to use for Amazon EBS encryption.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param sizeInGb The size of the volume, in GiBs.
     */
    override fun sizeInGb(sizeInGb: Number) {
      cdkBuilder.sizeInGb(sizeInGb)
    }

    /**
     * @param snapshotId The snapshot from which to create the volume.
     */
    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * @param tagSpecifications The tags passed to EBS volume.
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tagSpecifications The tags passed to EBS volume.
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param tagSpecifications The tags passed to EBS volume.
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * @param throughput The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     */
    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    /**
     * @param volumeType The volume type.
     */
    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.workspacesinstances.CfnVolumeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolumeProps,
  ) : CdkObject(cdkObject),
      CfnVolumeProps {
    /**
     * The Availability Zone in which to create the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-availabilityzone)
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * Indicates whether the volume should be encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-encrypted)
     */
    override fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The number of I/O operations per second (IOPS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-iops)
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use
     * for Amazon EBS encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The size of the volume, in GiBs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-sizeingb)
     */
    override fun sizeInGb(): Number? = unwrap(this).getSizeInGb()

    /**
     * The snapshot from which to create the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-snapshotid)
     */
    override fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The tags passed to EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-tagspecifications)
     */
    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-throughput)
     */
    override fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The volume type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-volumetype)
     */
    override fun volumeType(): String? = unwrap(this).getVolumeType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolumeProps):
        CfnVolumeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVolumeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeProps):
        software.amazon.awscdk.services.workspacesinstances.CfnVolumeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspacesinstances.CfnVolumeProps
  }
}
