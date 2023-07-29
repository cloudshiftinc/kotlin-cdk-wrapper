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
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.MetricWidgetProps

/**
 * Basic properties for widgets that display metrics.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * MetricWidgetProps metricWidgetProps = MetricWidgetProps.builder()
 * .height(123)
 * .region("region")
 * .title("title")
 * .width(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricWidgetPropsDsl {
    private val cdkBuilder: MetricWidgetProps.Builder = MetricWidgetProps.builder()

    /** @param height Height of the widget. */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /** @param region The region the metrics of this graph should be taken from. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param title Title for the graph. */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /** @param width Width of the widget, in a grid of 24 units wide. */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): MetricWidgetProps = cdkBuilder.build()
}
