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

package cloudshift.awscdk.dsl.assertions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.assertions.Capture
import software.amazon.awscdk.assertions.MatchCapture
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class MatchCaptureDsl {
    private val cdkBuilder: MatchCapture.Builder = MatchCapture.builder()

    public fun capture(capture: Capture) {
        cdkBuilder.capture(capture)
    }

    public fun `value`(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.`value`(builder.map)
    }

    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): MatchCapture = cdkBuilder.build()
}
