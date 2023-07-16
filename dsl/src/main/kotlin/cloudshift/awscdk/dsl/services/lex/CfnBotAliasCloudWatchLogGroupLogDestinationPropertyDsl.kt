@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasCloudWatchLogGroupLogDestinationPropertyDsl {
  private val cdkBuilder: CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.Builder =
      CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.builder()

  public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
    cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
  }

  public fun logPrefix(logPrefix: String) {
    cdkBuilder.logPrefix(logPrefix)
  }

  public fun build(): CfnBotAlias.CloudWatchLogGroupLogDestinationProperty = cdkBuilder.build()
}
