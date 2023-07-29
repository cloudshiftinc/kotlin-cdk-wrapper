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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.TcpTimeout

/**
 * Represents timeouts for TCP protocols.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.appmesh.*;
 * TcpTimeout tcpTimeout = TcpTimeout.builder()
 * .idle(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class TcpTimeoutDsl {
    private val cdkBuilder: TcpTimeout.Builder = TcpTimeout.builder()

    /** @param idle Represents an idle timeout. The amount of time that a connection may be idle. */
    public fun idle(idle: Duration) {
        cdkBuilder.idle(idle)
    }

    public fun build(): TcpTimeout = cdkBuilder.build()
}
