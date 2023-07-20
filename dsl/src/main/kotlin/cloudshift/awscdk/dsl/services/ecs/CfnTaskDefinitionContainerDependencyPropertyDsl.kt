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
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionContainerDependencyPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.ContainerDependencyProperty.Builder =
        CfnTaskDefinition.ContainerDependencyProperty.builder()

    public fun condition(condition: String) {
        cdkBuilder.condition(condition)
    }

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun build(): CfnTaskDefinition.ContainerDependencyProperty = cdkBuilder.build()
}
