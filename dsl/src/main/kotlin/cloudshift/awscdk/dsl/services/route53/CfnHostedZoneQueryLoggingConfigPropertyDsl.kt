@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHostedZone

@CdkDslMarker
public class CfnHostedZoneQueryLoggingConfigPropertyDsl {
  private val cdkBuilder: CfnHostedZone.QueryLoggingConfigProperty.Builder =
      CfnHostedZone.QueryLoggingConfigProperty.builder()

  public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
    cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
  }

  public fun build(): CfnHostedZone.QueryLoggingConfigProperty = cdkBuilder.build()
}
