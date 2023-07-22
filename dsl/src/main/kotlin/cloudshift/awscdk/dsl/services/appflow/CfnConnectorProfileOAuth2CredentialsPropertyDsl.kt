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

  /**
   * @param accessToken The access token used to access the connector on your behalf.
   */
  public fun accessToken(accessToken: String) {
    cdkBuilder.accessToken(accessToken)
  }

  /**
   * @param clientId The identifier for the desired client.
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param clientSecret The client secret used by the OAuth client to authenticate to the
   * authorization server.
   */
  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * @param oAuthRequest the value to be set.
   */
  public fun oAuthRequest(oAuthRequest: IResolvable) {
    cdkBuilder.oAuthRequest(oAuthRequest)
  }

  /**
   * @param oAuthRequest the value to be set.
   */
  public fun oAuthRequest(oAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty) {
    cdkBuilder.oAuthRequest(oAuthRequest)
  }

  /**
   * @param refreshToken The refresh token used to refresh an expired access token.
   */
  public fun refreshToken(refreshToken: String) {
    cdkBuilder.refreshToken(refreshToken)
  }

  public fun build(): CfnConnectorProfile.OAuth2CredentialsProperty = cdkBuilder.build()
}
