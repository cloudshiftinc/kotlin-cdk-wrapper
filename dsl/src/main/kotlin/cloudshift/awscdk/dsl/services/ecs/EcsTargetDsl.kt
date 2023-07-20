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
import software.amazon.awscdk.services.ecs.EcsTarget
import software.amazon.awscdk.services.ecs.ListenerConfig
import software.amazon.awscdk.services.ecs.Protocol
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class EcsTargetDsl {
    private val cdkBuilder: EcsTarget.Builder = EcsTarget.builder()

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun listener(listener: ListenerConfig) {
        cdkBuilder.listener(listener)
    }

    public fun newTargetGroupId(newTargetGroupId: String) {
        cdkBuilder.newTargetGroupId(newTargetGroupId)
    }

    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): EcsTarget = cdkBuilder.build()
}
