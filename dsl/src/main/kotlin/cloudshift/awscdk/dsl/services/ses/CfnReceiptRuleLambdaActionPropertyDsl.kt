@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * When included in a receipt rule, this action calls an AWS Lambda function and, optionally,
 * publishes a notification to Amazon Simple Notification Service (Amazon SNS).
 *
 * To enable Amazon SES to call your AWS Lambda function or to publish to an Amazon SNS topic of
 * another account, Amazon SES must have permission to access those resources. For information about
 * giving permissions, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html) .
 *
 * For information about using AWS Lambda actions in receipt rules, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-lambda.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * LambdaActionProperty lambdaActionProperty = LambdaActionProperty.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .invocationType("invocationType")
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html)
 */
@CdkDslMarker
public class CfnReceiptRuleLambdaActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.LambdaActionProperty.Builder =
      CfnReceiptRule.LambdaActionProperty.builder()

  /**
   * @param functionArn The Amazon Resource Name (ARN) of the AWS Lambda function. 
   * An example of an AWS Lambda function ARN is
   * `arn:aws:lambda:us-west-2:account-id:function:MyFunction` . For more information about AWS Lambda,
   * see the [AWS Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/welcome.html) .
   */
  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  /**
   * @param invocationType The invocation type of the AWS Lambda function.
   * An invocation type of `RequestResponse` means that the execution of the function immediately
   * results in a response, and a value of `Event` means that the function is invoked asynchronously.
   * The default value is `Event` . For information about AWS Lambda invocation types, see the [AWS
   * Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html) .
   *
   *
   * There is a 30-second timeout on `RequestResponse` invocations. You should use `Event`
   * invocation in most cases. Use `RequestResponse` only to make a mail flow decision, such as whether
   * to stop the receipt rule or the receipt rule set.
   */
  public fun invocationType(invocationType: String) {
    cdkBuilder.invocationType(invocationType)
  }

  /**
   * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
   * Lambda action is executed.
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

  public fun build(): CfnReceiptRule.LambdaActionProperty = cdkBuilder.build()
}
