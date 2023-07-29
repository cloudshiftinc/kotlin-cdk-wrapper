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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnLaunch

/**
 * This structure defines a metric that you want to use to evaluate the variations during a launch
 * or experiment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * MetricDefinitionObjectProperty metricDefinitionObjectProperty =
 * MetricDefinitionObjectProperty.builder()
 * .entityIdKey("entityIdKey")
 * .metricName("metricName")
 * .valueKey("valueKey")
 * // the properties below are optional
 * .eventPattern("eventPattern")
 * .unitLabel("unitLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html)
 */
@CdkDslMarker
public class CfnLaunchMetricDefinitionObjectPropertyDsl {
    private val cdkBuilder: CfnLaunch.MetricDefinitionObjectProperty.Builder =
        CfnLaunch.MetricDefinitionObjectProperty.builder()

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

    /** @param valueKey The value that is tracked to produce the metric. */
    public fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
    }

    public fun build(): CfnLaunch.MetricDefinitionObjectProperty = cdkBuilder.build()
}
