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

package io.cloudshiftdev.awscdkdsl.services.evidently

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnExperiment

/**
 * Use this structure to tell Evidently whether higher or lower values are desired for a metric that
 * is used in an experiment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * MetricGoalObjectProperty metricGoalObjectProperty = MetricGoalObjectProperty.builder()
 * .desiredChange("desiredChange")
 * .entityIdKey("entityIdKey")
 * .metricName("metricName")
 * .valueKey("valueKey")
 * // the properties below are optional
 * .eventPattern("eventPattern")
 * .unitLabel("unitLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html)
 */
@CdkDslMarker
public class CfnExperimentMetricGoalObjectPropertyDsl {
    private val cdkBuilder: CfnExperiment.MetricGoalObjectProperty.Builder =
        CfnExperiment.MetricGoalObjectProperty.builder()

    /**
     * @param desiredChange `INCREASE` means that a variation with a higher number for this metric
     *   is performing better. `DECREASE` means that a variation with a lower number for this metric
     *   is performing better.
     */
    public fun desiredChange(desiredChange: String) {
        cdkBuilder.desiredChange(desiredChange)
    }

    /**
     * @param entityIdKey The entity, such as a user or session, that does an action that causes a
     *   metric value to be recorded. An example is `userDetails.userID` .
     */
    public fun entityIdKey(entityIdKey: String) {
        cdkBuilder.entityIdKey(entityIdKey)
    }

    /**
     * @param eventPattern The EventBridge event pattern that defines how the metric is recorded.
     *   For more information about EventBridge event patterns, see
     *   [Amazon EventBridge event patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html)
     *   .
     */
    public fun eventPattern(eventPattern: String) {
        cdkBuilder.eventPattern(eventPattern)
    }

    /** @param metricName A name for the metric. It can include up to 255 characters. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param unitLabel A label for the units that the metric is measuring. */
    public fun unitLabel(unitLabel: String) {
        cdkBuilder.unitLabel(unitLabel)
    }

    /** @param valueKey The JSON path to reference the numerical metric value in the event. */
    public fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
    }

    public fun build(): CfnExperiment.MetricGoalObjectProperty = cdkBuilder.build()
}
