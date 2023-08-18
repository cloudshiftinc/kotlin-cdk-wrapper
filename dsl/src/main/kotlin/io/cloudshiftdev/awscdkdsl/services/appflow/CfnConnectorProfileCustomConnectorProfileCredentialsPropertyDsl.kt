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
 * The connector-specific profile credentials that are required when using the custom connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * CustomConnectorProfileCredentialsProperty customConnectorProfileCredentialsProperty =
 * CustomConnectorProfileCredentialsProperty.builder()
 * .authenticationType("authenticationType")
 * // the properties below are optional
 * .apiKey(ApiKeyCredentialsProperty.builder()
 * .apiKey("apiKey")
 * // the properties below are optional
 * .apiSecretKey("apiSecretKey")
 * .build())
 * .basic(BasicAuthCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .custom(CustomAuthCredentialsProperty.builder()
 * .customAuthenticationType("customAuthenticationType")
 * // the properties below are optional
 * .credentialsMap(Map.of(
 * "credentialsMapKey", "credentialsMap"))
 * .build())
 * .oauth2(OAuth2CredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .oAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileCustomConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.CustomConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.CustomConnectorProfileCredentialsProperty.builder()

    /** @param apiKey The API keys required for the authentication of the user. */
    public fun apiKey(apiKey: IResolvable) {
        cdkBuilder.apiKey(apiKey)
    }

    /** @param apiKey The API keys required for the authentication of the user. */
    public fun apiKey(apiKey: CfnConnectorProfile.ApiKeyCredentialsProperty) {
        cdkBuilder.apiKey(apiKey)
    }

    /**
     * @param authenticationType The authentication type that the custom connector uses for
     *   authenticating while creating a connector profile.
     */
    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    /** @param basic The basic credentials that are required for the authentication of the user. */
    public fun basic(basic: IResolvable) {
        cdkBuilder.basic(basic)
    }

    /** @param basic The basic credentials that are required for the authentication of the user. */
    public fun basic(basic: CfnConnectorProfile.BasicAuthCredentialsProperty) {
        cdkBuilder.basic(basic)
    }

    /**
     * @param custom If the connector uses the custom authentication mechanism, this holds the
     *   required credentials.
     */
    public fun custom(custom: IResolvable) {
        cdkBuilder.custom(custom)
    }

    /**
     * @param custom If the connector uses the custom authentication mechanism, this holds the
     *   required credentials.
     */
    public fun custom(custom: CfnConnectorProfile.CustomAuthCredentialsProperty) {
        cdkBuilder.custom(custom)
    }

    /** @param oauth2 The OAuth 2.0 credentials required for the authentication of the user. */
    public fun oauth2(oauth2: IResolvable) {
        cdkBuilder.oauth2(oauth2)
    }

    /** @param oauth2 The OAuth 2.0 credentials required for the authentication of the user. */
    public fun oauth2(oauth2: CfnConnectorProfile.OAuth2CredentialsProperty) {
        cdkBuilder.oauth2(oauth2)
    }

    public fun build(): CfnConnectorProfile.CustomConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
