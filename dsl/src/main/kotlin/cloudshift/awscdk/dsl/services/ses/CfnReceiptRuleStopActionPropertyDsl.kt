@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * When included in a receipt rule, this action terminates the evaluation of the receipt rule set
 * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
 *
 * For information about setting a stop action in a receipt rule, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-stop.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * StopActionProperty stopActionProperty = StopActionProperty.builder()
 * .scope("scope")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html)
 */
@CdkDslMarker
public class CfnReceiptRuleStopActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.StopActionProperty.Builder =
      CfnReceiptRule.StopActionProperty.builder()

  /**
   * @param scope The scope of the StopAction. 
   * The only acceptable value is `RuleSet` .
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop
   * action is taken.
   * You can find the ARN of a topic by using the
   * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS operation.
   *
   * For more information about Amazon SNS topics, see the [Amazon SNS Developer
   * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
   */
  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): CfnReceiptRule.StopActionProperty = cdkBuilder.build()
}
