@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleProps

/**
 * Properties for defining a `CfnReceiptRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnReceiptRuleProps cfnReceiptRuleProps = CfnReceiptRuleProps.builder()
 * .rule(RuleProperty.builder()
 * .actions(List.of(ActionProperty.builder()
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
 * .build()))
 * .enabled(false)
 * .name("name")
 * .recipients(List.of("recipients"))
 * .scanEnabled(false)
 * .tlsPolicy("tlsPolicy")
 * .build())
 * .ruleSetName("ruleSetName")
 * // the properties below are optional
 * .after("after")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html)
 */
@CdkDslMarker
public class CfnReceiptRulePropsDsl {
  private val cdkBuilder: CfnReceiptRuleProps.Builder = CfnReceiptRuleProps.builder()

  /**
   * @param after The name of an existing rule after which the new rule is placed.
   * If this parameter is null, the new rule is inserted at the beginning of the rule list.
   */
  public fun after(after: String) {
    cdkBuilder.after(after)
  }

  /**
   * @param rule A data structure that contains the specified rule's name, actions, recipients,
   * domains, enabled status, scan status, and TLS policy. 
   */
  public fun rule(rule: IResolvable) {
    cdkBuilder.rule(rule)
  }

  /**
   * @param rule A data structure that contains the specified rule's name, actions, recipients,
   * domains, enabled status, scan status, and TLS policy. 
   */
  public fun rule(rule: CfnReceiptRule.RuleProperty) {
    cdkBuilder.rule(rule)
  }

  /**
   * @param ruleSetName The name of the rule set where the receipt rule is added. 
   */
  public fun ruleSetName(ruleSetName: String) {
    cdkBuilder.ruleSetName(ruleSetName)
  }

  public fun build(): CfnReceiptRuleProps = cdkBuilder.build()
}
