@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileBasicAuthCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.BasicAuthCredentialsProperty.Builder =
      CfnConnectorProfile.BasicAuthCredentialsProperty.builder()

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnConnectorProfile.BasicAuthCredentialsProperty = cdkBuilder.build()
}
