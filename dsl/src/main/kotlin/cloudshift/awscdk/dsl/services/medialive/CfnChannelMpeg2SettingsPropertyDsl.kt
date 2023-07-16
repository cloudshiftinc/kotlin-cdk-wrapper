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

  public fun adaptiveQuantization(adaptiveQuantization: String) {
    cdkBuilder.adaptiveQuantization(adaptiveQuantization)
  }

  public fun afdSignaling(afdSignaling: String) {
    cdkBuilder.afdSignaling(afdSignaling)
  }

  public fun colorMetadata(colorMetadata: String) {
    cdkBuilder.colorMetadata(colorMetadata)
  }

  public fun colorSpace(colorSpace: String) {
    cdkBuilder.colorSpace(colorSpace)
  }

  public fun displayAspectRatio(displayAspectRatio: String) {
    cdkBuilder.displayAspectRatio(displayAspectRatio)
  }

  public fun filterSettings(filterSettings: IResolvable) {
    cdkBuilder.filterSettings(filterSettings)
  }

  public fun filterSettings(filterSettings: CfnChannel.Mpeg2FilterSettingsProperty) {
    cdkBuilder.filterSettings(filterSettings)
  }

  public fun fixedAfd(fixedAfd: String) {
    cdkBuilder.fixedAfd(fixedAfd)
  }

  public fun framerateDenominator(framerateDenominator: Number) {
    cdkBuilder.framerateDenominator(framerateDenominator)
  }

  public fun framerateNumerator(framerateNumerator: Number) {
    cdkBuilder.framerateNumerator(framerateNumerator)
  }

  public fun gopClosedCadence(gopClosedCadence: Number) {
    cdkBuilder.gopClosedCadence(gopClosedCadence)
  }

  public fun gopNumBFrames(gopNumBFrames: Number) {
    cdkBuilder.gopNumBFrames(gopNumBFrames)
  }

  public fun gopSize(gopSize: Number) {
    cdkBuilder.gopSize(gopSize)
  }

  public fun gopSizeUnits(gopSizeUnits: String) {
    cdkBuilder.gopSizeUnits(gopSizeUnits)
  }

  public fun scanType(scanType: String) {
    cdkBuilder.scanType(scanType)
  }

  public fun subgopLength(subgopLength: String) {
    cdkBuilder.subgopLength(subgopLength)
  }

  public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
    cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
  }

  public
      fun timecodeBurninSettings(timecodeBurninSettings: CfnChannel.TimecodeBurninSettingsProperty) {
    cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
  }

  public fun timecodeInsertion(timecodeInsertion: String) {
    cdkBuilder.timecodeInsertion(timecodeInsertion)
  }

  public fun build(): CfnChannel.Mpeg2SettingsProperty = cdkBuilder.build()
}
