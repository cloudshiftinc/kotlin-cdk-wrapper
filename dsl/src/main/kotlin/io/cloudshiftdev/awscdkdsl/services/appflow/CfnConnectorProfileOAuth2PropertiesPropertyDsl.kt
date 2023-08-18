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
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The OAuth 2.0 properties required for OAuth 2.0 authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * OAuth2PropertiesProperty oAuth2PropertiesProperty = OAuth2PropertiesProperty.builder()
 * .oAuth2GrantType("oAuth2GrantType")
 * .tokenUrl("tokenUrl")
 * .tokenUrlCustomProperties(Map.of(
 * "tokenUrlCustomPropertiesKey", "tokenUrlCustomProperties"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2properties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileOAuth2PropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.OAuth2PropertiesProperty.Builder =
        CfnConnectorProfile.OAuth2PropertiesProperty.builder()

    /**
     * @param oAuth2GrantType The OAuth 2.0 grant type used by connector for OAuth 2.0
     *   authentication.
     */
    public fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
    }

    /** @param tokenUrl The token URL required for OAuth 2.0 authentication. */
    public fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
    }

    /**
     * @param tokenUrlCustomProperties Associates your token URL with a map of properties that you
     *   define. Use this parameter to provide any additional details that the connector requires to
     *   authenticate your request.
     */
    public fun tokenUrlCustomProperties(tokenUrlCustomProperties: Map<String, String>) {
        cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties)
    }

    /**
     * @param tokenUrlCustomProperties Associates your token URL with a map of properties that you
     *   define. Use this parameter to provide any additional details that the connector requires to
     *   authenticate your request.
     */
    public fun tokenUrlCustomProperties(tokenUrlCustomProperties: IResolvable) {
        cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties)
    }

    public fun build(): CfnConnectorProfile.OAuth2PropertiesProperty = cdkBuilder.build()
}
