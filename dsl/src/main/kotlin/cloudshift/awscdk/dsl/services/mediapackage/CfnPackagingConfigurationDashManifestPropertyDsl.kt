@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationDashManifestPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.DashManifestProperty.Builder =
      CfnPackagingConfiguration.DashManifestProperty.builder()

  public fun manifestLayout(manifestLayout: String) {
    cdkBuilder.manifestLayout(manifestLayout)
  }

  public fun manifestName(manifestName: String) {
    cdkBuilder.manifestName(manifestName)
  }

  public fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
    cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
  }

  public fun profile(profile: String) {
    cdkBuilder.profile(profile)
  }

  public fun scteMarkersSource(scteMarkersSource: String) {
    cdkBuilder.scteMarkersSource(scteMarkersSource)
  }

  public fun streamSelection(streamSelection: IResolvable) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun streamSelection(streamSelection: CfnPackagingConfiguration.StreamSelectionProperty) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun build(): CfnPackagingConfiguration.DashManifestProperty = cdkBuilder.build()
}
