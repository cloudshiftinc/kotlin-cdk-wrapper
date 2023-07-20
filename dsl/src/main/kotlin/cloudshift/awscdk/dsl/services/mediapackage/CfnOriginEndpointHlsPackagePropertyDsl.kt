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
public class CfnOriginEndpointHlsPackagePropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.HlsPackageProperty.Builder =
      CfnOriginEndpoint.HlsPackageProperty.builder()

  private val _adTriggers: MutableList<String> = mutableListOf()

  public fun adMarkers(adMarkers: String) {
    cdkBuilder.adMarkers(adMarkers)
  }

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

  public fun encryption(encryption: CfnOriginEndpoint.HlsEncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  public fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
    cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
  }

  public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
    cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
  }

  public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  public fun playlistType(playlistType: String) {
    cdkBuilder.playlistType(playlistType)
  }

  public fun playlistWindowSeconds(playlistWindowSeconds: Number) {
    cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
  }

  public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
    cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
  }

  public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
    cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
  }

  public fun streamSelection(streamSelection: IResolvable) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun streamSelection(streamSelection: CfnOriginEndpoint.StreamSelectionProperty) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
    cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
  }

  public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
    cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
  }

  public fun build(): CfnOriginEndpoint.HlsPackageProperty {
    if(_adTriggers.isNotEmpty()) cdkBuilder.adTriggers(_adTriggers)
    return cdkBuilder.build()
  }
}
