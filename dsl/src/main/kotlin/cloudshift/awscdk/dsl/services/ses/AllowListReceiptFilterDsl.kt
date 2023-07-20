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
import software.amazon.awscdk.services.ses.AllowListReceiptFilter
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AllowListReceiptFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AllowListReceiptFilter.Builder =
        AllowListReceiptFilter.Builder.create(scope, id)

    private val _ips: MutableList<String> = mutableListOf()

    public fun ips(vararg ips: String) {
        _ips.addAll(listOf(*ips))
    }

    public fun ips(ips: Collection<String>) {
        _ips.addAll(ips)
    }

    public fun build(): AllowListReceiptFilter {
        if (_ips.isNotEmpty()) cdkBuilder.ips(_ips)
        return cdkBuilder.build()
    }
}
