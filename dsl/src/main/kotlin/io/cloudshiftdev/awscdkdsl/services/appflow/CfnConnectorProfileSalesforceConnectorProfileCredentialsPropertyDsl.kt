@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile credentials required when using Salesforce.
 *
 * Example:
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
    private val cdkBuilder:
        CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.builder()

    /** @param accessToken The credentials used to access protected Salesforce resources. */
    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    /**
     * @param clientCredentialsArn The secret manager ARN, which contains the client ID and client
     *   secret of the connected app.
     */
    public fun clientCredentialsArn(clientCredentialsArn: String) {
        cdkBuilder.clientCredentialsArn(clientCredentialsArn)
    }

    /**
     * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
     *   supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
     */
    public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
    }

    /**
     * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
     *   supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
     */
    public fun connectorOAuthRequest(
        connectorOAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty
    ) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
    }

    /**
     * @param jwtToken A JSON web token (JWT) that authorizes Amazon AppFlow to access your
     *   Salesforce records.
     */
    public fun jwtToken(jwtToken: String) {
        cdkBuilder.jwtToken(jwtToken)
    }

    /**
     * @param oAuth2GrantType Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it
     *   requests an access token from Salesforce. Amazon AppFlow requires an access token each time
     *   it attempts to access your Salesforce records. You can specify one of the following values:
     * * **AUTHORIZATION_CODE** - Amazon AppFlow passes an authorization code when it requests the
     *   access token from Salesforce. Amazon AppFlow receives the authorization code from
     *   Salesforce after you log in to your Salesforce account and authorize Amazon AppFlow to
     *   access your records.
     * * **CLIENT_CREDENTIALS** - Amazon AppFlow passes client credentials (a client ID and client
     *   secret) when it requests the access token from Salesforce. You provide these credentials to
     *   Amazon AppFlow when you define the connection to your Salesforce account.
     * * **JWT_BEARER** - Amazon AppFlow passes a JSON web token (JWT) when it requests the access
     *   token from Salesforce. You provide the JWT to Amazon AppFlow when you define the connection
     *   to your Salesforce account. When you use this grant type, you don't need to log in to your
     *   Salesforce account to authorize Amazon AppFlow to access your records.
     */
    public fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
    }

    /** @param refreshToken The credentials used to acquire new access tokens. */
    public fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun build(): CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
