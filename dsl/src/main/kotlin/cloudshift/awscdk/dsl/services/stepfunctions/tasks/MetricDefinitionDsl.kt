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
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition

/**
 * Specifies the metric name and regular expressions used to parse algorithm logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * MetricDefinition metricDefinition = MetricDefinition.builder()
 * .name("name")
 * .regex("regex")
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricDefinitionDsl {
    private val cdkBuilder: MetricDefinition.Builder = MetricDefinition.builder()

    /** @param name Name of the metric. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param regex Regular expression that searches the output of a training job and gets the value
     *   of the metric.
     */
    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    public fun build(): MetricDefinition = cdkBuilder.build()
}
