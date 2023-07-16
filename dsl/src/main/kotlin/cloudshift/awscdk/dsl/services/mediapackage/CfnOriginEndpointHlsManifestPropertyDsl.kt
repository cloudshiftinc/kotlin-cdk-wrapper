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
public class CfnOriginEndpointHlsManifestPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.HlsManifestProperty.Builder =
      CfnOriginEndpoint.HlsManifestProperty.builder()

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

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
    cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
  }

  public fun manifestName(manifestName: String) {
    cdkBuilder.manifestName(manifestName)
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

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnOriginEndpoint.HlsManifestProperty {
    if(_adTriggers.isNotEmpty()) cdkBuilder.adTriggers(_adTriggers)
    return cdkBuilder.build()
  }
}
