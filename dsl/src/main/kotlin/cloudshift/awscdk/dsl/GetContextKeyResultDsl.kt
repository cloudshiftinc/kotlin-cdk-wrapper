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
import software.amazon.awscdk.GetContextKeyResult
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class GetContextKeyResultDsl {
    private val cdkBuilder: GetContextKeyResult.Builder = GetContextKeyResult.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun props(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.props(builder.map)
    }

    public fun props(props: Map<String, Any>) {
        cdkBuilder.props(props)
    }

    public fun build(): GetContextKeyResult = cdkBuilder.build()
}
