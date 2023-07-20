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
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionPortMappingPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.PortMappingProperty.Builder =
        CfnTaskDefinition.PortMappingProperty.builder()

    public fun appProtocol(appProtocol: String) {
        cdkBuilder.appProtocol(appProtocol)
    }

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun containerPortRange(containerPortRange: String) {
        cdkBuilder.containerPortRange(containerPortRange)
    }

    public fun hostPort(hostPort: Number) {
        cdkBuilder.hostPort(hostPort)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnTaskDefinition.PortMappingProperty = cdkBuilder.build()
}
