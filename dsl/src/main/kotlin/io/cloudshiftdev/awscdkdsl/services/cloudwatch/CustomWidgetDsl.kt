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
import software.amazon.awscdk.services.cloudwatch.CustomWidget

/**
 * A CustomWidget shows the result of a AWS lambda function.
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
public class CustomWidgetDsl {
    private val cdkBuilder: CustomWidget.Builder = CustomWidget.Builder.create()

    /**
     * The Arn of the AWS Lambda function that returns HTML or JSON that will be displayed in the
     * widget.
     *
     * @param functionArn The Arn of the AWS Lambda function that returns HTML or JSON that will be
     *   displayed in the widget.
     */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets. 3 for single value widgets where most recent value
     * of a metric is displayed.
     *
     * @param height Height of the widget.
     */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /**
     * Parameters passed to the lambda function.
     *
     * Default: - no parameters are passed to the lambda function
     *
     * @param params Parameters passed to the lambda function.
     */
    public fun params(params: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(params)
        cdkBuilder.params(builder.map)
    }

    /**
     * Parameters passed to the lambda function.
     *
     * Default: - no parameters are passed to the lambda function
     *
     * @param params Parameters passed to the lambda function.
     */
    public fun params(params: Any) {
        cdkBuilder.params(params)
    }

    /**
     * The title of the widget.
     *
     * @param title The title of the widget.
     */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /**
     * Update the widget on refresh.
     *
     * Default: true
     *
     * @param updateOnRefresh Update the widget on refresh.
     */
    public fun updateOnRefresh(updateOnRefresh: Boolean) {
        cdkBuilder.updateOnRefresh(updateOnRefresh)
    }

    /**
     * Update the widget on resize.
     *
     * Default: true
     *
     * @param updateOnResize Update the widget on resize.
     */
    public fun updateOnResize(updateOnResize: Boolean) {
        cdkBuilder.updateOnResize(updateOnResize)
    }

    /**
     * Update the widget on time range change.
     *
     * Default: true
     *
     * @param updateOnTimeRangeChange Update the widget on time range change.
     */
    public fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean) {
        cdkBuilder.updateOnTimeRangeChange(updateOnTimeRangeChange)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): CustomWidget = cdkBuilder.build()
}
