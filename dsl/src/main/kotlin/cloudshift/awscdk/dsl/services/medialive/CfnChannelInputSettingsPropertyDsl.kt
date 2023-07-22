@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelInputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.InputSettingsProperty.Builder =
      CfnChannel.InputSettingsProperty.builder()

  private val _audioSelectors: MutableList<Any> = mutableListOf()

  private val _captionSelectors: MutableList<Any> = mutableListOf()

  /**
   * @param audioSelectors Information about the specific audio to extract from the input.
   * The parent of this entity is InputSettings.
   */
  public fun audioSelectors(vararg audioSelectors: Any) {
    _audioSelectors.addAll(listOf(*audioSelectors))
  }

  /**
   * @param audioSelectors Information about the specific audio to extract from the input.
   * The parent of this entity is InputSettings.
   */
  public fun audioSelectors(audioSelectors: Collection<Any>) {
    _audioSelectors.addAll(audioSelectors)
  }

  /**
   * @param audioSelectors Information about the specific audio to extract from the input.
   * The parent of this entity is InputSettings.
   */
  public fun audioSelectors(audioSelectors: IResolvable) {
    cdkBuilder.audioSelectors(audioSelectors)
  }

  /**
   * @param captionSelectors Information about the specific captions to extract from the input.
   */
  public fun captionSelectors(vararg captionSelectors: Any) {
    _captionSelectors.addAll(listOf(*captionSelectors))
  }

  /**
   * @param captionSelectors Information about the specific captions to extract from the input.
   */
  public fun captionSelectors(captionSelectors: Collection<Any>) {
    _captionSelectors.addAll(captionSelectors)
  }

  /**
   * @param captionSelectors Information about the specific captions to extract from the input.
   */
  public fun captionSelectors(captionSelectors: IResolvable) {
    cdkBuilder.captionSelectors(captionSelectors)
  }

  /**
   * @param deblockFilter Enables or disables the deblock filter when filtering.
   */
  public fun deblockFilter(deblockFilter: String) {
    cdkBuilder.deblockFilter(deblockFilter)
  }

  /**
   * @param denoiseFilter Enables or disables the denoise filter when filtering.
   */
  public fun denoiseFilter(denoiseFilter: String) {
    cdkBuilder.denoiseFilter(denoiseFilter)
  }

  /**
   * @param filterStrength Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
   */
  public fun filterStrength(filterStrength: Number) {
    cdkBuilder.filterStrength(filterStrength)
  }

  /**
   * @param inputFilter Turns on the filter for this input.
   * MPEG-2 inputs have the deblocking filter enabled by default. 1) auto - filtering is applied
   * depending on input type/quality 2) disabled - no filtering is applied to the input 3) forced -
   * filtering is applied regardless of the input type.
   */
  public fun inputFilter(inputFilter: String) {
    cdkBuilder.inputFilter(inputFilter)
  }

  /**
   * @param networkInputSettings Information about how to connect to the upstream system.
   */
  public fun networkInputSettings(networkInputSettings: IResolvable) {
    cdkBuilder.networkInputSettings(networkInputSettings)
  }

  /**
   * @param networkInputSettings Information about how to connect to the upstream system.
   */
  public fun networkInputSettings(networkInputSettings: CfnChannel.NetworkInputSettingsProperty) {
    cdkBuilder.networkInputSettings(networkInputSettings)
  }

  /**
   * @param scte35Pid the value to be set.
   */
  public fun scte35Pid(scte35Pid: Number) {
    cdkBuilder.scte35Pid(scte35Pid)
  }

  /**
   * @param smpte2038DataPreference Specifies whether to extract applicable ancillary data from a
   * SMPTE-2038 source in this input.
   * Applicable data types are captions, timecode, AFD, and SCTE-104 messages.
   *
   * * PREFER: Extract from SMPTE-2038 if present in this input, otherwise extract from another
   * source (if any).
   * * IGNORE: Never extract any ancillary data from SMPTE-2038.
   */
  public fun smpte2038DataPreference(smpte2038DataPreference: String) {
    cdkBuilder.smpte2038DataPreference(smpte2038DataPreference)
  }

  /**
   * @param sourceEndBehavior The loop input if it is a file.
   */
  public fun sourceEndBehavior(sourceEndBehavior: String) {
    cdkBuilder.sourceEndBehavior(sourceEndBehavior)
  }

  /**
   * @param videoSelector Information about one video to extract from the input.
   */
  public fun videoSelector(videoSelector: IResolvable) {
    cdkBuilder.videoSelector(videoSelector)
  }

  /**
   * @param videoSelector Information about one video to extract from the input.
   */
  public fun videoSelector(videoSelector: CfnChannel.VideoSelectorProperty) {
    cdkBuilder.videoSelector(videoSelector)
  }

  public fun build(): CfnChannel.InputSettingsProperty {
    if(_audioSelectors.isNotEmpty()) cdkBuilder.audioSelectors(_audioSelectors)
    if(_captionSelectors.isNotEmpty()) cdkBuilder.captionSelectors(_captionSelectors)
    return cdkBuilder.build()
  }
}
