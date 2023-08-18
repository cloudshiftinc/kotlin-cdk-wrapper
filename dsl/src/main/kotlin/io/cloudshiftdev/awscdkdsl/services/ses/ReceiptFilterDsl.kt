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
import kotlin.String
import software.amazon.awscdk.services.ses.ReceiptFilter
import software.amazon.awscdk.services.ses.ReceiptFilterPolicy
import software.constructs.Construct

/**
 * A receipt filter.
 *
 * When instantiated without props, it creates a block all receipt filter.
 *
 * Example:
 * ```
 * ReceiptFilter.Builder.create(this, "Filter")
 * .ip("1.2.3.4/16")
 * .build();
 * ```
 */
@CdkDslMarker
public class ReceiptFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ReceiptFilter.Builder = ReceiptFilter.Builder.create(scope, id)

    /**
     * The ip address or range to filter.
     *
     * Default: 0.0.0.0/0
     *
     * @param ip The ip address or range to filter.
     */
    public fun ip(ip: String) {
        cdkBuilder.ip(ip)
    }

    /**
     * The policy for the filter.
     *
     * Default: Block
     *
     * @param policy The policy for the filter.
     */
    public fun policy(policy: ReceiptFilterPolicy) {
        cdkBuilder.policy(policy)
    }

    /**
     * The name for the receipt filter.
     *
     * Default: a CloudFormation generated name
     *
     * @param receiptFilterName The name for the receipt filter.
     */
    public fun receiptFilterName(receiptFilterName: String) {
        cdkBuilder.receiptFilterName(receiptFilterName)
    }

    public fun build(): ReceiptFilter = cdkBuilder.build()
}
