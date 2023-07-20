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

@CdkDslMarker
public class CfnConnectionAuthParametersPropertyDsl {
    private val cdkBuilder: CfnConnection.AuthParametersProperty.Builder =
        CfnConnection.AuthParametersProperty.builder()

    public fun apiKeyAuthParameters(apiKeyAuthParameters: IResolvable) {
        cdkBuilder.apiKeyAuthParameters(apiKeyAuthParameters)
    }

    public fun apiKeyAuthParameters(apiKeyAuthParameters: CfnConnection.ApiKeyAuthParametersProperty) {
        cdkBuilder.apiKeyAuthParameters(apiKeyAuthParameters)
    }

    public fun basicAuthParameters(basicAuthParameters: IResolvable) {
        cdkBuilder.basicAuthParameters(basicAuthParameters)
    }

    public fun basicAuthParameters(basicAuthParameters: CfnConnection.BasicAuthParametersProperty) {
        cdkBuilder.basicAuthParameters(basicAuthParameters)
    }

    public fun invocationHttpParameters(invocationHttpParameters: IResolvable) {
        cdkBuilder.invocationHttpParameters(invocationHttpParameters)
    }

    public fun invocationHttpParameters(invocationHttpParameters: CfnConnection.ConnectionHttpParametersProperty) {
        cdkBuilder.invocationHttpParameters(invocationHttpParameters)
    }

    public fun oAuthParameters(oAuthParameters: IResolvable) {
        cdkBuilder.oAuthParameters(oAuthParameters)
    }

    public fun oAuthParameters(oAuthParameters: CfnConnection.OAuthParametersProperty) {
        cdkBuilder.oAuthParameters(oAuthParameters)
    }

    public fun build(): CfnConnection.AuthParametersProperty = cdkBuilder.build()
}
