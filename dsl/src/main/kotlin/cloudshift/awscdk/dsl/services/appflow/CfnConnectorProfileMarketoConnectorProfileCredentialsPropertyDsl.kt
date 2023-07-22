@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile credentials required by Marketo.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * MarketoConnectorProfileCredentialsProperty marketoConnectorProfileCredentialsProperty =
 * MarketoConnectorProfileCredentialsProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .accessToken("accessToken")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileMarketoConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty.builder()

  /**
   * @param accessToken The credentials used to access protected Marketo resources.
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

  public fun build(): CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
