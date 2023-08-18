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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.ecs.ContainerDependency
import software.amazon.awscdk.services.ecs.ContainerDependencyCondition

/**
 * The details of a dependency on another container in the task definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ContainerDefinition containerDefinition;
 * ContainerDependency containerDependency = ContainerDependency.builder()
 * .container(containerDefinition)
 * // the properties below are optional
 * .condition(ContainerDependencyCondition.START)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDependency.html)
 */
@CdkDslMarker
public class ContainerDependencyDsl {
    private val cdkBuilder: ContainerDependency.Builder = ContainerDependency.builder()

    /**
     * @param condition The state the container needs to be in to satisfy the dependency and proceed
     *   with startup. Valid values are ContainerDependencyCondition.START,
     *   ContainerDependencyCondition.COMPLETE, ContainerDependencyCondition.SUCCESS and
     *   ContainerDependencyCondition.HEALTHY.
     */
    public fun condition(condition: ContainerDependencyCondition) {
        cdkBuilder.condition(condition)
    }

    /** @param container The container to depend on. */
    public fun container(container: ContainerDefinition) {
        cdkBuilder.container(container)
    }

    public fun build(): ContainerDependency = cdkBuilder.build()
}
