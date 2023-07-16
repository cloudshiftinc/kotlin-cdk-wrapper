@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptions
import software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType

@CdkDslMarker
public class EbsDeviceOptionsDsl {
  private val cdkBuilder: EbsDeviceOptions.Builder = EbsDeviceOptions.builder()

  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

  public fun volumeType(volumeType: EbsDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): EbsDeviceOptions = cdkBuilder.build()
}
