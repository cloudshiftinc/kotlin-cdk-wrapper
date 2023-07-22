@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptionsBase
import software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType

/**
 * Base block device options for an EBS volume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * EbsDeviceOptionsBase ebsDeviceOptionsBase = EbsDeviceOptionsBase.builder()
 * .deleteOnTermination(false)
 * .iops(123)
 * .throughput(123)
 * .volumeType(EbsDeviceVolumeType.STANDARD)
 * .build();
 * ```
 */
@CdkDslMarker
public class EbsDeviceOptionsBaseDsl {
  private val cdkBuilder: EbsDeviceOptionsBase.Builder = EbsDeviceOptionsBase.builder()

  /**
   * @param deleteOnTermination Indicates whether to delete the volume when the instance is
   * terminated.
   */
  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
   * Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
   *
   * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
   * you need at least 100 GiB storage on the volume.
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125 and
   * maximum of 1000.
   */
  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

  /**
   * @param volumeType The EBS volume type.
   */
  public fun volumeType(volumeType: EbsDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): EbsDeviceOptionsBase = cdkBuilder.build()
}
