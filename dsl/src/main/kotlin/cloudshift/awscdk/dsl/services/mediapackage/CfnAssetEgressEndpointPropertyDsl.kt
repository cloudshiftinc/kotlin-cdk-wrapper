@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnAsset

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
