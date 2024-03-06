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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.VerticalAnnotation
import software.amazon.awscdk.services.cloudwatch.VerticalShading

/**
 * Vertical annotation to be added to a graph.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * VerticalAnnotation verticalAnnotation = VerticalAnnotation.builder()
 * .date("date")
 * // the properties below are optional
 * .color("color")
 * .fill(VerticalShading.NONE)
 * .label("label")
 * .visible(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class VerticalAnnotationDsl {
    private val cdkBuilder: VerticalAnnotation.Builder = VerticalAnnotation.builder()

    /**
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the
     *   annotation. The `Color` class has a set of standard colors that can be used here.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * @param date The date and time (in ISO 8601 format) in the graph where the vertical annotation
     *   line is to appear.
     */
    public fun date(date: String) {
        cdkBuilder.date(date)
    }

    /** @param fill Add shading before or after the annotation. */
    public fun fill(fill: VerticalShading) {
        cdkBuilder.fill(fill)
    }

    /** @param label Label for the annotation. */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /** @param visible Whether the annotation is visible. */
    public fun visible(visible: Boolean) {
        cdkBuilder.visible(visible)
    }

    public fun build(): VerticalAnnotation = cdkBuilder.build()
}
