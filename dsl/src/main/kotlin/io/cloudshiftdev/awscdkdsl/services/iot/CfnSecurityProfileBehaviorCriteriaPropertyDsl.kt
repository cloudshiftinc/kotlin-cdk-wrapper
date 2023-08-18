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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile

/**
 * The criteria by which the behavior is determined to be normal.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * BehaviorCriteriaProperty behaviorCriteriaProperty = BehaviorCriteriaProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .consecutiveDatapointsToAlarm(123)
 * .consecutiveDatapointsToClear(123)
 * .durationSeconds(123)
 * .mlDetectionConfig(MachineLearningDetectionConfigProperty.builder()
 * .confidenceLevel("confidenceLevel")
 * .build())
 * .statisticalThreshold(StatisticalThresholdProperty.builder()
 * .statistic("statistic")
 * .build())
 * .value(MetricValueProperty.builder()
 * .cidrs(List.of("cidrs"))
 * .count("count")
 * .number(123)
 * .numbers(List.of(123))
 * .ports(List.of(123))
 * .strings(List.of("strings"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html)
 */
@CdkDslMarker
public class CfnSecurityProfileBehaviorCriteriaPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.BehaviorCriteriaProperty.Builder =
        CfnSecurityProfile.BehaviorCriteriaProperty.builder()

    /**
     * @param comparisonOperator The operator that relates the thing measured ( `metric` ) to the
     *   criteria (containing a `value` or `statisticalThreshold` ). Valid operators include:
     * * `string-list` : `in-set` and `not-in-set`
     * * `number-list` : `in-set` and `not-in-set`
     * * `ip-address-list` : `in-cidr-set` and `not-in-cidr-set`
     * * `number` : `less-than` , `less-than-equals` , `greater-than` , and `greater-than-equals`
     */
    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * @param consecutiveDatapointsToAlarm If a device is in violation of the behavior for the
     *   specified number of consecutive datapoints, an alarm occurs. If not specified, the default
     *   is 1.
     */
    public fun consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm: Number) {
        cdkBuilder.consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm)
    }

    /**
     * @param consecutiveDatapointsToClear If an alarm has occurred and the offending device is no
     *   longer in violation of the behavior for the specified number of consecutive datapoints, the
     *   alarm is cleared. If not specified, the default is 1.
     */
    public fun consecutiveDatapointsToClear(consecutiveDatapointsToClear: Number) {
        cdkBuilder.consecutiveDatapointsToClear(consecutiveDatapointsToClear)
    }

    /**
     * @param durationSeconds Use this to specify the time duration over which the behavior is
     *   evaluated, for those criteria that have a time dimension (for example, `NUM_MESSAGES_SENT`
     *   ). For a `statisticalThreshhold` metric comparison, measurements from all devices are
     *   accumulated over this time duration before being used to calculate percentiles, and later,
     *   measurements from an individual device are also accumulated over this time duration before
     *   being given a percentile rank. Cannot be used with list-based metric datatypes.
     */
    public fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
    }

    /** @param mlDetectionConfig The confidence level of the detection model. */
    public fun mlDetectionConfig(mlDetectionConfig: IResolvable) {
        cdkBuilder.mlDetectionConfig(mlDetectionConfig)
    }

    /** @param mlDetectionConfig The confidence level of the detection model. */
    public fun mlDetectionConfig(
        mlDetectionConfig: CfnSecurityProfile.MachineLearningDetectionConfigProperty
    ) {
        cdkBuilder.mlDetectionConfig(mlDetectionConfig)
    }

    /**
     * @param statisticalThreshold A statistical ranking (percentile)that indicates a threshold
     *   value by which a behavior is determined to be in compliance or in violation of the
     *   behavior.
     */
    public fun statisticalThreshold(statisticalThreshold: IResolvable) {
        cdkBuilder.statisticalThreshold(statisticalThreshold)
    }

    /**
     * @param statisticalThreshold A statistical ranking (percentile)that indicates a threshold
     *   value by which a behavior is determined to be in compliance or in violation of the
     *   behavior.
     */
    public fun statisticalThreshold(
        statisticalThreshold: CfnSecurityProfile.StatisticalThresholdProperty
    ) {
        cdkBuilder.statisticalThreshold(statisticalThreshold)
    }

    /** @param value The value to be compared with the `metric` . */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The value to be compared with the `metric` . */
    public fun `value`(`value`: CfnSecurityProfile.MetricValueProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSecurityProfile.BehaviorCriteriaProperty = cdkBuilder.build()
}
