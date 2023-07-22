@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile credentials required when using Salesforce.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SalesforceConnectorProfileCredentialsProperty salesforceConnectorProfileCredentialsProperty =
 * SalesforceConnectorProfileCredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientCredentialsArn("clientCredentialsArn")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .jwtToken("jwtToken")
 * .oAuth2GrantType("oAuth2GrantType")
 * .refreshToken("refreshToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileSalesforceConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.Builder
      = CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.builder()

  /**
   * @param accessToken The credentials used to access protected Salesforce resources.
   */
  public fun accessToken(accessToken: String) {
    cdkBuilder.accessToken(accessToken)
  }

  /**
   * @param clientCredentialsArn The secret manager ARN, which contains the client ID and client
   * secret of the connected app.
   */
  public fun clientCredentialsArn(clientCredentialsArn: String) {
    cdkBuilder.clientCredentialsArn(clientCredentialsArn)
  }

  /**
   * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
   * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
   */
  public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
    cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
  }

  /**
   * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
   * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
   */
  public
      fun connectorOAuthRequest(connectorOAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty) {
    cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
  }

  /**
   * @param jwtToken the value to be set.
   */
  public fun jwtToken(jwtToken: String) {
    cdkBuilder.jwtToken(jwtToken)
  }

  /**
   * @param oAuth2GrantType the value to be set.
   */
  public fun oAuth2GrantType(oAuth2GrantType: String) {
    cdkBuilder.oAuth2GrantType(oAuth2GrantType)
  }

  /**
   * @param refreshToken The credentials used to acquire new access tokens.
   */
  public fun refreshToken(refreshToken: String) {
    cdkBuilder.refreshToken(refreshToken)
  }

  public fun build(): CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
