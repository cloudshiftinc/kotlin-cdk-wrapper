@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileZendeskConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty.builder()

  /**
   * @param accessToken The credentials used to access protected Zendesk resources.
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

  public fun build(): CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
