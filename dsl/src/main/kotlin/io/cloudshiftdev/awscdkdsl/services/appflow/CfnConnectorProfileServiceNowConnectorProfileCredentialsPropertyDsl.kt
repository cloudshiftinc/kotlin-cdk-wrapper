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
 * The connector-specific profile credentials required when using ServiceNow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ServiceNowConnectorProfileCredentialsProperty serviceNowConnectorProfileCredentialsProperty =
 * ServiceNowConnectorProfileCredentialsProperty.builder()
 * .oAuth2Credentials(OAuth2CredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .oAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build())
 * .password("password")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileServiceNowConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder:
        CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.builder()

    /** @param oAuth2Credentials the value to be set. */
    public fun oAuth2Credentials(oAuth2Credentials: IResolvable) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials)
    }

    /** @param oAuth2Credentials the value to be set. */
    public fun oAuth2Credentials(oAuth2Credentials: CfnConnectorProfile.OAuth2CredentialsProperty) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials)
    }

    /** @param password The password that corresponds to the user name. */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /** @param username The name of the user. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
