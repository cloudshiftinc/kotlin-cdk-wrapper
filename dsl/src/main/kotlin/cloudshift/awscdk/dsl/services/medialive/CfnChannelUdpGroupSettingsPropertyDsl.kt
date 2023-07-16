@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelUdpGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.UdpGroupSettingsProperty.Builder =
      CfnChannel.UdpGroupSettingsProperty.builder()

  public fun inputLossAction(inputLossAction: String) {
    cdkBuilder.inputLossAction(inputLossAction)
  }

  public fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
    cdkBuilder.timedMetadataId3Frame(timedMetadataId3Frame)
  }

  public fun timedMetadataId3Period(timedMetadataId3Period: Number) {
    cdkBuilder.timedMetadataId3Period(timedMetadataId3Period)
  }

  public fun build(): CfnChannel.UdpGroupSettingsProperty = cdkBuilder.build()
}
