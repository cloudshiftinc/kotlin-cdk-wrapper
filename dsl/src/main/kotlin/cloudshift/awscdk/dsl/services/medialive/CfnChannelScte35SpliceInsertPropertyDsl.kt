@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelScte35SpliceInsertPropertyDsl {
  private val cdkBuilder: CfnChannel.Scte35SpliceInsertProperty.Builder =
      CfnChannel.Scte35SpliceInsertProperty.builder()

  /**
   * @param adAvailOffset When specified, this offset (in milliseconds) is added to the input ad
   * avail PTS time.
   * This applies only to embedded SCTE 104/35 messages. It doesn't apply to OOB messages.
   */
  public fun adAvailOffset(adAvailOffset: Number) {
    cdkBuilder.adAvailOffset(adAvailOffset)
  }

  /**
   * @param noRegionalBlackoutFlag When set to ignore, segment descriptors with
   * noRegionalBlackoutFlag set to 0 no longer trigger blackouts or ad avail slates.
   */
  public fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
    cdkBuilder.noRegionalBlackoutFlag(noRegionalBlackoutFlag)
  }

  /**
   * @param webDeliveryAllowedFlag When set to ignore, segment descriptors with
   * webDeliveryAllowedFlag set to 0 no longer trigger blackouts or ad avail slates.
   */
  public fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
    cdkBuilder.webDeliveryAllowedFlag(webDeliveryAllowedFlag)
  }

  public fun build(): CfnChannel.Scte35SpliceInsertProperty = cdkBuilder.build()
}
