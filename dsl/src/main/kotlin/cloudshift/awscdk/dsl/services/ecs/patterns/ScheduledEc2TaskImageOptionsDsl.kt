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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions

/**
 * The properties for the ScheduledEc2Task using an image.
 *
 * Example:
 * ```
 * // Instantiate an Amazon EC2 Task to run at a scheduled interval
 * Cluster cluster;
 * ScheduledEc2Task ecsScheduledTask = ScheduledEc2Task.Builder.create(this, "ScheduledTask")
 * .cluster(cluster)
 * .scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(256)
 * .environment(Map.of("name", "TRIGGER", "value", "CloudWatch Events"))
 * .build())
 * .schedule(Schedule.expression("rate(1 minute)"))
 * .enabled(true)
 * .ruleName("sample-scheduled-task-rule")
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledEc2TaskImageOptionsDsl {
    private val cdkBuilder: ScheduledEc2TaskImageOptions.Builder =
        ScheduledEc2TaskImageOptions.builder()

    private val _command: MutableList<String> = mutableListOf()

    /**
     * @param command The command that is passed to the container. If you provide a shell command as
     *   a single string, you have to quote command-line arguments.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command The command that is passed to the container. If you provide a shell command as
     *   a single string, you have to quote command-line arguments.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /** @param cpu The minimum number of CPU units to reserve for the container. */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /** @param environment The environment variables to pass to the container. */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param image The image used to start a container. Image or taskDefinition must be specified,
     *   but not both.
     */
    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    /** @param logDriver The log driver to use. */
    public fun logDriver(logDriver: LogDriver) {
        cdkBuilder.logDriver(logDriver)
    }

    /**
     * @param memoryLimitMiB The hard limit (in MiB) of memory to present to the container. If your
     *   container attempts to exceed the allocated memory, the container is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     *   When system memory is under contention, Docker attempts to keep the container memory within
     *   the limit. If the container requires more memory, it can consume up to the value specified
     *   by the Memory property or all of the available memory on the container instance—whichever
     *   comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number) {
        cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /** @param secrets The secret to expose to the container as an environment variable. */
    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    public fun build(): ScheduledEc2TaskImageOptions {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        return cdkBuilder.build()
    }
}
