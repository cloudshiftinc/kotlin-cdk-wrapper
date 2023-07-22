@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.grafana.CfnWorkspace

@CdkDslMarker
public class CfnWorkspaceIdpMetadataPropertyDsl {
  private val cdkBuilder: CfnWorkspace.IdpMetadataProperty.Builder =
      CfnWorkspace.IdpMetadataProperty.builder()

  /**
   * @param url The URL of the location containing the IdP metadata.
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  /**
   * @param xml The full IdP metadata, in XML format.
   */
  public fun xml(xml: String) {
    cdkBuilder.xml(xml)
  }

  public fun build(): CfnWorkspace.IdpMetadataProperty = cdkBuilder.build()
}
