@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * When included in a receipt rule, this action calls Amazon WorkMail and, optionally, publishes a
 * notification to Amazon Simple Notification Service (Amazon SNS).
 *
 * It usually isn't necessary to set this up manually, because Amazon WorkMail adds the rule
 * automatically during its setup procedure.
 *
 * For information using a receipt rule to call Amazon WorkMail, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-workmail.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * WorkmailActionProperty workmailActionProperty = WorkmailActionProperty.builder()
 * .organizationArn("organizationArn")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html)
 */
@CdkDslMarker
public class CfnReceiptRuleWorkmailActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.WorkmailActionProperty.Builder =
      CfnReceiptRule.WorkmailActionProperty.builder()

  /**
   * @param organizationArn The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
   * Amazon WorkMail ARNs use the following format:. 
   * `arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;`
   *
   * You can find the ID of your organization by using the
   * [ListOrganizations](https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html)
   * operation in Amazon WorkMail. Amazon WorkMail organization IDs begin with " `m-` ", followed by a
   * string of alphanumeric characters.
   *
   * For information about Amazon WorkMail organizations, see the [Amazon WorkMail Administrator
   * Guide](https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html) .
   */
  public fun organizationArn(organizationArn: String) {
    cdkBuilder.organizationArn(organizationArn)
  }

  /**
   * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
   * WorkMail action is called.
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

  public fun build(): CfnReceiptRule.WorkmailActionProperty = cdkBuilder.build()
}
