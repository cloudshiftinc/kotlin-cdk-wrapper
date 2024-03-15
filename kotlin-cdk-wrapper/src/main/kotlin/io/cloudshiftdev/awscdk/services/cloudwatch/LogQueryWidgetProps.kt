@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a Query widget.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(LogQueryWidget.Builder.create()
 * .logGroupNames(List.of("my-log-group"))
 * .view(LogQueryVisualizationType.TABLE)
 * // The lines will be automatically combined using '\n|'.
 * .queryLines(List.of("fields &#64;message", "filter &#64;message like /Error/"))
 * .build());
 * ```
 */
public interface LogQueryWidgetProps {
  /**
   * Height of the widget.
   *
   * Default: 6
   */
  public fun height(): Number? = unwrap(this).getHeight()

  /**
   * Names of log groups to query.
   */
  public fun logGroupNames(): List<String>

  /**
   * A sequence of lines to use to build the query.
   *
   * The query will be built by joining the lines together using `\n|`.
   *
   * Default: - Exactly one of `queryString`, `queryLines` is required.
   */
  public fun queryLines(): List<String> = unwrap(this).getQueryLines() ?: emptyList()

  /**
   * Full query string for log insights.
   *
   * Be sure to prepend every new line with a newline and pipe character
   * (`\n|`).
   *
   * Default: - Exactly one of `queryString`, `queryLines` is required.
   */
  public fun queryString(): String? = unwrap(this).getQueryString()

  /**
   * The region the metrics of this widget should be taken from.
   *
   * Default: Current region
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Title for the widget.
   *
   * Default: No title
   */
  public fun title(): String? = unwrap(this).getTitle()

  /**
   * The type of view to use.
   *
   * Default: LogQueryVisualizationType.TABLE
   */
  public fun view(): LogQueryVisualizationType? =
      unwrap(this).getView()?.let(LogQueryVisualizationType::wrap)

  /**
   * Width of the widget, in a grid of 24 units wide.
   *
   * Default: 6
   */
  public fun width(): Number? = unwrap(this).getWidth()

  /**
   * A builder for [LogQueryWidgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param logGroupNames Names of log groups to query. 
     */
    public fun logGroupNames(logGroupNames: List<String>)

    /**
     * @param logGroupNames Names of log groups to query. 
     */
    public fun logGroupNames(vararg logGroupNames: String)

    /**
     * @param queryLines A sequence of lines to use to build the query.
     * The query will be built by joining the lines together using `\n|`.
     */
    public fun queryLines(queryLines: List<String>)

    /**
     * @param queryLines A sequence of lines to use to build the query.
     * The query will be built by joining the lines together using `\n|`.
     */
    public fun queryLines(vararg queryLines: String)

    /**
     * @param queryString Full query string for log insights.
     * Be sure to prepend every new line with a newline and pipe character
     * (`\n|`).
     */
    public fun queryString(queryString: String)

    /**
     * @param region The region the metrics of this widget should be taken from.
     */
    public fun region(region: String)

    /**
     * @param title Title for the widget.
     */
    public fun title(title: String)

    /**
     * @param view The type of view to use.
     */
    public fun view(view: LogQueryVisualizationType)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps.builder()

    /**
     * @param height Height of the widget.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param logGroupNames Names of log groups to query. 
     */
    override fun logGroupNames(logGroupNames: List<String>) {
      cdkBuilder.logGroupNames(logGroupNames)
    }

    /**
     * @param logGroupNames Names of log groups to query. 
     */
    override fun logGroupNames(vararg logGroupNames: String): Unit =
        logGroupNames(logGroupNames.toList())

    /**
     * @param queryLines A sequence of lines to use to build the query.
     * The query will be built by joining the lines together using `\n|`.
     */
    override fun queryLines(queryLines: List<String>) {
      cdkBuilder.queryLines(queryLines)
    }

    /**
     * @param queryLines A sequence of lines to use to build the query.
     * The query will be built by joining the lines together using `\n|`.
     */
    override fun queryLines(vararg queryLines: String): Unit = queryLines(queryLines.toList())

    /**
     * @param queryString Full query string for log insights.
     * Be sure to prepend every new line with a newline and pipe character
     * (`\n|`).
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * @param region The region the metrics of this widget should be taken from.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param title Title for the widget.
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * @param view The type of view to use.
     */
    override fun view(view: LogQueryVisualizationType) {
      cdkBuilder.view(view.let(LogQueryVisualizationType::unwrap))
    }

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps,
  ) : CdkObject(cdkObject), LogQueryWidgetProps {
    /**
     * Height of the widget.
     *
     * Default: 6
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * Names of log groups to query.
     */
    override fun logGroupNames(): List<String> = unwrap(this).getLogGroupNames()

    /**
     * A sequence of lines to use to build the query.
     *
     * The query will be built by joining the lines together using `\n|`.
     *
     * Default: - Exactly one of `queryString`, `queryLines` is required.
     */
    override fun queryLines(): List<String> = unwrap(this).getQueryLines() ?: emptyList()

    /**
     * Full query string for log insights.
     *
     * Be sure to prepend every new line with a newline and pipe character
     * (`\n|`).
     *
     * Default: - Exactly one of `queryString`, `queryLines` is required.
     */
    override fun queryString(): String? = unwrap(this).getQueryString()

    /**
     * The region the metrics of this widget should be taken from.
     *
     * Default: Current region
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Title for the widget.
     *
     * Default: No title
     */
    override fun title(): String? = unwrap(this).getTitle()

    /**
     * The type of view to use.
     *
     * Default: LogQueryVisualizationType.TABLE
     */
    override fun view(): LogQueryVisualizationType? =
        unwrap(this).getView()?.let(LogQueryVisualizationType::wrap)

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     */
    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogQueryWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps):
        LogQueryWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogQueryWidgetProps):
        software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps
  }
}
