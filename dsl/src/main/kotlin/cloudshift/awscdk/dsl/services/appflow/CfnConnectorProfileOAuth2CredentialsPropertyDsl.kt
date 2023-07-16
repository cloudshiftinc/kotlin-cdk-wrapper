@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileOAuth2CredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.OAuth2CredentialsProperty.Builder =
      CfnConnectorProfile.OAuth2CredentialsProperty.builder()

  public fun accessToken(accessToken: String) {
    cdkBuilder.accessToken(accessToken)
  }

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  public fun oAuthRequest(oAuthRequest: IResolvable) {
    cdkBuilder.oAuthRequest(oAuthRequest)
  }

  public fun oAuthRequest(oAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty) {
    cdkBuilder.oAuthRequest(oAuthRequest)
  }

  public fun refreshToken(refreshToken: String) {
    cdkBuilder.refreshToken(refreshToken)
  }

  public fun build(): CfnConnectorProfile.OAuth2CredentialsProperty = cdkBuilder.build()
}
