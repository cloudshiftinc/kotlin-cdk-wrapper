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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile credentials required when using SAPOData.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SAPODataConnectorProfileCredentialsProperty sAPODataConnectorProfileCredentialsProperty =
 * SAPODataConnectorProfileCredentialsProperty.builder()
 * .basicAuthCredentials(BasicAuthCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .oAuthCredentials(OAuthCredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileSAPODataConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder:
        CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.builder()

    /** @param basicAuthCredentials The SAPOData basic authentication credentials. */
    public fun basicAuthCredentials(basicAuthCredentials: IResolvable) {
        cdkBuilder.basicAuthCredentials(basicAuthCredentials)
    }

    /** @param basicAuthCredentials The SAPOData basic authentication credentials. */
    public fun basicAuthCredentials(
        basicAuthCredentials: CfnConnectorProfile.BasicAuthCredentialsProperty
    ) {
        cdkBuilder.basicAuthCredentials(basicAuthCredentials)
    }

    /** @param oAuthCredentials The SAPOData OAuth type authentication credentials. */
    public fun oAuthCredentials(oAuthCredentials: IResolvable) {
        cdkBuilder.oAuthCredentials(oAuthCredentials)
    }

    /** @param oAuthCredentials The SAPOData OAuth type authentication credentials. */
    public fun oAuthCredentials(oAuthCredentials: CfnConnectorProfile.OAuthCredentialsProperty) {
        cdkBuilder.oAuthCredentials(oAuthCredentials)
    }

    public fun build(): CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
