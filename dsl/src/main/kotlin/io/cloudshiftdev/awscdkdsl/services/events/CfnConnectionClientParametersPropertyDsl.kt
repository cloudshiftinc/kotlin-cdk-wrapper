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
 * Contains the OAuth authorization parameters to use for the connection.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * ClientParametersProperty clientParametersProperty = ClientParametersProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-clientparameters.html)
 */
@CdkDslMarker
public class CfnConnectionClientParametersPropertyDsl {
    private val cdkBuilder: CfnConnection.ClientParametersProperty.Builder =
        CfnConnection.ClientParametersProperty.builder()

    /** @param clientId The client ID to use for OAuth authorization. */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret assciated with the client ID to use for OAuth
     *   authorization.
     */
    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    public fun build(): CfnConnection.ClientParametersProperty = cdkBuilder.build()
}
