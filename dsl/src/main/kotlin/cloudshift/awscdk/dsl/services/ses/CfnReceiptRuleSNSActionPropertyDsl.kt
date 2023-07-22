@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

@CdkDslMarker
public class CfnReceiptRuleSNSActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.SNSActionProperty.Builder =
      CfnReceiptRule.SNSActionProperty.builder()

  /**
   * @param encoding The encoding to use for the email within the Amazon SNS notification.
   * UTF-8 is easier to use, but may not preserve all special characters when a message was encoded
   * with a different encoding format. Base64 preserves all special characters. The default value is
   * UTF-8.
   */
  public fun encoding(encoding: String) {
    cdkBuilder.encoding(encoding)
  }

  /**
   * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
   * You can find the ARN of a topic by using the
   * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in Amazon
   * SNS.
   *
   * For more information about Amazon SNS topics, see the [Amazon SNS Developer
   * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
   */
  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): CfnReceiptRule.SNSActionProperty = cdkBuilder.build()
}
