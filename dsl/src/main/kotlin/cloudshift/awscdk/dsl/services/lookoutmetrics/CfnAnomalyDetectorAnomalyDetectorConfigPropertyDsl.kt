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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import kotlin.String

@CdkDslMarker
public class CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder =
        CfnAnomalyDetector.AnomalyDetectorConfigProperty.builder()

    public fun anomalyDetectorFrequency(anomalyDetectorFrequency: String) {
        cdkBuilder.anomalyDetectorFrequency(anomalyDetectorFrequency)
    }

    public fun build(): CfnAnomalyDetector.AnomalyDetectorConfigProperty = cdkBuilder.build()
}
