@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps

@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionPropsDsl {
  private val cdkBuilder: CfnApplicationCloudWatchLoggingOptionProps.Builder =
      CfnApplicationCloudWatchLoggingOptionProps.builder()

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
    cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
  }

  public
      fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty) {
    cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
  }

  public fun build(): CfnApplicationCloudWatchLoggingOptionProps = cdkBuilder.build()
}
