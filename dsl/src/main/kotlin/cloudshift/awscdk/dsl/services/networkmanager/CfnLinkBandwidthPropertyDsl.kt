@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.networkmanager.CfnLink

@CdkDslMarker
public class CfnLinkBandwidthPropertyDsl {
  private val cdkBuilder: CfnLink.BandwidthProperty.Builder = CfnLink.BandwidthProperty.builder()

  public fun downloadSpeed(downloadSpeed: Number) {
    cdkBuilder.downloadSpeed(downloadSpeed)
  }

  public fun uploadSpeed(uploadSpeed: Number) {
    cdkBuilder.uploadSpeed(uploadSpeed)
  }

  public fun build(): CfnLink.BandwidthProperty = cdkBuilder.build()
}
