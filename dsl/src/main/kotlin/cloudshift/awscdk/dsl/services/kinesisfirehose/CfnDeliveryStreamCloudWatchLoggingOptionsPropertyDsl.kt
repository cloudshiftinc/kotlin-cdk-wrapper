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

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  public fun build(): CfnDeliveryStream.CloudWatchLoggingOptionsProperty = cdkBuilder.build()
}
