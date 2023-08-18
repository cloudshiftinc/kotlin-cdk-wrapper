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
 * The OAuth 2.0 credentials required for OAuth 2.0 authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * OAuth2CredentialsProperty oAuth2CredentialsProperty = OAuth2CredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .oAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileOAuth2CredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.OAuth2CredentialsProperty.Builder =
        CfnConnectorProfile.OAuth2CredentialsProperty.builder()

    /** @param accessToken The access token used to access the connector on your behalf. */
    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    /** @param clientId The identifier for the desired client. */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret used by the OAuth client to authenticate to the
     *   authorization server.
     */
    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    /** @param oAuthRequest the value to be set. */
    public fun oAuthRequest(oAuthRequest: IResolvable) {
        cdkBuilder.oAuthRequest(oAuthRequest)
    }

    /** @param oAuthRequest the value to be set. */
    public fun oAuthRequest(oAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty) {
        cdkBuilder.oAuthRequest(oAuthRequest)
    }

    /** @param refreshToken The refresh token used to refresh an expired access token. */
    public fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun build(): CfnConnectorProfile.OAuth2CredentialsProperty = cdkBuilder.build()
}
