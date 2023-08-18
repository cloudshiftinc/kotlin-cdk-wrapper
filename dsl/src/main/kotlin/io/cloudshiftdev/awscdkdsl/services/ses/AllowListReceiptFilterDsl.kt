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
import software.amazon.awscdk.services.ses.AllowListReceiptFilter
import software.constructs.Construct

/**
 * An allow list receipt filter.
 *
 * Example:
 * ```
 * AllowListReceiptFilter.Builder.create(this, "AllowList")
 * .ips(List.of("10.0.0.0/16", "1.2.3.4/16"))
 * .build();
 * ```
 */
@CdkDslMarker
public class AllowListReceiptFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AllowListReceiptFilter.Builder =
        AllowListReceiptFilter.Builder.create(scope, id)

    private val _ips: MutableList<String> = mutableListOf()

    /**
     * A list of ip addresses or ranges to allow list.
     *
     * @param ips A list of ip addresses or ranges to allow list.
     */
    public fun ips(vararg ips: String) {
        _ips.addAll(listOf(*ips))
    }

    /**
     * A list of ip addresses or ranges to allow list.
     *
     * @param ips A list of ip addresses or ranges to allow list.
     */
    public fun ips(ips: Collection<String>) {
        _ips.addAll(ips)
    }

    public fun build(): AllowListReceiptFilter {
        if (_ips.isNotEmpty()) cdkBuilder.ips(_ips)
        return cdkBuilder.build()
    }
}
