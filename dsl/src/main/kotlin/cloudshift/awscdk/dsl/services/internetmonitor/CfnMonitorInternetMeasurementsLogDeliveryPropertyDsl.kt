@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

@CdkDslMarker
public class CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl {
  private val cdkBuilder: CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder =
      CfnMonitor.InternetMeasurementsLogDeliveryProperty.builder()

  /**
   * @param s3Config The configuration information for publishing Amazon CloudWatch Internet Monitor
   * internet measurements to Amazon S3.
   * The configuration includes the bucket name and (optionally) bucket prefix for the S3 bucket to
   * store the measurements, and the delivery status. The delivery status is `ENABLED` if you choose to
   * deliver internet measurements to an S3 bucket, and `DISABLED` otherwise.
   */
  public fun s3Config(s3Config: IResolvable) {
    cdkBuilder.s3Config(s3Config)
  }

  /**
   * @param s3Config The configuration information for publishing Amazon CloudWatch Internet Monitor
   * internet measurements to Amazon S3.
   * The configuration includes the bucket name and (optionally) bucket prefix for the S3 bucket to
   * store the measurements, and the delivery status. The delivery status is `ENABLED` if you choose to
   * deliver internet measurements to an S3 bucket, and `DISABLED` otherwise.
   */
  public fun s3Config(s3Config: CfnMonitor.S3ConfigProperty) {
    cdkBuilder.s3Config(s3Config)
  }

  public fun build(): CfnMonitor.InternetMeasurementsLogDeliveryProperty = cdkBuilder.build()
}
