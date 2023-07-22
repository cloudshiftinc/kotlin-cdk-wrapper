@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * Receipt rules enable you to specify which actions Amazon SES should take when it receives mail on
 * behalf of one or more email addresses or domains that you own.
 *
 * Each receipt rule defines a set of email addresses or domains that it applies to. If the email
 * addresses or domains match at least one recipient address of the message, Amazon SES executes all of
 * the receipt rule's actions on the message.
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
 * RuleProperty ruleProperty = RuleProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html)
 */
@CdkDslMarker
public class CfnReceiptRuleRulePropertyDsl {
  private val cdkBuilder: CfnReceiptRule.RuleProperty.Builder =
      CfnReceiptRule.RuleProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _recipients: MutableList<String> = mutableListOf()

  /**
   * @param actions An ordered list of actions to perform on messages that match at least one of the
   * recipient email addresses or domains specified in the receipt rule.
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions An ordered list of actions to perform on messages that match at least one of the
   * recipient email addresses or domains specified in the receipt rule.
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * @param actions An ordered list of actions to perform on messages that match at least one of the
   * recipient email addresses or domains specified in the receipt rule.
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param enabled If `true` , the receipt rule is active.
   * The default value is `false` .
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled If `true` , the receipt rule is active.
   * The default value is `false` .
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param name The name of the receipt rule. The name must meet the following requirements:.
   * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or periods
   * (.).
   * * Start and end with a letter or number.
   * * Contain 64 characters or fewer.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param recipients The recipient domains and email addresses that the receipt rule applies to.
   * If this field is not specified, this rule matches all recipients on all verified domains.
   */
  public fun recipients(vararg recipients: String) {
    _recipients.addAll(listOf(*recipients))
  }

  /**
   * @param recipients The recipient domains and email addresses that the receipt rule applies to.
   * If this field is not specified, this rule matches all recipients on all verified domains.
   */
  public fun recipients(recipients: Collection<String>) {
    _recipients.addAll(recipients)
  }

  /**
   * @param scanEnabled If `true` , then messages that this receipt rule applies to are scanned for
   * spam and viruses.
   * The default value is `false` .
   */
  public fun scanEnabled(scanEnabled: Boolean) {
    cdkBuilder.scanEnabled(scanEnabled)
  }

  /**
   * @param scanEnabled If `true` , then messages that this receipt rule applies to are scanned for
   * spam and viruses.
   * The default value is `false` .
   */
  public fun scanEnabled(scanEnabled: IResolvable) {
    cdkBuilder.scanEnabled(scanEnabled)
  }

  /**
   * @param tlsPolicy Specifies whether Amazon SES should require that incoming email is delivered
   * over a connection encrypted with Transport Layer Security (TLS).
   * If this parameter is set to `Require` , Amazon SES bounces emails that are not received over
   * TLS. The default is `Optional` .
   *
   * Valid Values: `Require | Optional`
   */
  public fun tlsPolicy(tlsPolicy: String) {
    cdkBuilder.tlsPolicy(tlsPolicy)
  }

  public fun build(): CfnReceiptRule.RuleProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_recipients.isNotEmpty()) cdkBuilder.recipients(_recipients)
    return cdkBuilder.build()
  }
}
