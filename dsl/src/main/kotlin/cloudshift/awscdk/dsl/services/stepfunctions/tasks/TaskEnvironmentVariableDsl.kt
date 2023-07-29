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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable

/**
 * An environment variable to be set in the container run as a task.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
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
     * @param name Name for the environment variable. Use `JsonPath` class's static methods to
     *   specify name from a JSON path.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value Value of the environment variable. Use `JsonPath` class's static methods to
     *   specify value from a JSON path.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): TaskEnvironmentVariable = cdkBuilder.build()
}
