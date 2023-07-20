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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions
import software.amazon.awscdk.services.ecs.Protocol
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class LoadBalancerTargetOptionsDsl {
    private val cdkBuilder: LoadBalancerTargetOptions.Builder = LoadBalancerTargetOptions.builder()

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): LoadBalancerTargetOptions = cdkBuilder.build()
}
