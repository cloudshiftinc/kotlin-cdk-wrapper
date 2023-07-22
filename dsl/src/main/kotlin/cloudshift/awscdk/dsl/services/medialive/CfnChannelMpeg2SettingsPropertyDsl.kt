@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMpeg2SettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Mpeg2SettingsProperty.Builder =
      CfnChannel.Mpeg2SettingsProperty.builder()

  /**
   * @param adaptiveQuantization Choose Off to disable adaptive quantization.
   * Or choose another value to enable the quantizer and set its strength. The strengths are: Auto,
   * Off, Low, Medium, High. When you enable this field, MediaLive allows intra-frame quantizers to
   * vary, which might improve visual quality.
   */
  public fun adaptiveQuantization(adaptiveQuantization: String) {
    cdkBuilder.adaptiveQuantization(adaptiveQuantization)
  }

  /**
   * @param afdSignaling Indicates the AFD values that MediaLive will write into the video encode.
   * If you do not know what AFD signaling is, or if your downstream system has not given you
   * guidance, choose AUTO.
   * AUTO: MediaLive will try to preserve the input AFD value (in cases where multiple AFD values
   * are valid).
   * FIXED: MediaLive will use the value you specify in fixedAFD.
   */
  public fun afdSignaling(afdSignaling: String) {
    cdkBuilder.afdSignaling(afdSignaling)
  }

  /**
   * @param colorMetadata Specifies whether to include the color space metadata.
   * The metadata describes the color space that applies to the video (the colorSpace field). We
   * recommend that you insert the metadata.
   */
  public fun colorMetadata(colorMetadata: String) {
    cdkBuilder.colorMetadata(colorMetadata)
  }

  /**
   * @param colorSpace Choose the type of color space conversion to apply to the output.
   * For detailed information on setting up both the input and the output to obtain the desired
   * color space in the output, see the section on "MediaLive Features - Video - color space" in the
   * MediaLive User Guide.
   * PASSTHROUGH: Keep the color space of the input content - do not convert it.
   * AUTO:Convert all content that is SD to rec 601, and convert all content that is HD to rec 709.
   */
  public fun colorSpace(colorSpace: String) {
    cdkBuilder.colorSpace(colorSpace)
  }

  /**
   * @param displayAspectRatio Sets the pixel aspect ratio for the encode.
   */
  public fun displayAspectRatio(displayAspectRatio: String) {
    cdkBuilder.displayAspectRatio(displayAspectRatio)
  }

  /**
   * @param filterSettings Optionally specify a noise reduction filter, which can improve quality of
   * compressed content.
   * If you do not choose a filter, no filter will be applied.
   * TEMPORAL: This filter is useful for both source content that is noisy (when it has excessive
   * digital artifacts) and source content that is clean.
   * When the content is noisy, the filter cleans up the source content before the encoding phase,
   * with these two effects: First, it improves the output video quality because the content has been
   * cleaned up. Secondly, it decreases the bandwidth because MediaLive does not waste bits on encoding
   * noise.
   * When the content is reasonably clean, the filter tends to decrease the bitrate.
   */
  public fun filterSettings(filterSettings: IResolvable) {
    cdkBuilder.filterSettings(filterSettings)
  }

  /**
   * @param filterSettings Optionally specify a noise reduction filter, which can improve quality of
   * compressed content.
   * If you do not choose a filter, no filter will be applied.
   * TEMPORAL: This filter is useful for both source content that is noisy (when it has excessive
   * digital artifacts) and source content that is clean.
   * When the content is noisy, the filter cleans up the source content before the encoding phase,
   * with these two effects: First, it improves the output video quality because the content has been
   * cleaned up. Secondly, it decreases the bandwidth because MediaLive does not waste bits on encoding
   * noise.
   * When the content is reasonably clean, the filter tends to decrease the bitrate.
   */
  public fun filterSettings(filterSettings: CfnChannel.Mpeg2FilterSettingsProperty) {
    cdkBuilder.filterSettings(filterSettings)
  }

  /**
   * @param fixedAfd Complete this field only when afdSignaling is set to FIXED.
   * Enter the AFD value (4 bits) to write on all frames of the video encode.
   */
  public fun fixedAfd(fixedAfd: String) {
    cdkBuilder.fixedAfd(fixedAfd)
  }

  /**
   * @param framerateDenominator description": "The framerate denominator.
   * For example, 1001. The framerate is the numerator divided by the denominator. For example,
   * 24000 / 1001 = 23.976 FPS.
   */
  public fun framerateDenominator(framerateDenominator: Number) {
    cdkBuilder.framerateDenominator(framerateDenominator)
  }

  /**
   * @param framerateNumerator The framerate numerator.
   * For example, 24000. The framerate is the numerator divided by the denominator. For example,
   * 24000 / 1001 = 23.976 FPS.
   */
  public fun framerateNumerator(framerateNumerator: Number) {
    cdkBuilder.framerateNumerator(framerateNumerator)
  }

  /**
   * @param gopClosedCadence MPEG2: default is open GOP.
   */
  public fun gopClosedCadence(gopClosedCadence: Number) {
    cdkBuilder.gopClosedCadence(gopClosedCadence)
  }

  /**
   * @param gopNumBFrames Relates to the GOP structure.
   * The number of B-frames between reference frames. If you do not know what a B-frame is, use the
   * default.
   */
  public fun gopNumBFrames(gopNumBFrames: Number) {
    cdkBuilder.gopNumBFrames(gopNumBFrames)
  }

  /**
   * @param gopSize Relates to the GOP structure.
   * The GOP size (keyframe interval) in the units specified in gopSizeUnits. If you do not know
   * what GOP is, use the default.
   * If gopSizeUnits is frames, then the gopSize must be an integer and must be greater than or
   * equal to 1.
   * If gopSizeUnits is seconds, the gopSize must be greater than 0, but does not need to be an
   * integer.
   */
  public fun gopSize(gopSize: Number) {
    cdkBuilder.gopSize(gopSize)
  }

  /**
   * @param gopSizeUnits Relates to the GOP structure.
   * Specifies whether the gopSize is specified in frames or seconds. If you do not plan to change
   * the default gopSize, leave the default. If you specify SECONDS, MediaLive will internally convert
   * the gop size to a frame count.
   */
  public fun gopSizeUnits(gopSizeUnits: String) {
    cdkBuilder.gopSizeUnits(gopSizeUnits)
  }

  /**
   * @param scanType Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
   */
  public fun scanType(scanType: String) {
    cdkBuilder.scanType(scanType)
  }

  /**
   * @param subgopLength Relates to the GOP structure.
   * If you do not know what GOP is, use the default.
   * FIXED: Set the number of B-frames in each sub-GOP to the value in gopNumBFrames.
   * DYNAMIC: Let MediaLive optimize the number of B-frames in each sub-GOP, to improve visual
   * quality.
   */
  public fun subgopLength(subgopLength: String) {
    cdkBuilder.subgopLength(subgopLength)
  }

  /**
   * @param timecodeBurninSettings the value to be set.
   */
  public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
    cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
  }

  /**
   * @param timecodeBurninSettings the value to be set.
   */
  public
      fun timecodeBurninSettings(timecodeBurninSettings: CfnChannel.TimecodeBurninSettingsProperty) {
    cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
  }

  /**
   * @param timecodeInsertion Determines how MediaLive inserts timecodes in the output video.
   * For detailed information about setting up the input and the output for a timecode, see the
   * section on "MediaLive Features - Timecode configuration" in the MediaLive User Guide.
   * DISABLED: do not include timecodes.
   * GOP_TIMECODE: Include timecode metadata in the GOP header.
   */
  public fun timecodeInsertion(timecodeInsertion: String) {
    cdkBuilder.timecodeInsertion(timecodeInsertion)
  }

  public fun build(): CfnChannel.Mpeg2SettingsProperty = cdkBuilder.build()
}
