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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensDataExportPropertyDsl {
    private val cdkBuilder: CfnStorageLens.DataExportProperty.Builder =
        CfnStorageLens.DataExportProperty.builder()

    public fun cloudWatchMetrics(cloudWatchMetrics: IResolvable) {
        cdkBuilder.cloudWatchMetrics(cloudWatchMetrics)
    }

    public fun cloudWatchMetrics(cloudWatchMetrics: CfnStorageLens.CloudWatchMetricsProperty) {
        cdkBuilder.cloudWatchMetrics(cloudWatchMetrics)
    }

    public fun s3BucketDestination(s3BucketDestination: IResolvable) {
        cdkBuilder.s3BucketDestination(s3BucketDestination)
    }

    public fun s3BucketDestination(s3BucketDestination: CfnStorageLens.S3BucketDestinationProperty) {
        cdkBuilder.s3BucketDestination(s3BucketDestination)
    }

    public fun build(): CfnStorageLens.DataExportProperty = cdkBuilder.build()
}
