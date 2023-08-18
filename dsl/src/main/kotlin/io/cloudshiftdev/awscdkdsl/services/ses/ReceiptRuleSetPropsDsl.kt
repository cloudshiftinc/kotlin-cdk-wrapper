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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.ReceiptRuleOptions
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps

/**
 * Construction properties for a ReceiptRuleSet.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.ses.actions.*;
 * Bucket bucket = new Bucket(this, "Bucket");
 * Topic topic = new Topic(this, "Topic");
 * ReceiptRuleSet.Builder.create(this, "RuleSet")
 * .rules(List.of(ReceiptRuleOptions.builder()
 * .recipients(List.of("hello&#64;aws.com"))
 * .actions(List.of(
 * AddHeader.Builder.create()
 * .name("X-Special-Header")
 * .value("aws")
 * .build(),
 * S3.Builder.create()
 * .bucket(bucket)
 * .objectKeyPrefix("emails/")
 * .topic(topic)
 * .build()))
 * .build(), ReceiptRuleOptions.builder()
 * .recipients(List.of("aws.com"))
 * .actions(List.of(
 * Sns.Builder.create()
 * .topic(topic)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ReceiptRuleSetPropsDsl {
    private val cdkBuilder: ReceiptRuleSetProps.Builder = ReceiptRuleSetProps.builder()

    private val _rules: MutableList<ReceiptRuleOptions> = mutableListOf()

    /**
     * @param dropSpam Whether to add a first rule to stop processing messages that have at least
     *   one spam indicator.
     */
    public fun dropSpam(dropSpam: Boolean) {
        cdkBuilder.dropSpam(dropSpam)
    }

    /** @param receiptRuleSetName The name for the receipt rule set. */
    public fun receiptRuleSetName(receiptRuleSetName: String) {
        cdkBuilder.receiptRuleSetName(receiptRuleSetName)
    }

    /**
     * @param rules The list of rules to add to this rule set. Rules are added in the same order as
     *   they appear in the list.
     */
    public fun rules(rules: ReceiptRuleOptionsDsl.() -> Unit) {
        _rules.add(ReceiptRuleOptionsDsl().apply(rules).build())
    }

    /**
     * @param rules The list of rules to add to this rule set. Rules are added in the same order as
     *   they appear in the list.
     */
    public fun rules(rules: Collection<ReceiptRuleOptions>) {
        _rules.addAll(rules)
    }

    public fun build(): ReceiptRuleSetProps {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
