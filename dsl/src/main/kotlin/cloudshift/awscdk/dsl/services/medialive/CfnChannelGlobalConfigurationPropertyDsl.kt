@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelGlobalConfigurationPropertyDsl {
  private val cdkBuilder: CfnChannel.GlobalConfigurationProperty.Builder =
      CfnChannel.GlobalConfigurationProperty.builder()

  /**
   * @param initialAudioGain The value to set the initial audio gain for the channel.
   */
  public fun initialAudioGain(initialAudioGain: Number) {
    cdkBuilder.initialAudioGain(initialAudioGain)
  }

  /**
   * @param inputEndAction Indicates the action to take when the current input completes (for
   * example, end-of-file).
   * When switchAndLoopInputs is configured, MediaLive restarts at the beginning of the first input.
   * When "none" is configured, MediaLive transcodes either black, a solid color, or a user-specified
   * slate images per the "Input Loss Behavior" configuration until the next input switch occurs (which
   * is controlled through the Channel Schedule API).
   */
  public fun inputEndAction(inputEndAction: String) {
    cdkBuilder.inputEndAction(inputEndAction)
  }

  /**
   * @param inputLossBehavior The settings for system actions when the input is lost.
   */
  public fun inputLossBehavior(inputLossBehavior: IResolvable) {
    cdkBuilder.inputLossBehavior(inputLossBehavior)
  }

  /**
   * @param inputLossBehavior The settings for system actions when the input is lost.
   */
  public fun inputLossBehavior(inputLossBehavior: CfnChannel.InputLossBehaviorProperty) {
    cdkBuilder.inputLossBehavior(inputLossBehavior)
  }

  /**
   * @param outputLockingMode Indicates how MediaLive pipelines are synchronized.
   * PIPELINELOCKING - MediaLive attempts to synchronize the output of each pipeline to the other.
   * EPOCHLOCKING - MediaLive attempts to synchronize the output of each pipeline to the Unix epoch.
   */
  public fun outputLockingMode(outputLockingMode: String) {
    cdkBuilder.outputLockingMode(outputLockingMode)
  }

  /**
   * @param outputTimingSource Indicates whether the rate of frames emitted by the Live encoder
   * should be paced by its system clock (which optionally might be locked to another source through
   * NTP) or should be locked to the clock of the source that is providing the input stream.
   */
  public fun outputTimingSource(outputTimingSource: String) {
    cdkBuilder.outputTimingSource(outputTimingSource)
  }

  /**
   * @param supportLowFramerateInputs Adjusts the video input buffer for streams with very low video
   * frame rates.
   * This is commonly set to enabled for music channels with less than one video frame per second.
   */
  public fun supportLowFramerateInputs(supportLowFramerateInputs: String) {
    cdkBuilder.supportLowFramerateInputs(supportLowFramerateInputs)
  }

  public fun build(): CfnChannel.GlobalConfigurationProperty = cdkBuilder.build()
}
