@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.IReceiptRule
import software.amazon.awscdk.services.ses.IReceiptRuleAction
import software.amazon.awscdk.services.ses.ReceiptRuleOptions
import software.amazon.awscdk.services.ses.TlsPolicy

/**
 * Options to add a receipt rule to a receipt rule set.
 *
 * Example:
 *
 * ```
 * ReceiptRuleSet ruleSet = new ReceiptRuleSet(this, "RuleSet");
 * ReceiptRule awsRule = ruleSet.addRule("Aws", ReceiptRuleOptions.builder()
 * .recipients(List.of("aws.com"))
 * .build());
 * ```
 */
@CdkDslMarker
public class ReceiptRuleOptionsDsl {
  private val cdkBuilder: ReceiptRuleOptions.Builder = ReceiptRuleOptions.builder()

  private val _actions: MutableList<IReceiptRuleAction> = mutableListOf()

  private val _recipients: MutableList<String> = mutableListOf()

  /**
   * @param actions An ordered list of actions to perform on messages that match at least one of the
   * recipient email addresses or domains specified in the receipt rule.
   */
  public fun actions(vararg actions: IReceiptRuleAction) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions An ordered list of actions to perform on messages that match at least one of the
   * recipient email addresses or domains specified in the receipt rule.
   */
  public fun actions(actions: Collection<IReceiptRuleAction>) {
    _actions.addAll(actions)
  }

  /**
   * @param after An existing rule after which the new rule will be placed.
   */
  public fun after(after: IReceiptRule) {
    cdkBuilder.after(after)
  }

  /**
   * @param enabled Whether the rule is active.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param receiptRuleName The name for the rule.
   */
  public fun receiptRuleName(receiptRuleName: String) {
    cdkBuilder.receiptRuleName(receiptRuleName)
  }

  /**
   * @param recipients The recipient domains and email addresses that the receipt rule applies to.
   */
  public fun recipients(vararg recipients: String) {
    _recipients.addAll(listOf(*recipients))
  }

  /**
   * @param recipients The recipient domains and email addresses that the receipt rule applies to.
   */
  public fun recipients(recipients: Collection<String>) {
    _recipients.addAll(recipients)
  }

  /**
   * @param scanEnabled Whether to scan for spam and viruses.
   */
  public fun scanEnabled(scanEnabled: Boolean) {
    cdkBuilder.scanEnabled(scanEnabled)
  }

  /**
   * @param tlsPolicy Whether Amazon SES should require that incoming email is delivered over a
   * connection encrypted with Transport Layer Security (TLS).
   */
  public fun tlsPolicy(tlsPolicy: TlsPolicy) {
    cdkBuilder.tlsPolicy(tlsPolicy)
  }

  public fun build(): ReceiptRuleOptions {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_recipients.isNotEmpty()) cdkBuilder.recipients(_recipients)
    return cdkBuilder.build()
  }
}
