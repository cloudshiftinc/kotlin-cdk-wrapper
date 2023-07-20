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
public class CfnWebACLJsonMatchPatternPropertyDsl {
    private val cdkBuilder: CfnWebACL.JsonMatchPatternProperty.Builder =
        CfnWebACL.JsonMatchPatternProperty.builder()

    private val _includedPaths: MutableList<String> = mutableListOf()

    public fun all(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.all(builder.map)
    }

    public fun all(all: Any) {
        cdkBuilder.all(all)
    }

    public fun includedPaths(vararg includedPaths: String) {
        _includedPaths.addAll(listOf(*includedPaths))
    }

    public fun includedPaths(includedPaths: Collection<String>) {
        _includedPaths.addAll(includedPaths)
    }

    public fun build(): CfnWebACL.JsonMatchPatternProperty {
        if (_includedPaths.isNotEmpty()) cdkBuilder.includedPaths(_includedPaths)
        return cdkBuilder.build()
    }
}
