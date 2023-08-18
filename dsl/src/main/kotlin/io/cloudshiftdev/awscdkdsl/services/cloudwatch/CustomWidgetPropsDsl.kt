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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CustomWidgetProps

/**
 * The properties for a CustomWidget.
 *
 * Example:
 * ```
 * Dashboard dashboard;
 * // Import or create a lambda function
 * IFunction fn = Function.fromFunctionArn(dashboard, "Function",
 * "arn:aws:lambda:us-east-1:123456789012:function:MyFn");
 * dashboard.addWidgets(CustomWidget.Builder.create()
 * .functionArn(fn.getFunctionArn())
 * .title("My lambda baked widget")
 * .build());
 * ```
 */
@CdkDslMarker
public class CustomWidgetPropsDsl {
    private val cdkBuilder: CustomWidgetProps.Builder = CustomWidgetProps.builder()

    /**
     * @param functionArn The Arn of the AWS Lambda function that returns HTML or JSON that will be
     *   displayed in the widget.
     */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    /** @param height Height of the widget. */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /** @param params Parameters passed to the lambda function. */
    public fun params(params: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(params)
        cdkBuilder.params(builder.map)
    }

    /** @param params Parameters passed to the lambda function. */
    public fun params(params: Any) {
        cdkBuilder.params(params)
    }

    /** @param title The title of the widget. */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /** @param updateOnRefresh Update the widget on refresh. */
    public fun updateOnRefresh(updateOnRefresh: Boolean) {
        cdkBuilder.updateOnRefresh(updateOnRefresh)
    }

    /** @param updateOnResize Update the widget on resize. */
    public fun updateOnResize(updateOnResize: Boolean) {
        cdkBuilder.updateOnResize(updateOnResize)
    }

    /** @param updateOnTimeRangeChange Update the widget on time range change. */
    public fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean) {
        cdkBuilder.updateOnTimeRangeChange(updateOnTimeRangeChange)
    }

    /** @param width Width of the widget, in a grid of 24 units wide. */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): CustomWidgetProps = cdkBuilder.build()
}
