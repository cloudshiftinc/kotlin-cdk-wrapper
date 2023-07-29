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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.ReceiptRuleOptions
import software.amazon.awscdk.services.ses.ReceiptRuleSet
import software.constructs.Construct

/**
 * A new receipt rule set.
 *
 * Example:
 * ```
 * ReceiptRuleSet ruleSet = new ReceiptRuleSet(this, "RuleSet");
 * ReceiptRule awsRule = ruleSet.addRule("Aws", ReceiptRuleOptions.builder()
 * .recipients(List.of("aws.com"))
 * .build());
 * ```
 */
@CdkDslMarker
public class ReceiptRuleSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ReceiptRuleSet.Builder = ReceiptRuleSet.Builder.create(scope, id)

    private val _rules: MutableList<ReceiptRuleOptions> = mutableListOf()

    /**
     * Whether to add a first rule to stop processing messages that have at least one spam
     * indicator.
     *
     * Default: false
     *
     * @param dropSpam Whether to add a first rule to stop processing messages that have at least
     *   one spam indicator.
     */
    public fun dropSpam(dropSpam: Boolean) {
        cdkBuilder.dropSpam(dropSpam)
    }

    /**
     * The name for the receipt rule set.
     *
     * Default: - A CloudFormation generated name.
     *
     * @param receiptRuleSetName The name for the receipt rule set.
     */
    public fun receiptRuleSetName(receiptRuleSetName: String) {
        cdkBuilder.receiptRuleSetName(receiptRuleSetName)
    }

    /**
     * The list of rules to add to this rule set.
     *
     * Rules are added in the same order as they appear in the list.
     *
     * Default: - No rules are added to the rule set.
     *
     * @param rules The list of rules to add to this rule set.
     */
    public fun rules(rules: ReceiptRuleOptionsDsl.() -> Unit) {
        _rules.add(ReceiptRuleOptionsDsl().apply(rules).build())
    }

    /**
     * The list of rules to add to this rule set.
     *
     * Rules are added in the same order as they appear in the list.
     *
     * Default: - No rules are added to the rule set.
     *
     * @param rules The list of rules to add to this rule set.
     */
    public fun rules(rules: Collection<ReceiptRuleOptions>) {
        _rules.addAll(rules)
    }

    public fun build(): ReceiptRuleSet {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
