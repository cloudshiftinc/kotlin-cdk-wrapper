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

  public fun audioSelectors(vararg audioSelectors: Any) {
    _audioSelectors.addAll(listOf(*audioSelectors))
  }

  public fun audioSelectors(audioSelectors: Collection<Any>) {
    _audioSelectors.addAll(audioSelectors)
  }

  public fun audioSelectors(audioSelectors: IResolvable) {
    cdkBuilder.audioSelectors(audioSelectors)
  }

  public fun captionSelectors(vararg captionSelectors: Any) {
    _captionSelectors.addAll(listOf(*captionSelectors))
  }

  public fun captionSelectors(captionSelectors: Collection<Any>) {
    _captionSelectors.addAll(captionSelectors)
  }

  public fun captionSelectors(captionSelectors: IResolvable) {
    cdkBuilder.captionSelectors(captionSelectors)
  }

  public fun deblockFilter(deblockFilter: String) {
    cdkBuilder.deblockFilter(deblockFilter)
  }

  public fun denoiseFilter(denoiseFilter: String) {
    cdkBuilder.denoiseFilter(denoiseFilter)
  }

  public fun filterStrength(filterStrength: Number) {
    cdkBuilder.filterStrength(filterStrength)
  }

  public fun inputFilter(inputFilter: String) {
    cdkBuilder.inputFilter(inputFilter)
  }

  public fun networkInputSettings(networkInputSettings: IResolvable) {
    cdkBuilder.networkInputSettings(networkInputSettings)
  }

  public fun networkInputSettings(networkInputSettings: CfnChannel.NetworkInputSettingsProperty) {
    cdkBuilder.networkInputSettings(networkInputSettings)
  }

  public fun scte35Pid(scte35Pid: Number) {
    cdkBuilder.scte35Pid(scte35Pid)
  }

  public fun smpte2038DataPreference(smpte2038DataPreference: String) {
    cdkBuilder.smpte2038DataPreference(smpte2038DataPreference)
  }

  public fun sourceEndBehavior(sourceEndBehavior: String) {
    cdkBuilder.sourceEndBehavior(sourceEndBehavior)
  }

  public fun videoSelector(videoSelector: IResolvable) {
    cdkBuilder.videoSelector(videoSelector)
  }

  public fun videoSelector(videoSelector: CfnChannel.VideoSelectorProperty) {
    cdkBuilder.videoSelector(videoSelector)
  }

  public fun build(): CfnChannel.InputSettingsProperty {
    if(_audioSelectors.isNotEmpty()) cdkBuilder.audioSelectors(_audioSelectors)
    if(_captionSelectors.isNotEmpty()) cdkBuilder.captionSelectors(_captionSelectors)
    return cdkBuilder.build()
  }
}
