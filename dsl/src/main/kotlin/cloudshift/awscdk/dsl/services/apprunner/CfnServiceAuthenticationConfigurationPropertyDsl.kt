@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceAuthenticationConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.AuthenticationConfigurationProperty.Builder =
      CfnService.AuthenticationConfigurationProperty.builder()

  public fun accessRoleArn(accessRoleArn: String) {
    cdkBuilder.accessRoleArn(accessRoleArn)
  }

  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  public fun build(): CfnService.AuthenticationConfigurationProperty = cdkBuilder.build()
}
