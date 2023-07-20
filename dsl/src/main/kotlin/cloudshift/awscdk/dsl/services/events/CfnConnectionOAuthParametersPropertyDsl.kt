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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection
import kotlin.String

@CdkDslMarker
public class CfnConnectionOAuthParametersPropertyDsl {
    private val cdkBuilder: CfnConnection.OAuthParametersProperty.Builder =
        CfnConnection.OAuthParametersProperty.builder()

    public fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    public fun clientParameters(clientParameters: IResolvable) {
        cdkBuilder.clientParameters(clientParameters)
    }

    public fun clientParameters(clientParameters: CfnConnection.ClientParametersProperty) {
        cdkBuilder.clientParameters(clientParameters)
    }

    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    public fun oAuthHttpParameters(oAuthHttpParameters: IResolvable) {
        cdkBuilder.oAuthHttpParameters(oAuthHttpParameters)
    }

    public fun oAuthHttpParameters(oAuthHttpParameters: CfnConnection.ConnectionHttpParametersProperty) {
        cdkBuilder.oAuthHttpParameters(oAuthHttpParameters)
    }

    public fun build(): CfnConnection.OAuthParametersProperty = cdkBuilder.build()
}
