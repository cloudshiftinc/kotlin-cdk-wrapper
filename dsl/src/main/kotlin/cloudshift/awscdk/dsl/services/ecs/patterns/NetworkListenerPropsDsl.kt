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

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class NetworkListenerPropsDsl {
    private val cdkBuilder: NetworkListenerProps.Builder = NetworkListenerProps.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): NetworkListenerProps = cdkBuilder.build()
}
