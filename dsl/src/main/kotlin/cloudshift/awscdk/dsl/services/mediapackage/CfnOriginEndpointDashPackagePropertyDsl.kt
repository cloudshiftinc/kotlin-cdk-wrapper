@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointDashPackagePropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.DashPackageProperty.Builder =
      CfnOriginEndpoint.DashPackageProperty.builder()

  private val _adTriggers: MutableList<String> = mutableListOf()

  private val _periodTriggers: MutableList<String> = mutableListOf()

  public fun adTriggers(vararg adTriggers: String) {
    _adTriggers.addAll(listOf(*adTriggers))
  }

  public fun adTriggers(adTriggers: Collection<String>) {
    _adTriggers.addAll(adTriggers)
  }

  public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
    cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
  }

  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  public fun encryption(encryption: CfnOriginEndpoint.DashEncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  public fun manifestLayout(manifestLayout: String) {
    cdkBuilder.manifestLayout(manifestLayout)
  }

  public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
    cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
  }

  public fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
    cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
  }

  public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
    cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
  }

  public fun periodTriggers(vararg periodTriggers: String) {
    _periodTriggers.addAll(listOf(*periodTriggers))
  }

  public fun periodTriggers(periodTriggers: Collection<String>) {
    _periodTriggers.addAll(periodTriggers)
  }

  public fun profile(profile: String) {
    cdkBuilder.profile(profile)
  }

  public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
    cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
  }

  public fun segmentTemplateFormat(segmentTemplateFormat: String) {
    cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
  }

  public fun streamSelection(streamSelection: IResolvable) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun streamSelection(streamSelection: CfnOriginEndpoint.StreamSelectionProperty) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
    cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
  }

  public fun utcTiming(utcTiming: String) {
    cdkBuilder.utcTiming(utcTiming)
  }

  public fun utcTimingUri(utcTimingUri: String) {
    cdkBuilder.utcTimingUri(utcTimingUri)
  }

  public fun build(): CfnOriginEndpoint.DashPackageProperty {
    if(_adTriggers.isNotEmpty()) cdkBuilder.adTriggers(_adTriggers)
    if(_periodTriggers.isNotEmpty()) cdkBuilder.periodTriggers(_periodTriggers)
    return cdkBuilder.build()
  }
}
