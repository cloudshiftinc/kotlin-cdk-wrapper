@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileSalesforceConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.Builder
      = CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.builder()

  public fun accessToken(accessToken: String) {
    cdkBuilder.accessToken(accessToken)
  }

  public fun clientCredentialsArn(clientCredentialsArn: String) {
    cdkBuilder.clientCredentialsArn(clientCredentialsArn)
  }

  public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
    cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
  }

  public
      fun connectorOAuthRequest(connectorOAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty) {
    cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
  }

  public fun jwtToken(jwtToken: String) {
    cdkBuilder.jwtToken(jwtToken)
  }

  public fun oAuth2GrantType(oAuth2GrantType: String) {
    cdkBuilder.oAuth2GrantType(oAuth2GrantType)
  }

  public fun refreshToken(refreshToken: String) {
    cdkBuilder.refreshToken(refreshToken)
  }

  public fun build(): CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
