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
import kotlin.String
import software.amazon.awscdk.services.ses.ReceiptFilterPolicy
import software.amazon.awscdk.services.ses.ReceiptFilterProps

/**
 * Construction properties for a ReceiptFilter.
 *
 * Example:
 * ```
 * ReceiptFilter.Builder.create(this, "Filter")
 * .ip("1.2.3.4/16")
 * .build();
 * ```
 */
@CdkDslMarker
public class ReceiptFilterPropsDsl {
    private val cdkBuilder: ReceiptFilterProps.Builder = ReceiptFilterProps.builder()

    /** @param ip The ip address or range to filter. */
    public fun ip(ip: String) {
        cdkBuilder.ip(ip)
    }

    /** @param policy The policy for the filter. */
    public fun policy(policy: ReceiptFilterPolicy) {
        cdkBuilder.policy(policy)
    }

    /** @param receiptFilterName The name for the receipt filter. */
    public fun receiptFilterName(receiptFilterName: String) {
        cdkBuilder.receiptFilterName(receiptFilterName)
    }

    public fun build(): ReceiptFilterProps = cdkBuilder.build()
}
