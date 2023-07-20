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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudwatch.TextWidget
import software.amazon.awscdk.services.cloudwatch.TextWidgetBackground
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class TextWidgetDsl {
    private val cdkBuilder: TextWidget.Builder = TextWidget.Builder.create()

    public fun background(background: TextWidgetBackground) {
        cdkBuilder.background(background)
    }

    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    public fun markdown(markdown: String) {
        cdkBuilder.markdown(markdown)
    }

    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): TextWidget = cdkBuilder.build()
}
