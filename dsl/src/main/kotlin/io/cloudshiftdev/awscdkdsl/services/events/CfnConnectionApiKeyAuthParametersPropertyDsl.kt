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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnConnection

/**
 * Contains the API key authorization parameters for the connection.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * ApiKeyAuthParametersProperty apiKeyAuthParametersProperty =
 * ApiKeyAuthParametersProperty.builder()
 * .apiKeyName("apiKeyName")
 * .apiKeyValue("apiKeyValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-apikeyauthparameters.html)
 */
@CdkDslMarker
public class CfnConnectionApiKeyAuthParametersPropertyDsl {
    private val cdkBuilder: CfnConnection.ApiKeyAuthParametersProperty.Builder =
        CfnConnection.ApiKeyAuthParametersProperty.builder()

    /** @param apiKeyName The name of the API key to use for authorization. */
    public fun apiKeyName(apiKeyName: String) {
        cdkBuilder.apiKeyName(apiKeyName)
    }

    /** @param apiKeyValue The value for the API key to use for authorization. */
    public fun apiKeyValue(apiKeyValue: String) {
        cdkBuilder.apiKeyValue(apiKeyValue)
    }

    public fun build(): CfnConnection.ApiKeyAuthParametersProperty = cdkBuilder.build()
}
