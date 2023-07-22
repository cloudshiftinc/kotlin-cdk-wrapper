@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.constructs.Construct

/**
 * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
 *
 *
 * Only one *ApplicationCloudWatchLoggingOption* resource can be attached per application.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CfnApplicationCloudWatchLoggingOption cfnApplicationCloudWatchLoggingOption =
 * CfnApplicationCloudWatchLoggingOption.Builder.create(this,
 * "MyCfnApplicationCloudWatchLoggingOption")
 * .applicationName("applicationName")
 * .cloudWatchLoggingOption(CloudWatchLoggingOptionProperty.builder()
 * .logStreamArn("logStreamArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html)
 */
@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationCloudWatchLoggingOption.Builder =
      CfnApplicationCloudWatchLoggingOption.Builder.create(scope, id)

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname)
   * @param applicationName The name of the application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
   * Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
   * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
   * including the log stream Amazon Resource Name (ARN). 
   */
  public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
    cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
  }

  /**
   * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
   * Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
   * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
   * including the log stream Amazon Resource Name (ARN). 
   */
  public
      fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty) {
    cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
  }

  public fun build(): CfnApplicationCloudWatchLoggingOption = cdkBuilder.build()
}
