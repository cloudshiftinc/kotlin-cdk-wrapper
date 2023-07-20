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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.GetContextValueOptions
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class GetContextValueOptionsDsl {
    private val cdkBuilder: GetContextValueOptions.Builder = GetContextValueOptions.builder()

    public fun dummyValue(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.dummyValue(builder.map)
    }

    public fun dummyValue(dummyValue: Any) {
        cdkBuilder.dummyValue(dummyValue)
    }

    public fun includeEnvironment(includeEnvironment: Boolean) {
        cdkBuilder.includeEnvironment(includeEnvironment)
    }

    public fun props(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.props(builder.map)
    }

    public fun props(props: Map<String, Any>) {
        cdkBuilder.props(props)
    }

    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    public fun build(): GetContextValueOptions = cdkBuilder.build()
}
