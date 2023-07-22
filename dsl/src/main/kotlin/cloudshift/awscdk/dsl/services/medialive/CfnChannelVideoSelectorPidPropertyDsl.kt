@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Selects a specific PID from within a video source.
 *
 * The parent of this entity is VideoSelectorSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VideoSelectorPidProperty videoSelectorPidProperty = VideoSelectorPidProperty.builder()
 * .pid(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html)
 */
@CdkDslMarker
public class CfnChannelVideoSelectorPidPropertyDsl {
  private val cdkBuilder: CfnChannel.VideoSelectorPidProperty.Builder =
      CfnChannel.VideoSelectorPidProperty.builder()

  /**
   * @param pid Selects a specific PID from within a video source.
   */
  public fun pid(pid: Number) {
    cdkBuilder.pid(pid)
  }

  public fun build(): CfnChannel.VideoSelectorPidProperty = cdkBuilder.build()
}
