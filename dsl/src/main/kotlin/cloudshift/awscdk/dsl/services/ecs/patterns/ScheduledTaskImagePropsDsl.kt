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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * ContainerImage containerImage;
 * LogDriver logDriver;
 * Secret secret;
 * ScheduledTaskImageProps scheduledTaskImageProps = ScheduledTaskImageProps.builder()
 * .image(containerImage)
 * // the properties below are optional
 * .command(List.of("command"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .logDriver(logDriver)
 * .secrets(Map.of(
 * "secretsKey", secret))
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledTaskImagePropsDsl {
    private val cdkBuilder: ScheduledTaskImageProps.Builder = ScheduledTaskImageProps.builder()

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

    /** @param secrets The secret to expose to the container as an environment variable. */
    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    public fun build(): ScheduledTaskImageProps {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        return cdkBuilder.build()
    }
}
