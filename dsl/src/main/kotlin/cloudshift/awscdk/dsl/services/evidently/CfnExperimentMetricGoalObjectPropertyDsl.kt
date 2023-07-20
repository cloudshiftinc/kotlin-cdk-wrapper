@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.evidently.CfnExperiment
import kotlin.String

@CdkDslMarker
public class CfnExperimentMetricGoalObjectPropertyDsl {
    private val cdkBuilder: CfnExperiment.MetricGoalObjectProperty.Builder =
        CfnExperiment.MetricGoalObjectProperty.builder()

    public fun desiredChange(desiredChange: String) {
        cdkBuilder.desiredChange(desiredChange)
    }

    public fun entityIdKey(entityIdKey: String) {
        cdkBuilder.entityIdKey(entityIdKey)
    }

    public fun eventPattern(eventPattern: String) {
        cdkBuilder.eventPattern(eventPattern)
    }

    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    public fun unitLabel(unitLabel: String) {
        cdkBuilder.unitLabel(unitLabel)
    }

    public fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
    }

    public fun build(): CfnExperiment.MetricGoalObjectProperty = cdkBuilder.build()
}
