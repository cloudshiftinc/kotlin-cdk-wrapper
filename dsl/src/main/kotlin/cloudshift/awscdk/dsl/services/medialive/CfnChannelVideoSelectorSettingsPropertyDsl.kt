@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelVideoSelectorSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.VideoSelectorSettingsProperty.Builder =
      CfnChannel.VideoSelectorSettingsProperty.builder()

  public fun videoSelectorPid(videoSelectorPid: IResolvable) {
    cdkBuilder.videoSelectorPid(videoSelectorPid)
  }

  public fun videoSelectorPid(videoSelectorPid: CfnChannel.VideoSelectorPidProperty) {
    cdkBuilder.videoSelectorPid(videoSelectorPid)
  }

  public fun videoSelectorProgramId(videoSelectorProgramId: IResolvable) {
    cdkBuilder.videoSelectorProgramId(videoSelectorProgramId)
  }

  public
      fun videoSelectorProgramId(videoSelectorProgramId: CfnChannel.VideoSelectorProgramIdProperty) {
    cdkBuilder.videoSelectorProgramId(videoSelectorProgramId)
  }

  public fun build(): CfnChannel.VideoSelectorSettingsProperty = cdkBuilder.build()
}
