@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * An action that Amazon SES can take when it receives an email on behalf of one or more email
 * addresses or domains that you own.
 *
 * An instance of this data type can represent only one action.
 *
 * For information about setting up receipt rules, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .addHeaderAction(AddHeaderActionProperty.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build())
 * .bounceAction(BounceActionProperty.builder()
 * .message("message")
 * .sender("sender")
 * .smtpReplyCode("smtpReplyCode")
 * // the properties below are optional
 * .statusCode("statusCode")
 * .topicArn("topicArn")
 * .build())
 * .lambdaAction(LambdaActionProperty.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .invocationType("invocationType")
 * .topicArn("topicArn")
 * .build())
 * .s3Action(S3ActionProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .objectKeyPrefix("objectKeyPrefix")
 * .topicArn("topicArn")
 * .build())
 * .snsAction(SNSActionProperty.builder()
 * .encoding("encoding")
 * .topicArn("topicArn")
 * .build())
 * .stopAction(StopActionProperty.builder()
 * .scope("scope")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build())
 * .workmailAction(WorkmailActionProperty.builder()
 * .organizationArn("organizationArn")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html)
 */
@CdkDslMarker
public class CfnReceiptRuleActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.ActionProperty.Builder =
      CfnReceiptRule.ActionProperty.builder()

  /**
   * @param addHeaderAction Adds a header to the received email.
   */
  public fun addHeaderAction(addHeaderAction: IResolvable) {
    cdkBuilder.addHeaderAction(addHeaderAction)
  }

  /**
   * @param addHeaderAction Adds a header to the received email.
   */
  public fun addHeaderAction(addHeaderAction: CfnReceiptRule.AddHeaderActionProperty) {
    cdkBuilder.addHeaderAction(addHeaderAction)
  }

  /**
   * @param bounceAction Rejects the received email by returning a bounce response to the sender
   * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
   */
  public fun bounceAction(bounceAction: IResolvable) {
    cdkBuilder.bounceAction(bounceAction)
  }

  /**
   * @param bounceAction Rejects the received email by returning a bounce response to the sender
   * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
   */
  public fun bounceAction(bounceAction: CfnReceiptRule.BounceActionProperty) {
    cdkBuilder.bounceAction(bounceAction)
  }

  /**
   * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification to
   * Amazon SNS.
   */
  public fun lambdaAction(lambdaAction: IResolvable) {
    cdkBuilder.lambdaAction(lambdaAction)
  }

  /**
   * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification to
   * Amazon SNS.
   */
  public fun lambdaAction(lambdaAction: CfnReceiptRule.LambdaActionProperty) {
    cdkBuilder.lambdaAction(lambdaAction)
  }

  /**
   * @param s3Action Saves the received message to an Amazon Simple Storage Service (Amazon S3)
   * bucket and, optionally, publishes a notification to Amazon SNS.
   */
  public fun s3Action(s3Action: IResolvable) {
    cdkBuilder.s3Action(s3Action)
  }

  /**
   * @param s3Action Saves the received message to an Amazon Simple Storage Service (Amazon S3)
   * bucket and, optionally, publishes a notification to Amazon SNS.
   */
  public fun s3Action(s3Action: CfnReceiptRule.S3ActionProperty) {
    cdkBuilder.s3Action(s3Action)
  }

  /**
   * @param snsAction Publishes the email content within a notification to Amazon SNS.
   */
  public fun snsAction(snsAction: IResolvable) {
    cdkBuilder.snsAction(snsAction)
  }

  /**
   * @param snsAction Publishes the email content within a notification to Amazon SNS.
   */
  public fun snsAction(snsAction: CfnReceiptRule.SNSActionProperty) {
    cdkBuilder.snsAction(snsAction)
  }

  /**
   * @param stopAction Terminates the evaluation of the receipt rule set and optionally publishes a
   * notification to Amazon SNS.
   */
  public fun stopAction(stopAction: IResolvable) {
    cdkBuilder.stopAction(stopAction)
  }

  /**
   * @param stopAction Terminates the evaluation of the receipt rule set and optionally publishes a
   * notification to Amazon SNS.
   */
  public fun stopAction(stopAction: CfnReceiptRule.StopActionProperty) {
    cdkBuilder.stopAction(stopAction)
  }

  /**
   * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to Amazon
   * Amazon SNS.
   */
  public fun workmailAction(workmailAction: IResolvable) {
    cdkBuilder.workmailAction(workmailAction)
  }

  /**
   * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to Amazon
   * Amazon SNS.
   */
  public fun workmailAction(workmailAction: CfnReceiptRule.WorkmailActionProperty) {
    cdkBuilder.workmailAction(workmailAction)
  }

  public fun build(): CfnReceiptRule.ActionProperty = cdkBuilder.build()
}
