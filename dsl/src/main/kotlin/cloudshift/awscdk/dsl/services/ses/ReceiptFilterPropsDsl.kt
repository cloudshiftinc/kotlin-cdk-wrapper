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
import software.amazon.awscdk.services.ses.ReceiptFilterPolicy
import software.amazon.awscdk.services.ses.ReceiptFilterProps
import kotlin.String

@CdkDslMarker
public class ReceiptFilterPropsDsl {
    private val cdkBuilder: ReceiptFilterProps.Builder = ReceiptFilterProps.builder()

    public fun ip(ip: String) {
        cdkBuilder.ip(ip)
    }

    public fun policy(policy: ReceiptFilterPolicy) {
        cdkBuilder.policy(policy)
    }

    public fun receiptFilterName(receiptFilterName: String) {
        cdkBuilder.receiptFilterName(receiptFilterName)
    }

    public fun build(): ReceiptFilterProps = cdkBuilder.build()
}
