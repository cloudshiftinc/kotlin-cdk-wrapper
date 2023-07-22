@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileServiceNowConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.Builder
      = CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.builder()

  /**
   * @param password The password that corresponds to the user name. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username The name of the user. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
