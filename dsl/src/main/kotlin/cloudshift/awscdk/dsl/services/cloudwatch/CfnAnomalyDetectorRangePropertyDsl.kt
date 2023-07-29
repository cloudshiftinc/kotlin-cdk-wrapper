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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

/**
 * Each `Range` specifies one range of days or times to exclude from use for training or updating an
 * anomaly detection model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * RangeProperty rangeProperty = RangeProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-range.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorRangePropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.RangeProperty.Builder =
        CfnAnomalyDetector.RangeProperty.builder()

    /**
     * @param endTime The end time of the range to exclude. The format is `yyyy-MM-dd'T'HH:mm:ss` .
     *   For example, `2019-07-01T23:59:59` .
     */
    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    /**
     * @param startTime The start time of the range to exclude. The format is
     *   `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
     */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnAnomalyDetector.RangeProperty = cdkBuilder.build()
}
