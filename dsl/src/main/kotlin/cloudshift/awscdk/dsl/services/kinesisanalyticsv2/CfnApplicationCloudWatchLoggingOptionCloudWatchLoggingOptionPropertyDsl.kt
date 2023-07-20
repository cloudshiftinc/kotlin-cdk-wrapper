@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption

@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl {
  private val cdkBuilder:
      CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.Builder =
      CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.builder()

  public fun logStreamArn(logStreamArn: String) {
    cdkBuilder.logStreamArn(logStreamArn)
  }

  public fun build(): CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty =
      cdkBuilder.build()
}
