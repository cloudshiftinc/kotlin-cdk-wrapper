@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A rule added at the top of the rule set to drop spam/virus.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * ReceiptRule receiptRule;
 * IReceiptRuleAction receiptRuleAction;
 * ReceiptRuleSet receiptRuleSet;
 * DropSpamReceiptRule dropSpamReceiptRule = DropSpamReceiptRule.Builder.create(this,
 * "MyDropSpamReceiptRule")
 * .ruleSet(receiptRuleSet)
 * // the properties below are optional
 * .actions(List.of(receiptRuleAction))
 * .after(receiptRule)
 * .enabled(false)
 * .receiptRuleName("receiptRuleName")
 * .recipients(List.of("recipients"))
 * .scanEnabled(false)
 * .tlsPolicy(TlsPolicy.OPTIONAL)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-lambda-example-functions.html)
 */
public open class DropSpamReceiptRule(
  cdkObject: software.amazon.awscdk.services.ses.DropSpamReceiptRule,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DropSpamReceiptRuleProps,
  ) :
      this(software.amazon.awscdk.services.ses.DropSpamReceiptRule(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(DropSpamReceiptRuleProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DropSpamReceiptRuleProps.Builder.() -> Unit,
  ) : this(scope, id, DropSpamReceiptRuleProps(props)
  )

  /**
   *
   */
  public open fun rule(): ReceiptRule = unwrap(this).getRule().let(ReceiptRule::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.DropSpamReceiptRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An ordered list of actions to perform on messages that match at least one of the recipient
     * email addresses or domains specified in the receipt rule.
     *
     * Default: - No actions.
     *
     * @param actions An ordered list of actions to perform on messages that match at least one of
     * the recipient email addresses or domains specified in the receipt rule. 
     */
    public fun actions(actions: List<IReceiptRuleAction>)

    /**
     * An ordered list of actions to perform on messages that match at least one of the recipient
     * email addresses or domains specified in the receipt rule.
     *
     * Default: - No actions.
     *
     * @param actions An ordered list of actions to perform on messages that match at least one of
     * the recipient email addresses or domains specified in the receipt rule. 
     */
    public fun actions(vararg actions: IReceiptRuleAction)

    /**
     * An existing rule after which the new rule will be placed.
     *
     * Default: - The new rule is inserted at the beginning of the rule list.
     *
     * @param after An existing rule after which the new rule will be placed. 
     */
    public fun after(after: IReceiptRule)

    /**
     * Whether the rule is active.
     *
     * Default: true
     *
     * @param enabled Whether the rule is active. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The name for the rule.
     *
     * Default: - A CloudFormation generated name.
     *
     * @param receiptRuleName The name for the rule. 
     */
    public fun receiptRuleName(receiptRuleName: String)

    /**
     * The recipient domains and email addresses that the receipt rule applies to.
     *
     * Default: - Match all recipients under all verified domains.
     *
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     * 
     */
    public fun recipients(recipients: List<String>)

    /**
     * The recipient domains and email addresses that the receipt rule applies to.
     *
     * Default: - Match all recipients under all verified domains.
     *
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     * 
     */
    public fun recipients(vararg recipients: String)

    /**
     * The name of the rule set that the receipt rule will be added to.
     *
     * @param ruleSet The name of the rule set that the receipt rule will be added to. 
     */
    public fun ruleSet(ruleSet: IReceiptRuleSet)

    /**
     * Whether to scan for spam and viruses.
     *
     * Default: false
     *
     * @param scanEnabled Whether to scan for spam and viruses. 
     */
    public fun scanEnabled(scanEnabled: Boolean)

    /**
     * Whether Amazon SES should require that incoming email is delivered over a connection
     * encrypted with Transport Layer Security (TLS).
     *
     * Default: - Optional which will not check for TLS.
     *
     * @param tlsPolicy Whether Amazon SES should require that incoming email is delivered over a
     * connection encrypted with Transport Layer Security (TLS). 
     */
    public fun tlsPolicy(tlsPolicy: TlsPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DropSpamReceiptRule.Builder =
        software.amazon.awscdk.services.ses.DropSpamReceiptRule.Builder.create(scope, id)

    /**
     * An ordered list of actions to perform on messages that match at least one of the recipient
     * email addresses or domains specified in the receipt rule.
     *
     * Default: - No actions.
     *
     * @param actions An ordered list of actions to perform on messages that match at least one of
     * the recipient email addresses or domains specified in the receipt rule. 
     */
    override fun actions(actions: List<IReceiptRuleAction>) {
      cdkBuilder.actions(actions.map(IReceiptRuleAction::unwrap))
    }

    /**
     * An ordered list of actions to perform on messages that match at least one of the recipient
     * email addresses or domains specified in the receipt rule.
     *
     * Default: - No actions.
     *
     * @param actions An ordered list of actions to perform on messages that match at least one of
     * the recipient email addresses or domains specified in the receipt rule. 
     */
    override fun actions(vararg actions: IReceiptRuleAction): Unit = actions(actions.toList())

    /**
     * An existing rule after which the new rule will be placed.
     *
     * Default: - The new rule is inserted at the beginning of the rule list.
     *
     * @param after An existing rule after which the new rule will be placed. 
     */
    override fun after(after: IReceiptRule) {
      cdkBuilder.after(after.let(IReceiptRule::unwrap))
    }

    /**
     * Whether the rule is active.
     *
     * Default: true
     *
     * @param enabled Whether the rule is active. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The name for the rule.
     *
     * Default: - A CloudFormation generated name.
     *
     * @param receiptRuleName The name for the rule. 
     */
    override fun receiptRuleName(receiptRuleName: String) {
      cdkBuilder.receiptRuleName(receiptRuleName)
    }

    /**
     * The recipient domains and email addresses that the receipt rule applies to.
     *
     * Default: - Match all recipients under all verified domains.
     *
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     * 
     */
    override fun recipients(recipients: List<String>) {
      cdkBuilder.recipients(recipients)
    }

    /**
     * The recipient domains and email addresses that the receipt rule applies to.
     *
     * Default: - Match all recipients under all verified domains.
     *
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     * 
     */
    override fun recipients(vararg recipients: String): Unit = recipients(recipients.toList())

    /**
     * The name of the rule set that the receipt rule will be added to.
     *
     * @param ruleSet The name of the rule set that the receipt rule will be added to. 
     */
    override fun ruleSet(ruleSet: IReceiptRuleSet) {
      cdkBuilder.ruleSet(ruleSet.let(IReceiptRuleSet::unwrap))
    }

    /**
     * Whether to scan for spam and viruses.
     *
     * Default: false
     *
     * @param scanEnabled Whether to scan for spam and viruses. 
     */
    override fun scanEnabled(scanEnabled: Boolean) {
      cdkBuilder.scanEnabled(scanEnabled)
    }

    /**
     * Whether Amazon SES should require that incoming email is delivered over a connection
     * encrypted with Transport Layer Security (TLS).
     *
     * Default: - Optional which will not check for TLS.
     *
     * @param tlsPolicy Whether Amazon SES should require that incoming email is delivered over a
     * connection encrypted with Transport Layer Security (TLS). 
     */
    override fun tlsPolicy(tlsPolicy: TlsPolicy) {
      cdkBuilder.tlsPolicy(tlsPolicy.let(TlsPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.DropSpamReceiptRule = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DropSpamReceiptRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DropSpamReceiptRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DropSpamReceiptRule):
        DropSpamReceiptRule = DropSpamReceiptRule(cdkObject)

    internal fun unwrap(wrapped: DropSpamReceiptRule):
        software.amazon.awscdk.services.ses.DropSpamReceiptRule = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.DropSpamReceiptRule
  }
}
