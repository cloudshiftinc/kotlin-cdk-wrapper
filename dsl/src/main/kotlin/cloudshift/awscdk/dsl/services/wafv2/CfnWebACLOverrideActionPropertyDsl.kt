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
import kotlin.Unit

@CdkDslMarker
public class CfnWebACLOverrideActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.OverrideActionProperty.Builder =
        CfnWebACL.OverrideActionProperty.builder()

    public fun count(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.count(builder.map)
    }

    public fun count(count: Any) {
        cdkBuilder.count(count)
    }

    public fun none(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.none(builder.map)
    }

    public fun none(none: Any) {
        cdkBuilder.none(none)
    }

    public fun build(): CfnWebACL.OverrideActionProperty = cdkBuilder.build()
}
