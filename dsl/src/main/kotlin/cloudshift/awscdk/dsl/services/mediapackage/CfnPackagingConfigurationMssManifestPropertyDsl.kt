@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationMssManifestPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.MssManifestProperty.Builder =
      CfnPackagingConfiguration.MssManifestProperty.builder()

  public fun manifestName(manifestName: String) {
    cdkBuilder.manifestName(manifestName)
  }

  public fun streamSelection(streamSelection: IResolvable) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun streamSelection(streamSelection: CfnPackagingConfiguration.StreamSelectionProperty) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun build(): CfnPackagingConfiguration.MssManifestProperty = cdkBuilder.build()
}
