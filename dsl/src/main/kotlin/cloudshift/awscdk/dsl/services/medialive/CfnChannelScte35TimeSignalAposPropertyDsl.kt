@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelScte35TimeSignalAposPropertyDsl {
  private val cdkBuilder: CfnChannel.Scte35TimeSignalAposProperty.Builder =
      CfnChannel.Scte35TimeSignalAposProperty.builder()

  public fun adAvailOffset(adAvailOffset: Number) {
    cdkBuilder.adAvailOffset(adAvailOffset)
  }

  public fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
    cdkBuilder.noRegionalBlackoutFlag(noRegionalBlackoutFlag)
  }

  public fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
    cdkBuilder.webDeliveryAllowedFlag(webDeliveryAllowedFlag)
  }

  public fun build(): CfnChannel.Scte35TimeSignalAposProperty = cdkBuilder.build()
}
