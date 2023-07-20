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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResponseHeadersPolicyAccessControlAllowMethodsPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.Builder =
        CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.builder()

    private val _items: MutableList<String> = mutableListOf()

    public fun items(vararg items: String) {
        _items.addAll(listOf(*items))
    }

    public fun items(items: Collection<String>) {
        _items.addAll(items)
    }

    public fun build(): CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
