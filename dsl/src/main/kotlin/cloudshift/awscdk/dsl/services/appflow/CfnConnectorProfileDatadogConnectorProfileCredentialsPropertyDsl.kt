@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileDatadogConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.builder()

  public fun apiKey(apiKey: String) {
    cdkBuilder.apiKey(apiKey)
  }

  public fun applicationKey(applicationKey: String) {
    cdkBuilder.applicationKey(applicationKey)
  }

  public fun build(): CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
