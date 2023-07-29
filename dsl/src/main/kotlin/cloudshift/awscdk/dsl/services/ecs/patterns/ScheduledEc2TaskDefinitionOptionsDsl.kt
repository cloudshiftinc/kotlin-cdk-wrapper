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

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions

/**
 * The properties for the ScheduledEc2Task using a task definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * Ec2TaskDefinition ec2TaskDefinition;
 * ScheduledEc2TaskDefinitionOptions scheduledEc2TaskDefinitionOptions =
 * ScheduledEc2TaskDefinitionOptions.builder()
 * .taskDefinition(ec2TaskDefinition)
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledEc2TaskDefinitionOptionsDsl {
    private val cdkBuilder: ScheduledEc2TaskDefinitionOptions.Builder =
        ScheduledEc2TaskDefinitionOptions.builder()

    /**
     * @param taskDefinition The task definition to use for tasks in the service. One of image or
     *   taskDefinition must be specified. [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): ScheduledEc2TaskDefinitionOptions = cdkBuilder.build()
}
