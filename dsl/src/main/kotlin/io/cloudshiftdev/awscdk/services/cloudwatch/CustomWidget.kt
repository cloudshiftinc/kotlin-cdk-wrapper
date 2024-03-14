package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class CustomWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.CustomWidget,
) : ConcreteWidget(cdkObject) {
  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.CustomWidget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Arn of the AWS Lambda function that returns HTML or JSON that will be displayed in the
     * widget.
     *
     * @param functionArn The Arn of the AWS Lambda function that returns HTML or JSON that will be
     * displayed in the widget. 
     */
    public fun functionArn(functionArn: String)

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    public fun height(height: Number)

    /**
     * Parameters passed to the lambda function.
     *
     * Default: - no parameters are passed to the lambda function
     *
     * @param params Parameters passed to the lambda function. 
     */
    public fun params(params: Any)

    /**
     * The title of the widget.
     *
     * @param title The title of the widget. 
     */
    public fun title(title: String)

    /**
     * Update the widget on refresh.
     *
     * Default: true
     *
     * @param updateOnRefresh Update the widget on refresh. 
     */
    public fun updateOnRefresh(updateOnRefresh: Boolean)

    /**
     * Update the widget on resize.
     *
     * Default: true
     *
     * @param updateOnResize Update the widget on resize. 
     */
    public fun updateOnResize(updateOnResize: Boolean)

    /**
     * Update the widget on time range change.
     *
     * Default: true
     *
     * @param updateOnTimeRangeChange Update the widget on time range change. 
     */
    public fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean)

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CustomWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.CustomWidget.Builder.create()

    /**
     * The Arn of the AWS Lambda function that returns HTML or JSON that will be displayed in the
     * widget.
     *
     * @param functionArn The Arn of the AWS Lambda function that returns HTML or JSON that will be
     * displayed in the widget. 
     */
    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * Parameters passed to the lambda function.
     *
     * Default: - no parameters are passed to the lambda function
     *
     * @param params Parameters passed to the lambda function. 
     */
    override fun params(params: Any) {
      cdkBuilder.params(params)
    }

    /**
     * The title of the widget.
     *
     * @param title The title of the widget. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * Update the widget on refresh.
     *
     * Default: true
     *
     * @param updateOnRefresh Update the widget on refresh. 
     */
    override fun updateOnRefresh(updateOnRefresh: Boolean) {
      cdkBuilder.updateOnRefresh(updateOnRefresh)
    }

    /**
     * Update the widget on resize.
     *
     * Default: true
     *
     * @param updateOnResize Update the widget on resize. 
     */
    override fun updateOnResize(updateOnResize: Boolean) {
      cdkBuilder.updateOnResize(updateOnResize)
    }

    /**
     * Update the widget on time range change.
     *
     * Default: true
     *
     * @param updateOnTimeRangeChange Update the widget on time range change. 
     */
    override fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean) {
      cdkBuilder.updateOnTimeRangeChange(updateOnTimeRangeChange)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CustomWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomWidget {
      val builderImpl = BuilderImpl()
      return CustomWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CustomWidget):
        CustomWidget = CustomWidget(cdkObject)

    internal fun unwrap(wrapped: CustomWidget):
        software.amazon.awscdk.services.cloudwatch.CustomWidget = wrapped.cdkObject
  }
}
