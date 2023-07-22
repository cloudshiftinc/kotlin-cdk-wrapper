@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileDatadogConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty.builder()

  /**
   * @param instanceUrl The location of the Datadog resource. 
   */
  public fun instanceUrl(instanceUrl: String) {
    cdkBuilder.instanceUrl(instanceUrl)
  }

  public fun build(): CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
