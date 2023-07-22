@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * TextLogDestinationProperty textLogDestinationProperty = TextLogDestinationProperty.builder()
 * .cloudWatch(CloudWatchLogGroupLogDestinationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .logPrefix("logPrefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogdestination.html)
 */
@CdkDslMarker
public class CfnBotTextLogDestinationPropertyDsl {
  private val cdkBuilder: CfnBot.TextLogDestinationProperty.Builder =
      CfnBot.TextLogDestinationProperty.builder()

  /**
   * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs are
   * delivered. 
   */
  public fun cloudWatch(cloudWatch: IResolvable) {
    cdkBuilder.cloudWatch(cloudWatch)
  }

  /**
   * @param cloudWatch Defines the Amazon CloudWatch Logs log group where text and metadata logs are
   * delivered. 
   */
  public fun cloudWatch(cloudWatch: CfnBot.CloudWatchLogGroupLogDestinationProperty) {
    cdkBuilder.cloudWatch(cloudWatch)
  }

  public fun build(): CfnBot.TextLogDestinationProperty = cdkBuilder.build()
}
