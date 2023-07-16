@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnConnection

@CdkDslMarker
public class CfnConnectionBasicAuthParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.BasicAuthParametersProperty.Builder =
      CfnConnection.BasicAuthParametersProperty.builder()

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnConnection.BasicAuthParametersProperty = cdkBuilder.build()
}
