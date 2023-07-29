@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.cloudwatch.SpacerProps

/**
 * Props of the spacer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * SpacerProps spacerProps = SpacerProps.builder()
 * .height(123)
 * .width(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class SpacerPropsDsl {
    private val cdkBuilder: SpacerProps.Builder = SpacerProps.builder()

    /** @param height Height of the spacer. */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /** @param width Width of the spacer. */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): SpacerProps = cdkBuilder.build()
}
