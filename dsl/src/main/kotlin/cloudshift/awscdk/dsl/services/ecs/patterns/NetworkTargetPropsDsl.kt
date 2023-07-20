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
import software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class NetworkTargetPropsDsl {
    private val cdkBuilder: NetworkTargetProps.Builder = NetworkTargetProps.builder()

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun listener(listener: String) {
        cdkBuilder.listener(listener)
    }

    public fun build(): NetworkTargetProps = cdkBuilder.build()
}
