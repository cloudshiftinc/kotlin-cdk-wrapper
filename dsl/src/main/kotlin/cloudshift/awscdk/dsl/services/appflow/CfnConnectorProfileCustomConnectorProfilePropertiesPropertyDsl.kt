@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnConnectorProfileCustomConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.builder()

    public fun oAuth2Properties(oAuth2Properties: IResolvable) {
        cdkBuilder.oAuth2Properties(oAuth2Properties)
    }

    public fun oAuth2Properties(oAuth2Properties: CfnConnectorProfile.OAuth2PropertiesProperty) {
        cdkBuilder.oAuth2Properties(oAuth2Properties)
    }

    public fun profileProperties(profileProperties: Map<String, String>) {
        cdkBuilder.profileProperties(profileProperties)
    }

    public fun profileProperties(profileProperties: IResolvable) {
        cdkBuilder.profileProperties(profileProperties)
    }

    public fun build(): CfnConnectorProfile.CustomConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
