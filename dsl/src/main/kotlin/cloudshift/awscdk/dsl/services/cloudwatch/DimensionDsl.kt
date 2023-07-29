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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Dimension

/**
 * Metric dimension.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Object value;
 * Dimension dimension = Dimension.builder()
 * .name("name")
 * .value(value)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-dimension.html)
 */
@CdkDslMarker
public class DimensionDsl {
    private val cdkBuilder: Dimension.Builder = Dimension.builder()

    /** @param name Name of the dimension. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value Value of the dimension. */
    public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(`value`)
        cdkBuilder.`value`(builder.map)
    }

    /** @param value Value of the dimension. */
    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): Dimension = cdkBuilder.build()
}
