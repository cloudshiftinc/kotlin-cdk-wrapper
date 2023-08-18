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

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable

/**
 * An environment variable to be set in the container run as a task.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.targets.*;
 * TaskEnvironmentVariable taskEnvironmentVariable = TaskEnvironmentVariable.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 */
@CdkDslMarker
public class TaskEnvironmentVariableDsl {
    private val cdkBuilder: TaskEnvironmentVariable.Builder = TaskEnvironmentVariable.builder()

    /**
     * @param name Name for the environment variable. Exactly one of `name` and `namePath` must be
     *   specified.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value Value of the environment variable. Exactly one of `value` and `valuePath` must
     *   be specified.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): TaskEnvironmentVariable = cdkBuilder.build()
}
