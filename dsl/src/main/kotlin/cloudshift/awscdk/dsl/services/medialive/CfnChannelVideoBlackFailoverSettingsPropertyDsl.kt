@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelVideoBlackFailoverSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.VideoBlackFailoverSettingsProperty.Builder =
      CfnChannel.VideoBlackFailoverSettingsProperty.builder()

  public fun blackDetectThreshold(blackDetectThreshold: Number) {
    cdkBuilder.blackDetectThreshold(blackDetectThreshold)
  }

  public fun videoBlackThresholdMsec(videoBlackThresholdMsec: Number) {
    cdkBuilder.videoBlackThresholdMsec(videoBlackThresholdMsec)
  }

  public fun build(): CfnChannel.VideoBlackFailoverSettingsProperty = cdkBuilder.build()
}
