@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

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
