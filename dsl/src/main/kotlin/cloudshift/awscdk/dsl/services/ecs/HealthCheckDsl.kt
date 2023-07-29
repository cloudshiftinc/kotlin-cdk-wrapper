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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.HealthCheck

/**
 * The health check command and associated configuration parameters for the container.
 *
 * Example:
 * ```
 * Vpc vpc;
 * SecurityGroup securityGroup;
 * QueueProcessingFargateService queueProcessingFargateService =
 * QueueProcessingFargateService.Builder.create(this, "Service")
 * .vpc(vpc)
 * .memoryLimitMiB(512)
 * .image(ContainerImage.fromRegistry("test"))
 * .healthCheck(HealthCheck.builder()
 * .command(List.of("CMD-SHELL", "curl -f http://localhost/ || exit 1"))
 * // the properties below are optional
 * .interval(Duration.minutes(30))
 * .retries(123)
 * .startPeriod(Duration.minutes(30))
 * .timeout(Duration.minutes(30))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class HealthCheckDsl {
    private val cdkBuilder: HealthCheck.Builder = HealthCheck.builder()

    private val _command: MutableList<String> = mutableListOf()

    /**
     * @param command A string array representing the command that the container runs to determine
     *   if it is healthy. The string array must start with CMD to execute the command arguments
     *   directly, or CMD-SHELL to run the command with the container's default shell.
     *
     * For example: [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command A string array representing the command that the container runs to determine
     *   if it is healthy. The string array must start with CMD to execute the command arguments
     *   directly, or CMD-SHELL to run the command with the container's default shell.
     *
     * For example: [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param interval The time period in seconds between each health check execution. You may
     *   specify between 5 and 300 seconds.
     */
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param retries The number of times to retry a failed health check before the container is
     *   considered unhealthy. You may specify between 1 and 10 retries.
     */
    public fun retries(retries: Number) {
        cdkBuilder.retries(retries)
    }

    /**
     * @param startPeriod The optional grace period within which to provide containers time to
     *   bootstrap before failed health checks count towards the maximum number of retries. You may
     *   specify between 0 and 300 seconds.
     */
    public fun startPeriod(startPeriod: Duration) {
        cdkBuilder.startPeriod(startPeriod)
    }

    /**
     * @param timeout The time period in seconds to wait for a health check to succeed before it is
     *   considered a failure. You may specify between 2 and 60 seconds.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): HealthCheck {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        return cdkBuilder.build()
    }
}
