@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileMarketoConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.builder()

  public fun instanceUrl(instanceUrl: String) {
    cdkBuilder.instanceUrl(instanceUrl)
  }

  public fun build(): CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
