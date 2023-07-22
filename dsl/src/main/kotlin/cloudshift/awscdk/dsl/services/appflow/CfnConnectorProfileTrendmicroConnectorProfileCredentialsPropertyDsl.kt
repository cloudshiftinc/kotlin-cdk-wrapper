@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileTrendmicroConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.Builder
      = CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.builder()

  /**
   * @param apiSecretKey The Secret Access Key portion of the credentials. 
   */
  public fun apiSecretKey(apiSecretKey: String) {
    cdkBuilder.apiSecretKey(apiSecretKey)
  }

  public fun build(): CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
