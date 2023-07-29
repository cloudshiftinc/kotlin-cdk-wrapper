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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action that captures a CloudWatch metric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CloudwatchMetricActionProperty cloudwatchMetricActionProperty =
 * CloudwatchMetricActionProperty.builder()
 * .metricName("metricName")
 * .metricNamespace("metricNamespace")
 * .metricUnit("metricUnit")
 * .metricValue("metricValue")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .metricTimestamp("metricTimestamp")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleCloudwatchMetricActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.CloudwatchMetricActionProperty.Builder =
        CfnTopicRule.CloudwatchMetricActionProperty.builder()

    /** @param metricName The CloudWatch metric name. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param metricNamespace The CloudWatch metric namespace name. */
    public fun metricNamespace(metricNamespace: String) {
        cdkBuilder.metricNamespace(metricNamespace)
    }

    /**
     * @param metricTimestamp An optional
     *   [Unix timestamp](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp)
     *   .
     */
    public fun metricTimestamp(metricTimestamp: String) {
        cdkBuilder.metricTimestamp(metricTimestamp)
    }

    /**
     * @param metricUnit The
     *   [metric unit](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     *   supported by CloudWatch.
     */
    public fun metricUnit(metricUnit: String) {
        cdkBuilder.metricUnit(metricUnit)
    }

    /** @param metricValue The CloudWatch metric value. */
    public fun metricValue(metricValue: String) {
        cdkBuilder.metricValue(metricValue)
    }

    /** @param roleArn The IAM role that allows access to the CloudWatch metric. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.CloudwatchMetricActionProperty = cdkBuilder.build()
}
