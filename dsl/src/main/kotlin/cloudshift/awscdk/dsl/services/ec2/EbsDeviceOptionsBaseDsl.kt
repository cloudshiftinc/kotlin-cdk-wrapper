@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType

@CdkDslMarker
public class EbsDeviceOptionsBaseDsl {
  private val cdkBuilder: EbsDeviceOptionsBase.Builder = EbsDeviceOptionsBase.builder()

  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun volumeType(volumeType: EbsDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): EbsDeviceOptionsBase = cdkBuilder.build()
}
