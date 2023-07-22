@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

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
