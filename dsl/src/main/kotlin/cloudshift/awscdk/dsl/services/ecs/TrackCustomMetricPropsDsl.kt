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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.ecs.TrackCustomMetricProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class TrackCustomMetricPropsDsl {
    private val cdkBuilder: TrackCustomMetricProps.Builder = TrackCustomMetricProps.builder()

    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public fun metric(metric: IMetric) {
        cdkBuilder.metric(metric)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun scaleInCooldown(scaleInCooldown: Duration) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): TrackCustomMetricProps = cdkBuilder.build()
}
