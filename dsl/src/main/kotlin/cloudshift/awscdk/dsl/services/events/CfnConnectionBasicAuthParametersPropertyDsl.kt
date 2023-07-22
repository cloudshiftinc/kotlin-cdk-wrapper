@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnConnection

@CdkDslMarker
public class CfnConnectionBasicAuthParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.BasicAuthParametersProperty.Builder =
      CfnConnection.BasicAuthParametersProperty.builder()

  /**
   * @param password The password associated with the user name to use for Basic authorization. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username The user name to use for Basic authorization. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnConnection.BasicAuthParametersProperty = cdkBuilder.build()
}
