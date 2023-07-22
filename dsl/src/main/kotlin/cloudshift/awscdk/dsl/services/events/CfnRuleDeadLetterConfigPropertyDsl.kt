@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

/**
 * A `DeadLetterConfig` object that contains information about a dead-letter queue configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-deadletterconfig.html)
 */
@CdkDslMarker
public class CfnRuleDeadLetterConfigPropertyDsl {
  private val cdkBuilder: CfnRule.DeadLetterConfigProperty.Builder =
      CfnRule.DeadLetterConfigProperty.builder()

  /**
   * @param arn The ARN of the SQS queue specified as the target for the dead-letter queue.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnRule.DeadLetterConfigProperty = cdkBuilder.build()
}
