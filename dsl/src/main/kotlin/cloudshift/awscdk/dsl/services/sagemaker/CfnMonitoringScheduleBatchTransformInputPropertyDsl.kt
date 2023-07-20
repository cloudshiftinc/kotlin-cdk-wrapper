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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import kotlin.String

@CdkDslMarker
public class CfnMonitoringScheduleBatchTransformInputPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.BatchTransformInputProperty.Builder =
        CfnMonitoringSchedule.BatchTransformInputProperty.builder()

    public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
    }

    public fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat)
    }

    public fun datasetFormat(datasetFormat: CfnMonitoringSchedule.DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat)
    }

    public fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
    }

    public fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
    }

    public fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
    }

    public fun build(): CfnMonitoringSchedule.BatchTransformInputProperty = cdkBuilder.build()
}
