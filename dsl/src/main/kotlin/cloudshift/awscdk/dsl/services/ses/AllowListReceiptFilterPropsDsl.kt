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
import software.amazon.awscdk.services.ses.AllowListReceiptFilterProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AllowListReceiptFilterPropsDsl {
    private val cdkBuilder: AllowListReceiptFilterProps.Builder =
        AllowListReceiptFilterProps.builder()

    private val _ips: MutableList<String> = mutableListOf()

    public fun ips(vararg ips: String) {
        _ips.addAll(listOf(*ips))
    }

    public fun ips(ips: Collection<String>) {
        _ips.addAll(ips)
    }

    public fun build(): AllowListReceiptFilterProps {
        if (_ips.isNotEmpty()) cdkBuilder.ips(_ips)
        return cdkBuilder.build()
    }
}
