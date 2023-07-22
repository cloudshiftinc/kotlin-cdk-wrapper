@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnAsset

/**
 * The playback endpoint for a packaging configuration on an asset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * EgressEndpointProperty egressEndpointProperty = EgressEndpointProperty.builder()
 * .packagingConfigurationId("packagingConfigurationId")
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-asset-egressendpoint.html)
 */
@CdkDslMarker
public class CfnAssetEgressEndpointPropertyDsl {
  private val cdkBuilder: CfnAsset.EgressEndpointProperty.Builder =
      CfnAsset.EgressEndpointProperty.builder()

  /**
   * @param packagingConfigurationId The ID of a packaging configuration that's applied to this
   * asset. 
   */
  public fun packagingConfigurationId(packagingConfigurationId: String) {
    cdkBuilder.packagingConfigurationId(packagingConfigurationId)
  }

  /**
   * @param url The URL that's used to request content from this endpoint. 
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnAsset.EgressEndpointProperty = cdkBuilder.build()
}
