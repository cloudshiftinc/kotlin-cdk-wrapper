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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.AllowListReceiptFilterProps

/**
 * Construction properties for am AllowListReceiptFilter.
 *
 * Example:
 * ```
 * AllowListReceiptFilter.Builder.create(this, "AllowList")
 * .ips(List.of("10.0.0.0/16", "1.2.3.4/16"))
 * .build();
 * ```
 */
@CdkDslMarker
public class AllowListReceiptFilterPropsDsl {
    private val cdkBuilder: AllowListReceiptFilterProps.Builder =
        AllowListReceiptFilterProps.builder()

    private val _ips: MutableList<String> = mutableListOf()

    /** @param ips A list of ip addresses or ranges to allow list. */
    public fun ips(vararg ips: String) {
        _ips.addAll(listOf(*ips))
    }

    /** @param ips A list of ip addresses or ranges to allow list. */
    public fun ips(ips: Collection<String>) {
        _ips.addAll(ips)
    }

    public fun build(): AllowListReceiptFilterProps {
        if (_ips.isNotEmpty()) cdkBuilder.ips(_ips)
        return cdkBuilder.build()
    }
}
