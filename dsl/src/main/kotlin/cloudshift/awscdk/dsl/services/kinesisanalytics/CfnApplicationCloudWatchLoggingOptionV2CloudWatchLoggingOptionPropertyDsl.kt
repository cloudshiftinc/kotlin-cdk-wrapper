@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2

@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl {
  private val cdkBuilder:
      CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder =
      CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.builder()

  /**
   * @param logStreamArn The ARN of the CloudWatch log to receive application messages. 
   */
  public fun logStreamArn(logStreamArn: String) {
    cdkBuilder.logStreamArn(logStreamArn)
  }

  public fun build(): CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty =
      cdkBuilder.build()
}
