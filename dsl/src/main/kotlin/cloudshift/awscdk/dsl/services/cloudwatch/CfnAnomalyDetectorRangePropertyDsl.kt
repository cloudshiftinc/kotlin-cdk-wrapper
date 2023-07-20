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
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import kotlin.String

@CdkDslMarker
public class CfnAnomalyDetectorRangePropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.RangeProperty.Builder =
        CfnAnomalyDetector.RangeProperty.builder()

    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnAnomalyDetector.RangeProperty = cdkBuilder.build()
}
