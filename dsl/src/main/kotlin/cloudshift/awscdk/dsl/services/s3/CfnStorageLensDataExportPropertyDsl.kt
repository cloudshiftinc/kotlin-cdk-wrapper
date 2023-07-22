@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensDataExportPropertyDsl {
  private val cdkBuilder: CfnStorageLens.DataExportProperty.Builder =
      CfnStorageLens.DataExportProperty.builder()

  /**
   * @param cloudWatchMetrics This property enables the Amazon CloudWatch publishing option for S3
   * Storage Lens metrics.
   */
  public fun cloudWatchMetrics(cloudWatchMetrics: IResolvable) {
    cdkBuilder.cloudWatchMetrics(cloudWatchMetrics)
  }

  /**
   * @param cloudWatchMetrics This property enables the Amazon CloudWatch publishing option for S3
   * Storage Lens metrics.
   */
  public fun cloudWatchMetrics(cloudWatchMetrics: CfnStorageLens.CloudWatchMetricsProperty) {
    cdkBuilder.cloudWatchMetrics(cloudWatchMetrics)
  }

  /**
   * @param s3BucketDestination This property contains the details of the bucket where the S3
   * Storage Lens metrics export will be placed.
   */
  public fun s3BucketDestination(s3BucketDestination: IResolvable) {
    cdkBuilder.s3BucketDestination(s3BucketDestination)
  }

  /**
   * @param s3BucketDestination This property contains the details of the bucket where the S3
   * Storage Lens metrics export will be placed.
   */
  public fun s3BucketDestination(s3BucketDestination: CfnStorageLens.S3BucketDestinationProperty) {
    cdkBuilder.s3BucketDestination(s3BucketDestination)
  }

  public fun build(): CfnStorageLens.DataExportProperty = cdkBuilder.build()
}
