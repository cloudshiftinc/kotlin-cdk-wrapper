@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileBasicAuthCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.BasicAuthCredentialsProperty.Builder =
      CfnConnectorProfile.BasicAuthCredentialsProperty.builder()

  /**
   * @param password The password to use to connect to a resource. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username The username to use to connect to a resource. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnConnectorProfile.BasicAuthCredentialsProperty = cdkBuilder.build()
}
