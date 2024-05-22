@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

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
public interface ReceiptRuleOptions {
  /**
   * An ordered list of actions to perform on messages that match at least one of the recipient
   * email addresses or domains specified in the receipt rule.
   *
   * Default: - No actions.
   */
  public fun actions(): List<IReceiptRuleAction> =
      unwrap(this).getActions()?.map(IReceiptRuleAction::wrap) ?: emptyList()

  /**
   * An existing rule after which the new rule will be placed.
   *
   * Default: - The new rule is inserted at the beginning of the rule list.
   */
  public fun after(): IReceiptRule? = unwrap(this).getAfter()?.let(IReceiptRule::wrap)

  /**
   * Whether the rule is active.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The name for the rule.
   *
   * Default: - A CloudFormation generated name.
   */
  public fun receiptRuleName(): String? = unwrap(this).getReceiptRuleName()

  /**
   * The recipient domains and email addresses that the receipt rule applies to.
   *
   * Default: - Match all recipients under all verified domains.
   */
  public fun recipients(): List<String> = unwrap(this).getRecipients() ?: emptyList()

  /**
   * Whether to scan for spam and viruses.
   *
   * Default: false
   */
  public fun scanEnabled(): Boolean? = unwrap(this).getScanEnabled()

  /**
   * Whether Amazon SES should require that incoming email is delivered over a connection encrypted
   * with Transport Layer Security (TLS).
   *
   * Default: - Optional which will not check for TLS.
   */
  public fun tlsPolicy(): TlsPolicy? = unwrap(this).getTlsPolicy()?.let(TlsPolicy::wrap)

  /**
   * A builder for [ReceiptRuleOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions An ordered list of actions to perform on messages that match at least one of
     * the recipient email addresses or domains specified in the receipt rule.
     */
    public fun actions(actions: List<IReceiptRuleAction>)

    /**
     * @param actions An ordered list of actions to perform on messages that match at least one of
     * the recipient email addresses or domains specified in the receipt rule.
     */
    public fun actions(vararg actions: IReceiptRuleAction)

    /**
     * @param after An existing rule after which the new rule will be placed.
     */
    public fun after(after: IReceiptRule)

    /**
     * @param enabled Whether the rule is active.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param receiptRuleName The name for the rule.
     */
    public fun receiptRuleName(receiptRuleName: String)

    /**
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     */
    public fun recipients(recipients: List<String>)

    /**
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     */
    public fun recipients(vararg recipients: String)

    /**
     * @param scanEnabled Whether to scan for spam and viruses.
     */
    public fun scanEnabled(scanEnabled: Boolean)

    /**
     * @param tlsPolicy Whether Amazon SES should require that incoming email is delivered over a
     * connection encrypted with Transport Layer Security (TLS).
     */
    public fun tlsPolicy(tlsPolicy: TlsPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRuleOptions.Builder =
        software.amazon.awscdk.services.ses.ReceiptRuleOptions.builder()

    /**
     * @param actions An ordered list of actions to perform on messages that match at least one of
     * the recipient email addresses or domains specified in the receipt rule.
     */
    override fun actions(actions: List<IReceiptRuleAction>) {
      cdkBuilder.actions(actions.map(IReceiptRuleAction.Companion::unwrap))
    }

    /**
     * @param actions An ordered list of actions to perform on messages that match at least one of
     * the recipient email addresses or domains specified in the receipt rule.
     */
    override fun actions(vararg actions: IReceiptRuleAction): Unit = actions(actions.toList())

    /**
     * @param after An existing rule after which the new rule will be placed.
     */
    override fun after(after: IReceiptRule) {
      cdkBuilder.after(after.let(IReceiptRule.Companion::unwrap))
    }

    /**
     * @param enabled Whether the rule is active.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param receiptRuleName The name for the rule.
     */
    override fun receiptRuleName(receiptRuleName: String) {
      cdkBuilder.receiptRuleName(receiptRuleName)
    }

    /**
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     */
    override fun recipients(recipients: List<String>) {
      cdkBuilder.recipients(recipients)
    }

    /**
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     */
    override fun recipients(vararg recipients: String): Unit = recipients(recipients.toList())

    /**
     * @param scanEnabled Whether to scan for spam and viruses.
     */
    override fun scanEnabled(scanEnabled: Boolean) {
      cdkBuilder.scanEnabled(scanEnabled)
    }

    /**
     * @param tlsPolicy Whether Amazon SES should require that incoming email is delivered over a
     * connection encrypted with Transport Layer Security (TLS).
     */
    override fun tlsPolicy(tlsPolicy: TlsPolicy) {
      cdkBuilder.tlsPolicy(tlsPolicy.let(TlsPolicy.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.ReceiptRuleOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleOptions,
  ) : CdkObject(cdkObject), ReceiptRuleOptions {
    /**
     * An ordered list of actions to perform on messages that match at least one of the recipient
     * email addresses or domains specified in the receipt rule.
     *
     * Default: - No actions.
     */
    override fun actions(): List<IReceiptRuleAction> =
        unwrap(this).getActions()?.map(IReceiptRuleAction::wrap) ?: emptyList()

    /**
     * An existing rule after which the new rule will be placed.
     *
     * Default: - The new rule is inserted at the beginning of the rule list.
     */
    override fun after(): IReceiptRule? = unwrap(this).getAfter()?.let(IReceiptRule::wrap)

    /**
     * Whether the rule is active.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The name for the rule.
     *
     * Default: - A CloudFormation generated name.
     */
    override fun receiptRuleName(): String? = unwrap(this).getReceiptRuleName()

    /**
     * The recipient domains and email addresses that the receipt rule applies to.
     *
     * Default: - Match all recipients under all verified domains.
     */
    override fun recipients(): List<String> = unwrap(this).getRecipients() ?: emptyList()

    /**
     * Whether to scan for spam and viruses.
     *
     * Default: false
     */
    override fun scanEnabled(): Boolean? = unwrap(this).getScanEnabled()

    /**
     * Whether Amazon SES should require that incoming email is delivered over a connection
     * encrypted with Transport Layer Security (TLS).
     *
     * Default: - Optional which will not check for TLS.
     */
    override fun tlsPolicy(): TlsPolicy? = unwrap(this).getTlsPolicy()?.let(TlsPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReceiptRuleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleOptions):
        ReceiptRuleOptions = CdkObjectWrappers.wrap(cdkObject) as? ReceiptRuleOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReceiptRuleOptions):
        software.amazon.awscdk.services.ses.ReceiptRuleOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.ReceiptRuleOptions
  }
}
