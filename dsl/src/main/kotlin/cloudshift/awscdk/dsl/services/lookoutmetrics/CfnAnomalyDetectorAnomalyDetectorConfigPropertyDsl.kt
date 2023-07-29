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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Contains information about a detector's configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * AnomalyDetectorConfigProperty anomalyDetectorConfigProperty =
 * AnomalyDetectorConfigProperty.builder()
 * .anomalyDetectorFrequency("anomalyDetectorFrequency")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-anomalydetectorconfig.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder =
        CfnAnomalyDetector.AnomalyDetectorConfigProperty.builder()

    /**
     * @param anomalyDetectorFrequency The frequency at which the detector analyzes its source data.
     */
    public fun anomalyDetectorFrequency(anomalyDetectorFrequency: String) {
        cdkBuilder.anomalyDetectorFrequency(anomalyDetectorFrequency)
    }

    public fun build(): CfnAnomalyDetector.AnomalyDetectorConfigProperty = cdkBuilder.build()
}
