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

  /**
   * @param manifestName A short string that's appended to the end of the endpoint URL to create a
   * unique path to this packaging configuration.
   */
  public fun manifestName(manifestName: String) {
    cdkBuilder.manifestName(manifestName)
  }

  /**
   * @param streamSelection Video bitrate limitations for outputs from this packaging configuration.
   */
  public fun streamSelection(streamSelection: IResolvable) {
    cdkBuilder.streamSelection(streamSelection)
  }

  /**
   * @param streamSelection Video bitrate limitations for outputs from this packaging configuration.
   */
  public fun streamSelection(streamSelection: CfnPackagingConfiguration.StreamSelectionProperty) {
    cdkBuilder.streamSelection(streamSelection)
  }

  public fun build(): CfnPackagingConfiguration.MssManifestProperty = cdkBuilder.build()
}
