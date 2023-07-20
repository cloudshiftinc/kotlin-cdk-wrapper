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

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class LogGroupTargetInputOptionsDsl {
    private val cdkBuilder: LogGroupTargetInputOptions.Builder = LogGroupTargetInputOptions.builder()

    public fun message(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.message(builder.map)
    }

    public fun message(message: Any) {
        cdkBuilder.message(message)
    }

    public fun timestamp(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.timestamp(builder.map)
    }

    public fun timestamp(timestamp: Any) {
        cdkBuilder.timestamp(timestamp)
    }

    public fun build(): LogGroupTargetInputOptions = cdkBuilder.build()
}
