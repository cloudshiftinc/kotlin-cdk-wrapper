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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorMetricSourcePropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.MetricSourceProperty.Builder =
        CfnAnomalyDetector.MetricSourceProperty.builder()

    public fun appFlowConfig(appFlowConfig: IResolvable) {
        cdkBuilder.appFlowConfig(appFlowConfig)
    }

    public fun appFlowConfig(appFlowConfig: CfnAnomalyDetector.AppFlowConfigProperty) {
        cdkBuilder.appFlowConfig(appFlowConfig)
    }

    public fun cloudwatchConfig(cloudwatchConfig: IResolvable) {
        cdkBuilder.cloudwatchConfig(cloudwatchConfig)
    }

    public fun cloudwatchConfig(cloudwatchConfig: CfnAnomalyDetector.CloudwatchConfigProperty) {
        cdkBuilder.cloudwatchConfig(cloudwatchConfig)
    }

    public fun rdsSourceConfig(rdsSourceConfig: IResolvable) {
        cdkBuilder.rdsSourceConfig(rdsSourceConfig)
    }

    public fun rdsSourceConfig(rdsSourceConfig: CfnAnomalyDetector.RDSSourceConfigProperty) {
        cdkBuilder.rdsSourceConfig(rdsSourceConfig)
    }

    public fun redshiftSourceConfig(redshiftSourceConfig: IResolvable) {
        cdkBuilder.redshiftSourceConfig(redshiftSourceConfig)
    }

    public fun redshiftSourceConfig(redshiftSourceConfig: CfnAnomalyDetector.RedshiftSourceConfigProperty) {
        cdkBuilder.redshiftSourceConfig(redshiftSourceConfig)
    }

    public fun s3SourceConfig(s3SourceConfig: IResolvable) {
        cdkBuilder.s3SourceConfig(s3SourceConfig)
    }

    public fun s3SourceConfig(s3SourceConfig: CfnAnomalyDetector.S3SourceConfigProperty) {
        cdkBuilder.s3SourceConfig(s3SourceConfig)
    }

    public fun build(): CfnAnomalyDetector.MetricSourceProperty = cdkBuilder.build()
}
