@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelEncoderSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.EncoderSettingsProperty.Builder =
      CfnChannel.EncoderSettingsProperty.builder()

  private val _audioDescriptions: MutableList<Any> = mutableListOf()

  private val _captionDescriptions: MutableList<Any> = mutableListOf()

  private val _outputGroups: MutableList<Any> = mutableListOf()

  private val _videoDescriptions: MutableList<Any> = mutableListOf()

  public fun audioDescriptions(vararg audioDescriptions: Any) {
    _audioDescriptions.addAll(listOf(*audioDescriptions))
  }

  public fun audioDescriptions(audioDescriptions: Collection<Any>) {
    _audioDescriptions.addAll(audioDescriptions)
  }

  public fun audioDescriptions(audioDescriptions: IResolvable) {
    cdkBuilder.audioDescriptions(audioDescriptions)
  }

  public fun availBlanking(availBlanking: IResolvable) {
    cdkBuilder.availBlanking(availBlanking)
  }

  public fun availBlanking(availBlanking: CfnChannel.AvailBlankingProperty) {
    cdkBuilder.availBlanking(availBlanking)
  }

  public fun availConfiguration(availConfiguration: IResolvable) {
    cdkBuilder.availConfiguration(availConfiguration)
  }

  public fun availConfiguration(availConfiguration: CfnChannel.AvailConfigurationProperty) {
    cdkBuilder.availConfiguration(availConfiguration)
  }

  public fun blackoutSlate(blackoutSlate: IResolvable) {
    cdkBuilder.blackoutSlate(blackoutSlate)
  }

  public fun blackoutSlate(blackoutSlate: CfnChannel.BlackoutSlateProperty) {
    cdkBuilder.blackoutSlate(blackoutSlate)
  }

  public fun captionDescriptions(vararg captionDescriptions: Any) {
    _captionDescriptions.addAll(listOf(*captionDescriptions))
  }

  public fun captionDescriptions(captionDescriptions: Collection<Any>) {
    _captionDescriptions.addAll(captionDescriptions)
  }

  public fun captionDescriptions(captionDescriptions: IResolvable) {
    cdkBuilder.captionDescriptions(captionDescriptions)
  }

  public fun featureActivations(featureActivations: IResolvable) {
    cdkBuilder.featureActivations(featureActivations)
  }

  public fun featureActivations(featureActivations: CfnChannel.FeatureActivationsProperty) {
    cdkBuilder.featureActivations(featureActivations)
  }

  public fun globalConfiguration(globalConfiguration: IResolvable) {
    cdkBuilder.globalConfiguration(globalConfiguration)
  }

  public fun globalConfiguration(globalConfiguration: CfnChannel.GlobalConfigurationProperty) {
    cdkBuilder.globalConfiguration(globalConfiguration)
  }

  public fun motionGraphicsConfiguration(motionGraphicsConfiguration: IResolvable) {
    cdkBuilder.motionGraphicsConfiguration(motionGraphicsConfiguration)
  }

  public
      fun motionGraphicsConfiguration(motionGraphicsConfiguration: CfnChannel.MotionGraphicsConfigurationProperty) {
    cdkBuilder.motionGraphicsConfiguration(motionGraphicsConfiguration)
  }

  public fun nielsenConfiguration(nielsenConfiguration: IResolvable) {
    cdkBuilder.nielsenConfiguration(nielsenConfiguration)
  }

  public fun nielsenConfiguration(nielsenConfiguration: CfnChannel.NielsenConfigurationProperty) {
    cdkBuilder.nielsenConfiguration(nielsenConfiguration)
  }

  public fun outputGroups(vararg outputGroups: Any) {
    _outputGroups.addAll(listOf(*outputGroups))
  }

  public fun outputGroups(outputGroups: Collection<Any>) {
    _outputGroups.addAll(outputGroups)
  }

  public fun outputGroups(outputGroups: IResolvable) {
    cdkBuilder.outputGroups(outputGroups)
  }

  public fun timecodeConfig(timecodeConfig: IResolvable) {
    cdkBuilder.timecodeConfig(timecodeConfig)
  }

  public fun timecodeConfig(timecodeConfig: CfnChannel.TimecodeConfigProperty) {
    cdkBuilder.timecodeConfig(timecodeConfig)
  }

  public fun videoDescriptions(vararg videoDescriptions: Any) {
    _videoDescriptions.addAll(listOf(*videoDescriptions))
  }

  public fun videoDescriptions(videoDescriptions: Collection<Any>) {
    _videoDescriptions.addAll(videoDescriptions)
  }

  public fun videoDescriptions(videoDescriptions: IResolvable) {
    cdkBuilder.videoDescriptions(videoDescriptions)
  }

  public fun build(): CfnChannel.EncoderSettingsProperty {
    if(_audioDescriptions.isNotEmpty()) cdkBuilder.audioDescriptions(_audioDescriptions)
    if(_captionDescriptions.isNotEmpty()) cdkBuilder.captionDescriptions(_captionDescriptions)
    if(_outputGroups.isNotEmpty()) cdkBuilder.outputGroups(_outputGroups)
    if(_videoDescriptions.isNotEmpty()) cdkBuilder.videoDescriptions(_videoDescriptions)
    return cdkBuilder.build()
  }
}
