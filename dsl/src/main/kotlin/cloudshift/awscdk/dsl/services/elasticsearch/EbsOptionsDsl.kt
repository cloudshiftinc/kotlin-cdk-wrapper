@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.elasticsearch.EbsOptions

@CdkDslMarker
public class EbsOptionsDsl {
  private val cdkBuilder: EbsOptions.Builder = EbsOptions.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  public fun volumeType(volumeType: EbsDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): EbsOptions = cdkBuilder.build()
}
