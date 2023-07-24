@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.assertions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.assertions.Capture
import software.amazon.awscdk.assertions.MatchCapture
import kotlin.Any
import kotlin.Unit

/**
 * Information about a value captured during match.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.assertions.*;
 * Capture capture;
 * Object value;
 * MatchCapture matchCapture = MatchCapture.builder()
 * .capture(capture)
 * .value(value)
 * .build();
 * ```
 */
@CdkDslMarker
public class MatchCaptureDsl {
    private val cdkBuilder: MatchCapture.Builder = MatchCapture.builder()

    /**
     * @param capture The instance of Capture class to which this capture is associated with.
     */
    public fun capture(capture: Capture) {
        cdkBuilder.capture(capture)
    }

    /**
     * @param value The value that was captured.
     */
    public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(`value`)
        cdkBuilder.`value`(builder.map)
    }

    /**
     * @param value The value that was captured.
     */
    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): MatchCapture = cdkBuilder.build()
}
