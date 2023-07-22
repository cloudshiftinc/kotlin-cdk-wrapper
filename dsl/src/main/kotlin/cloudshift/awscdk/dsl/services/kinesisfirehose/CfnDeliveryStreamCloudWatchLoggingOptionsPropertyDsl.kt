@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamCloudWatchLoggingOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder =
      CfnDeliveryStream.CloudWatchLoggingOptionsProperty.builder()

  /**
   * @param enabled Indicates whether CloudWatch Logs logging is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether CloudWatch Logs logging is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param logGroupName The name of the CloudWatch Logs log group that contains the log stream that
   * Kinesis Data Firehose will use.
   * Conditional. If you enable logging, you must specify this property.
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * @param logStreamName The name of the CloudWatch Logs log stream that Kinesis Data Firehose uses
   * to send logs about data delivery.
   * Conditional. If you enable logging, you must specify this property.
   */
  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  public fun build(): CfnDeliveryStream.CloudWatchLoggingOptionsProperty = cdkBuilder.build()
}
