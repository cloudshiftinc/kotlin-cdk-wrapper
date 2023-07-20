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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnScalingPolicyMetricDataQueryPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.MetricDataQueryProperty.Builder =
        CfnScalingPolicy.MetricDataQueryProperty.builder()

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    public fun metricStat(metricStat: IResolvable) {
        cdkBuilder.metricStat(metricStat)
    }

    public fun metricStat(metricStat: CfnScalingPolicy.MetricStatProperty) {
        cdkBuilder.metricStat(metricStat)
    }

    public fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
    }

    public fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData)
    }

    public fun build(): CfnScalingPolicy.MetricDataQueryProperty = cdkBuilder.build()
}
