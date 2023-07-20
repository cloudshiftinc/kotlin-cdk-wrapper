@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionV2Dsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationCloudWatchLoggingOptionV2.Builder =
      CfnApplicationCloudWatchLoggingOptionV2.Builder.create(scope, id)

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
    cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
  }

  public
      fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty) {
    cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
  }

  public fun build(): CfnApplicationCloudWatchLoggingOptionV2 = cdkBuilder.build()
}
