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
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.ecs.ContainerDependency
import software.amazon.awscdk.services.ecs.ContainerDependencyCondition

@CdkDslMarker
public class ContainerDependencyDsl {
    private val cdkBuilder: ContainerDependency.Builder = ContainerDependency.builder()

    public fun condition(condition: ContainerDependencyCondition) {
        cdkBuilder.condition(condition)
    }

    public fun container(container: ContainerDefinition) {
        cdkBuilder.container(container)
    }

    public fun build(): ContainerDependency = cdkBuilder.build()
}
