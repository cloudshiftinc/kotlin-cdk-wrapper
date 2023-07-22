@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The OAuth credentials required for OAuth type authentication.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * OAuthCredentialsProperty oAuthCredentialsProperty = OAuthCredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileOAuthCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.OAuthCredentialsProperty.Builder =
      CfnConnectorProfile.OAuthCredentialsProperty.builder()

  /**
   * @param accessToken The access token used to access protected SAPOData resources.
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
   * @param connectorOAuthRequest the value to be set.
   */
  public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
    cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
  }

  /**
   * @param connectorOAuthRequest the value to be set.
   */
  public
      fun connectorOAuthRequest(connectorOAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty) {
    cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
  }

  /**
   * @param refreshToken The refresh token used to refresh expired access token.
   */
  public fun refreshToken(refreshToken: String) {
    cdkBuilder.refreshToken(refreshToken)
  }

  public fun build(): CfnConnectorProfile.OAuthCredentialsProperty = cdkBuilder.build()
}
