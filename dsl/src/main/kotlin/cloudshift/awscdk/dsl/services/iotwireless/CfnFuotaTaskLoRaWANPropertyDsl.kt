@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask

@CdkDslMarker
public class CfnFuotaTaskLoRaWANPropertyDsl {
  private val cdkBuilder: CfnFuotaTask.LoRaWANProperty.Builder =
      CfnFuotaTask.LoRaWANProperty.builder()

  public fun rfRegion(rfRegion: String) {
    cdkBuilder.rfRegion(rfRegion)
  }

  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  public fun build(): CfnFuotaTask.LoRaWANProperty = cdkBuilder.build()
}
