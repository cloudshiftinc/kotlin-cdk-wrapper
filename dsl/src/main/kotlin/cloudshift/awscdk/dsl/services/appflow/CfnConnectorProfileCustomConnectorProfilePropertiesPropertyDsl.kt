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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The profile properties required by the custom connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * CustomConnectorProfilePropertiesProperty customConnectorProfilePropertiesProperty =
 * CustomConnectorProfilePropertiesProperty.builder()
 * .oAuth2Properties(OAuth2PropertiesProperty.builder()
 * .oAuth2GrantType("oAuth2GrantType")
 * .tokenUrl("tokenUrl")
 * .tokenUrlCustomProperties(Map.of(
 * "tokenUrlCustomPropertiesKey", "tokenUrlCustomProperties"))
 * .build())
 * .profileProperties(Map.of(
 * "profilePropertiesKey", "profileProperties"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileCustomConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.builder()

    /** @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication. */
    public fun oAuth2Properties(oAuth2Properties: IResolvable) {
        cdkBuilder.oAuth2Properties(oAuth2Properties)
    }

    /** @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication. */
    public fun oAuth2Properties(oAuth2Properties: CfnConnectorProfile.OAuth2PropertiesProperty) {
        cdkBuilder.oAuth2Properties(oAuth2Properties)
    }

    /**
     * @param profileProperties A map of properties that are required to create a profile for the
     *   custom connector.
     */
    public fun profileProperties(profileProperties: Map<String, String>) {
        cdkBuilder.profileProperties(profileProperties)
    }

    /**
     * @param profileProperties A map of properties that are required to create a profile for the
     *   custom connector.
     */
    public fun profileProperties(profileProperties: IResolvable) {
        cdkBuilder.profileProperties(profileProperties)
    }

    public fun build(): CfnConnectorProfile.CustomConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
