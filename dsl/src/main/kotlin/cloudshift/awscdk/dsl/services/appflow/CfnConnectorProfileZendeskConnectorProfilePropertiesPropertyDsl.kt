@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileZendeskConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty.builder()

  public fun instanceUrl(instanceUrl: String) {
    cdkBuilder.instanceUrl(instanceUrl)
  }

  public fun build(): CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
