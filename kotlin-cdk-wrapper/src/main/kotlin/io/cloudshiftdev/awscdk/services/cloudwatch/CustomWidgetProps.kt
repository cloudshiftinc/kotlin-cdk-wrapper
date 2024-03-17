@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * The properties for a CustomWidget.
 *
 * Example:
 *
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
public interface CustomWidgetProps {
  /**
   * The Arn of the AWS Lambda function that returns HTML or JSON that will be displayed in the
   * widget.
   */
  public fun functionArn(): String

  /**
   * Height of the widget.
   *
   * Default: - 6 for Alarm and Graph widgets.
   * 3 for single value widgets where most recent value of a metric is displayed.
   */
  public fun height(): Number? = unwrap(this).getHeight()

  /**
   * Parameters passed to the lambda function.
   *
   * Default: - no parameters are passed to the lambda function
   */
  public fun params(): Any? = unwrap(this).getParams()

  /**
   * The title of the widget.
   */
  public fun title(): String

  /**
   * Update the widget on refresh.
   *
   * Default: true
   */
  public fun updateOnRefresh(): Boolean? = unwrap(this).getUpdateOnRefresh()

  /**
   * Update the widget on resize.
   *
   * Default: true
   */
  public fun updateOnResize(): Boolean? = unwrap(this).getUpdateOnResize()

  /**
   * Update the widget on time range change.
   *
   * Default: true
   */
  public fun updateOnTimeRangeChange(): Boolean? = unwrap(this).getUpdateOnTimeRangeChange()

  /**
   * Width of the widget, in a grid of 24 units wide.
   *
   * Default: 6
   */
  public fun width(): Number? = unwrap(this).getWidth()

  /**
   * A builder for [CustomWidgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param functionArn The Arn of the AWS Lambda function that returns HTML or JSON that will be
     * displayed in the widget. 
     */
    public fun functionArn(functionArn: String)

    /**
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param params Parameters passed to the lambda function.
     */
    public fun params(params: Any)

    /**
     * @param title The title of the widget. 
     */
    public fun title(title: String)

    /**
     * @param updateOnRefresh Update the widget on refresh.
     */
    public fun updateOnRefresh(updateOnRefresh: Boolean)

    /**
     * @param updateOnResize Update the widget on resize.
     */
    public fun updateOnResize(updateOnResize: Boolean)

    /**
     * @param updateOnTimeRangeChange Update the widget on time range change.
     */
    public fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CustomWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CustomWidgetProps.builder()

    /**
     * @param functionArn The Arn of the AWS Lambda function that returns HTML or JSON that will be
     * displayed in the widget. 
     */
    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param height Height of the widget.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param params Parameters passed to the lambda function.
     */
    override fun params(params: Any) {
      cdkBuilder.params(params)
    }

    /**
     * @param title The title of the widget. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * @param updateOnRefresh Update the widget on refresh.
     */
    override fun updateOnRefresh(updateOnRefresh: Boolean) {
      cdkBuilder.updateOnRefresh(updateOnRefresh)
    }

    /**
     * @param updateOnResize Update the widget on resize.
     */
    override fun updateOnResize(updateOnResize: Boolean) {
      cdkBuilder.updateOnResize(updateOnResize)
    }

    /**
     * @param updateOnTimeRangeChange Update the widget on time range change.
     */
    override fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean) {
      cdkBuilder.updateOnTimeRangeChange(updateOnTimeRangeChange)
    }

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CustomWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CustomWidgetProps,
  ) : CdkObject(cdkObject), CustomWidgetProps {
    /**
     * The Arn of the AWS Lambda function that returns HTML or JSON that will be displayed in the
     * widget.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * Parameters passed to the lambda function.
     *
     * Default: - no parameters are passed to the lambda function
     */
    override fun params(): Any? = unwrap(this).getParams()

    /**
     * The title of the widget.
     */
    override fun title(): String = unwrap(this).getTitle()

    /**
     * Update the widget on refresh.
     *
     * Default: true
     */
    override fun updateOnRefresh(): Boolean? = unwrap(this).getUpdateOnRefresh()

    /**
     * Update the widget on resize.
     *
     * Default: true
     */
    override fun updateOnResize(): Boolean? = unwrap(this).getUpdateOnResize()

    /**
     * Update the widget on time range change.
     *
     * Default: true
     */
    override fun updateOnTimeRangeChange(): Boolean? = unwrap(this).getUpdateOnTimeRangeChange()

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     */
    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CustomWidgetProps):
        CustomWidgetProps = CdkObjectWrappers.wrap(cdkObject) as? CustomWidgetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomWidgetProps):
        software.amazon.awscdk.services.cloudwatch.CustomWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CustomWidgetProps
  }
}
