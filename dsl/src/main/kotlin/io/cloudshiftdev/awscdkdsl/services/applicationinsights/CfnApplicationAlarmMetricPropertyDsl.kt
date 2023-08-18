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

package io.cloudshiftdev.awscdkdsl.services.applicationinsights

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application AlarmMetric` property type defines a metric to monitor
 * for the component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * AlarmMetricProperty alarmMetricProperty = AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarmmetric.html)
 */
@CdkDslMarker
public class CfnApplicationAlarmMetricPropertyDsl {
    private val cdkBuilder: CfnApplication.AlarmMetricProperty.Builder =
        CfnApplication.AlarmMetricProperty.builder()

    /**
     * @param alarmMetricName The name of the metric to be monitored for the component. For metrics
     *   supported by Application Insights, see
     *   [Logs and metrics supported by Amazon CloudWatch Application Insights](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/appinsights-logs-and-metrics.html)
     *   .
     */
    public fun alarmMetricName(alarmMetricName: String) {
        cdkBuilder.alarmMetricName(alarmMetricName)
    }

    public fun build(): CfnApplication.AlarmMetricProperty = cdkBuilder.build()
}
