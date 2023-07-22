@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileSingularConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.builder()

  /**
   * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
   * calling program to your API. 
   */
  public fun apiKey(apiKey: String) {
    cdkBuilder.apiKey(apiKey)
  }

  public fun build(): CfnConnectorProfile.SingularConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
