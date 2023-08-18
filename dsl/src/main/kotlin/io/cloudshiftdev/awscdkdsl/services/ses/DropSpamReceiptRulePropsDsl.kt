@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.DropSpamReceiptRuleProps
import software.amazon.awscdk.services.ses.IReceiptRule
import software.amazon.awscdk.services.ses.IReceiptRuleAction
import software.amazon.awscdk.services.ses.IReceiptRuleSet
import software.amazon.awscdk.services.ses.TlsPolicy

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * ReceiptRule receiptRule;
 * IReceiptRuleAction receiptRuleAction;
 * ReceiptRuleSet receiptRuleSet;
 * DropSpamReceiptRuleProps dropSpamReceiptRuleProps = DropSpamReceiptRuleProps.builder()
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
 */
@CdkDslMarker
public class DropSpamReceiptRulePropsDsl {
    private val cdkBuilder: DropSpamReceiptRuleProps.Builder = DropSpamReceiptRuleProps.builder()

    private val _actions: MutableList<IReceiptRuleAction> = mutableListOf()

    private val _recipients: MutableList<String> = mutableListOf()

    /**
     * @param actions An ordered list of actions to perform on messages that match at least one of
     *   the recipient email addresses or domains specified in the receipt rule.
     */
    public fun actions(vararg actions: IReceiptRuleAction) {
        _actions.addAll(listOf(*actions))
    }

    /**
     * @param actions An ordered list of actions to perform on messages that match at least one of
     *   the recipient email addresses or domains specified in the receipt rule.
     */
    public fun actions(actions: Collection<IReceiptRuleAction>) {
        _actions.addAll(actions)
    }

    /** @param after An existing rule after which the new rule will be placed. */
    public fun after(after: IReceiptRule) {
        cdkBuilder.after(after)
    }

    /** @param enabled Whether the rule is active. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param receiptRuleName The name for the rule. */
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

    /** @param ruleSet The name of the rule set that the receipt rule will be added to. */
    public fun ruleSet(ruleSet: IReceiptRuleSet) {
        cdkBuilder.ruleSet(ruleSet)
    }

    /** @param scanEnabled Whether to scan for spam and viruses. */
    public fun scanEnabled(scanEnabled: Boolean) {
        cdkBuilder.scanEnabled(scanEnabled)
    }

    /**
     * @param tlsPolicy Whether Amazon SES should require that incoming email is delivered over a
     *   connection encrypted with Transport Layer Security (TLS).
     */
    public fun tlsPolicy(tlsPolicy: TlsPolicy) {
        cdkBuilder.tlsPolicy(tlsPolicy)
    }

    public fun build(): DropSpamReceiptRuleProps {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_recipients.isNotEmpty()) cdkBuilder.recipients(_recipients)
        return cdkBuilder.build()
    }
}
