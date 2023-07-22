@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileDynatraceConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.builder()

  /**
   * @param apiToken The API tokens used by Dynatrace API to authenticate various API calls. 
   */
  public fun apiToken(apiToken: String) {
    cdkBuilder.apiToken(apiToken)
  }

  public fun build(): CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
