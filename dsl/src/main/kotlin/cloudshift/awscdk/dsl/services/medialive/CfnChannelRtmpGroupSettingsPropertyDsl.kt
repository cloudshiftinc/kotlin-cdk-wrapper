@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelRtmpGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.RtmpGroupSettingsProperty.Builder =
      CfnChannel.RtmpGroupSettingsProperty.builder()

  private val _adMarkers: MutableList<String> = mutableListOf()

  public fun adMarkers(vararg adMarkers: String) {
    _adMarkers.addAll(listOf(*adMarkers))
  }

  public fun adMarkers(adMarkers: Collection<String>) {
    _adMarkers.addAll(adMarkers)
  }

  public fun authenticationScheme(authenticationScheme: String) {
    cdkBuilder.authenticationScheme(authenticationScheme)
  }

  public fun cacheFullBehavior(cacheFullBehavior: String) {
    cdkBuilder.cacheFullBehavior(cacheFullBehavior)
  }

  public fun cacheLength(cacheLength: Number) {
    cdkBuilder.cacheLength(cacheLength)
  }

  public fun captionData(captionData: String) {
    cdkBuilder.captionData(captionData)
  }

  public fun inputLossAction(inputLossAction: String) {
    cdkBuilder.inputLossAction(inputLossAction)
  }

  public fun restartDelay(restartDelay: Number) {
    cdkBuilder.restartDelay(restartDelay)
  }

  public fun build(): CfnChannel.RtmpGroupSettingsProperty {
    if(_adMarkers.isNotEmpty()) cdkBuilder.adMarkers(_adMarkers)
    return cdkBuilder.build()
  }
}
