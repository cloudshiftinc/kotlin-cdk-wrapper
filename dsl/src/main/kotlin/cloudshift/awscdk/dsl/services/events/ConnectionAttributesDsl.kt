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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.ConnectionAttributes

/**
 * Interface with properties necessary to import a reusable Connection.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * ConnectionAttributes connectionAttributes = ConnectionAttributes.builder()
 * .connectionArn("connectionArn")
 * .connectionName("connectionName")
 * .connectionSecretArn("connectionSecretArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class ConnectionAttributesDsl {
    private val cdkBuilder: ConnectionAttributes.Builder = ConnectionAttributes.builder()

    /** @param connectionArn The ARN of the connection created. */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    /** @param connectionName The Name for the connection. */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    /** @param connectionSecretArn The ARN for the secret created for the connection. */
    public fun connectionSecretArn(connectionSecretArn: String) {
        cdkBuilder.connectionSecretArn(connectionSecretArn)
    }

    public fun build(): ConnectionAttributes = cdkBuilder.build()
}
