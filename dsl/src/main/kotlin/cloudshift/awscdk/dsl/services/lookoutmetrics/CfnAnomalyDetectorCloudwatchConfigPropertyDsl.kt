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
public class CfnAnomalyDetectorCloudwatchConfigPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.CloudwatchConfigProperty.Builder =
        CfnAnomalyDetector.CloudwatchConfigProperty.builder()

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnAnomalyDetector.CloudwatchConfigProperty = cdkBuilder.build()
}
