@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@CdkDslMarker
public class CfnGraphQLApiLogConfigPropertyDsl {
  private val cdkBuilder: CfnGraphQLApi.LogConfigProperty.Builder =
      CfnGraphQLApi.LogConfigProperty.builder()

  public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
    cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
  }

  public fun excludeVerboseContent(excludeVerboseContent: Boolean) {
    cdkBuilder.excludeVerboseContent(excludeVerboseContent)
  }

  public fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
    cdkBuilder.excludeVerboseContent(excludeVerboseContent)
  }

  public fun fieldLogLevel(fieldLogLevel: String) {
    cdkBuilder.fieldLogLevel(fieldLogLevel)
  }

  public fun build(): CfnGraphQLApi.LogConfigProperty = cdkBuilder.build()
}
