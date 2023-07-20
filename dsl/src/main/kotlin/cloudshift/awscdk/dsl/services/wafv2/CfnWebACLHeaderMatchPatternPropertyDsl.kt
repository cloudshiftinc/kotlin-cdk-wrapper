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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWebACLHeaderMatchPatternPropertyDsl {
    private val cdkBuilder: CfnWebACL.HeaderMatchPatternProperty.Builder =
        CfnWebACL.HeaderMatchPatternProperty.builder()

    private val _excludedHeaders: MutableList<String> = mutableListOf()

    private val _includedHeaders: MutableList<String> = mutableListOf()

    public fun all(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.all(builder.map)
    }

    public fun all(all: Any) {
        cdkBuilder.all(all)
    }

    public fun excludedHeaders(vararg excludedHeaders: String) {
        _excludedHeaders.addAll(listOf(*excludedHeaders))
    }

    public fun excludedHeaders(excludedHeaders: Collection<String>) {
        _excludedHeaders.addAll(excludedHeaders)
    }

    public fun includedHeaders(vararg includedHeaders: String) {
        _includedHeaders.addAll(listOf(*includedHeaders))
    }

    public fun includedHeaders(includedHeaders: Collection<String>) {
        _includedHeaders.addAll(includedHeaders)
    }

    public fun build(): CfnWebACL.HeaderMatchPatternProperty {
        if (_excludedHeaders.isNotEmpty()) cdkBuilder.excludedHeaders(_excludedHeaders)
        if (_includedHeaders.isNotEmpty()) cdkBuilder.includedHeaders(_includedHeaders)
        return cdkBuilder.build()
    }
}
