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
public class CfnConnectorProfileOAuth2PropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.OAuth2PropertiesProperty.Builder =
        CfnConnectorProfile.OAuth2PropertiesProperty.builder()

    public fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
    }

    public fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
    }

    public fun tokenUrlCustomProperties(tokenUrlCustomProperties: Map<String, String>) {
        cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties)
    }

    public fun tokenUrlCustomProperties(tokenUrlCustomProperties: IResolvable) {
        cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties)
    }

    public fun build(): CfnConnectorProfile.OAuth2PropertiesProperty = cdkBuilder.build()
}
