@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasCloudWatchLogGroupLogDestinationPropertyDsl {
  private val cdkBuilder: CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.Builder =
      CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.builder()

  /**
   * @param cloudWatchLogGroupArn The Amazon Resource Name (ARN) of the log group where text and
   * metadata logs are delivered. 
   */
  public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
    cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
  }

  /**
   * @param logPrefix The prefix of the log stream name within the log group that you specified. 
   */
  public fun logPrefix(logPrefix: String) {
    cdkBuilder.logPrefix(logPrefix)
  }

  public fun build(): CfnBotAlias.CloudWatchLogGroupLogDestinationProperty = cdkBuilder.build()
}
