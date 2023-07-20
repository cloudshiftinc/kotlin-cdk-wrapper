@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.ReceiptRuleOptions
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ReceiptRuleSetPropsDsl {
    private val cdkBuilder: ReceiptRuleSetProps.Builder = ReceiptRuleSetProps.builder()

    private val _rules: MutableList<ReceiptRuleOptions> = mutableListOf()

    public fun dropSpam(dropSpam: Boolean) {
        cdkBuilder.dropSpam(dropSpam)
    }

    public fun receiptRuleSetName(receiptRuleSetName: String) {
        cdkBuilder.receiptRuleSetName(receiptRuleSetName)
    }

    public fun rules(rules: ReceiptRuleOptionsDsl.() -> Unit) {
        _rules.add(ReceiptRuleOptionsDsl().apply(rules).build())
    }

    public fun rules(rules: Collection<ReceiptRuleOptions>) {
        _rules.addAll(rules)
    }

    public fun build(): ReceiptRuleSetProps {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
