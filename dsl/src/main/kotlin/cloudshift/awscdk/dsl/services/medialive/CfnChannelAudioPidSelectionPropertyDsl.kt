@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Used to extract audio by The PID.
 *
 * The parent of this entity is AudioSelectorSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioPidSelectionProperty audioPidSelectionProperty = AudioPidSelectionProperty.builder()
 * .pid(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html)
 */
@CdkDslMarker
public class CfnChannelAudioPidSelectionPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioPidSelectionProperty.Builder =
      CfnChannel.AudioPidSelectionProperty.builder()

  /**
   * @param pid Select the audio by this PID.
   */
  public fun pid(pid: Number) {
    cdkBuilder.pid(pid)
  }

  public fun build(): CfnChannel.AudioPidSelectionProperty = cdkBuilder.build()
}
