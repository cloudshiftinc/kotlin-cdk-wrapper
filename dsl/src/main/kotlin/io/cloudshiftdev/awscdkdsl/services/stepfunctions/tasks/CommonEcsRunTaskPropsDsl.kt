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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern
import software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride

/**
 * Basic properties for ECS Tasks.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.stepfunctions.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * Cluster cluster;
 * ContainerDefinition containerDefinition;
 * TaskDefinition taskDefinition;
 * CommonEcsRunTaskProps commonEcsRunTaskProps = CommonEcsRunTaskProps.builder()
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * // the properties below are optional
 * .containerOverrides(List.of(ContainerOverride.builder()
 * .containerDefinition(containerDefinition)
 * // the properties below are optional
 * .command(List.of("command"))
 * .cpu(123)
 * .environment(List.of(TaskEnvironmentVariable.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .memoryLimit(123)
 * .memoryReservation(123)
 * .build()))
 * .integrationPattern(ServiceIntegrationPattern.FIRE_AND_FORGET)
 * .build();
 * ```
 */
@CdkDslMarker
public class CommonEcsRunTaskPropsDsl {
    private val cdkBuilder: CommonEcsRunTaskProps.Builder = CommonEcsRunTaskProps.builder()

    private val _containerOverrides: MutableList<ContainerOverride> = mutableListOf()

    /** @param cluster The topic to run the task on. */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param containerOverrides Container setting overrides. Key is the name of the container to
     *   override, value is the values you want to override.
     */
    public fun containerOverrides(containerOverrides: ContainerOverrideDsl.() -> Unit) {
        _containerOverrides.add(ContainerOverrideDsl().apply(containerOverrides).build())
    }

    /**
     * @param containerOverrides Container setting overrides. Key is the name of the container to
     *   override, value is the values you want to override.
     */
    public fun containerOverrides(containerOverrides: Collection<ContainerOverride>) {
        _containerOverrides.addAll(containerOverrides)
    }

    /**
     * @param integrationPattern The service integration pattern indicates different ways to call
     *   RunTask in ECS. The valid value for Lambda is FIRE_AND_FORGET, SYNC and
     *   WAIT_FOR_TASK_TOKEN.
     */
    public fun integrationPattern(integrationPattern: ServiceIntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /**
     * @param taskDefinition Task Definition used for running tasks in the service. Note: this must
     *   be TaskDefinition, and not ITaskDefinition, as it requires properties that are not known
     *   for imported task definitions If you want to run a RunTask with an imported task
     *   definition, consider using CustomState
     */
    public fun taskDefinition(taskDefinition: TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): CommonEcsRunTaskProps {
        if (_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
        return cdkBuilder.build()
    }
}
