@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.panorama.CfnApplicationInstance

@CdkDslMarker
public class CfnApplicationInstanceManifestPayloadPropertyDsl {
  private val cdkBuilder: CfnApplicationInstance.ManifestPayloadProperty.Builder =
      CfnApplicationInstance.ManifestPayloadProperty.builder()

  /**
   * @param payloadData The application manifest.
   */
  public fun payloadData(payloadData: String) {
    cdkBuilder.payloadData(payloadData)
  }

  public fun build(): CfnApplicationInstance.ManifestPayloadProperty = cdkBuilder.build()
}
