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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAnomalyDetectorMetricDataQueryPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.MetricDataQueryProperty.Builder =
        CfnAnomalyDetector.MetricDataQueryProperty.builder()

    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

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

    public fun metricStat(metricStat: CfnAnomalyDetector.MetricStatProperty) {
        cdkBuilder.metricStat(metricStat)
    }

    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    public fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
    }

    public fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData)
    }

    public fun build(): CfnAnomalyDetector.MetricDataQueryProperty = cdkBuilder.build()
}
