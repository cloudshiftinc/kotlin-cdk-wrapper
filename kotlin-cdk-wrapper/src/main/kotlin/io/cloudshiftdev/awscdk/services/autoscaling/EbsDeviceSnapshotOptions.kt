@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Block device options for an EBS volume created from a snapshot.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * EbsDeviceSnapshotOptions ebsDeviceSnapshotOptions = EbsDeviceSnapshotOptions.builder()
 * .deleteOnTermination(false)
 * .iops(123)
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType(EbsDeviceVolumeType.STANDARD)
 * .build();
 * ```
 */
public interface EbsDeviceSnapshotOptions : EbsDeviceOptionsBase {
  /**
   * The volume size, in Gibibytes (GiB).
   *
   * If you specify volumeSize, it must be equal or greater than the size of the snapshot.
   *
   * Default: - The snapshot size
   */
  public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

  /**
   * A builder for [EbsDeviceSnapshotOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deleteOnTermination Indicates whether to delete the volume when the instance is
     * terminated.
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    /**
     * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
     * Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
     *
     * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
     * you need at least 100 GiB storage on the volume.
     */
    public fun iops(iops: Number)

    /**
     * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125
     * and maximum of 1000.
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
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions.Builder =
        software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions.builder()

    /**
     * @param deleteOnTermination Indicates whether to delete the volume when the instance is
     * terminated.
     */
    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
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
     * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125
     * and maximum of 1000.
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

    public fun build(): software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions,
  ) : CdkObject(cdkObject),
      EbsDeviceSnapshotOptions {
    /**
     * Indicates whether to delete the volume when the instance is terminated.
     *
     * Default: - true for Amazon EC2 Auto Scaling, false otherwise (e.g. EBS)
     */
    override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

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
     * The throughput that the volume supports, in MiB/s Takes a minimum of 125 and maximum of 1000.
     *
     * Default: - 125 MiB/s. Only valid on gp3 volumes.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
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
     * Default: `EbsDeviceVolumeType.GP2`
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
     */
    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceSnapshotOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions):
        EbsDeviceSnapshotOptions = CdkObjectWrappers.wrap(cdkObject) as? EbsDeviceSnapshotOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsDeviceSnapshotOptions):
        software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions
  }
}
