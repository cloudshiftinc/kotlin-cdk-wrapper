@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileVeevaConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.builder()

  /**
   * @param instanceUrl The location of the Veeva resource. 
   */
  public fun instanceUrl(instanceUrl: String) {
    cdkBuilder.instanceUrl(instanceUrl)
  }

  public fun build(): CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
