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

package io.cloudshiftdev.awscdkdsl.services.ecs.patterns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions

/**
 * The properties for the ScheduledFargateTask using a task definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * FargateTaskDefinition fargateTaskDefinition;
 * ScheduledFargateTaskDefinitionOptions scheduledFargateTaskDefinitionOptions =
 * ScheduledFargateTaskDefinitionOptions.builder()
 * .taskDefinition(fargateTaskDefinition)
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledFargateTaskDefinitionOptionsDsl {
    private val cdkBuilder: ScheduledFargateTaskDefinitionOptions.Builder =
        ScheduledFargateTaskDefinitionOptions.builder()

    /**
     * @param taskDefinition The task definition to use for tasks in the service. Image or
     *   taskDefinition must be specified, but not both. [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): ScheduledFargateTaskDefinitionOptions = cdkBuilder.build()
}
