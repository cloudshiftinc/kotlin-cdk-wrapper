@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

@CdkDslMarker
public class CfnMonitorS3ConfigPropertyDsl {
  private val cdkBuilder: CfnMonitor.S3ConfigProperty.Builder =
      CfnMonitor.S3ConfigProperty.builder()

  /**
   * @param bucketName The Amazon S3 bucket name for internet measurements publishing.
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix An optional Amazon S3 bucket prefix for internet measurements publishing.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param logDeliveryStatus The status of publishing Internet Monitor internet measurements to an
   * Amazon S3 bucket.
   * The delivery status is `ENABLED` if you choose to deliver internet measurements to an S3
   * bucket, and `DISABLED` otherwise.
   */
  public fun logDeliveryStatus(logDeliveryStatus: String) {
    cdkBuilder.logDeliveryStatus(logDeliveryStatus)
  }

  public fun build(): CfnMonitor.S3ConfigProperty = cdkBuilder.build()
}
