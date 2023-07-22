@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props

@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionV2PropsDsl {
  private val cdkBuilder: CfnApplicationCloudWatchLoggingOptionV2Props.Builder =
      CfnApplicationCloudWatchLoggingOptionV2Props.builder()

  /**
   * @param applicationName The name of the application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
   * including the log stream Amazon Resource Name (ARN). 
   */
  public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
    cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
  }

  /**
   * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
   * including the log stream Amazon Resource Name (ARN). 
   */
  public
      fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty) {
    cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
  }

  public fun build(): CfnApplicationCloudWatchLoggingOptionV2Props = cdkBuilder.build()
}
