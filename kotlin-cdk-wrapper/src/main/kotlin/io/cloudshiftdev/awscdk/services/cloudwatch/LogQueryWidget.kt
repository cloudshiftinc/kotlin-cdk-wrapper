@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Display query results from Logs Insights.
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
public open class LogQueryWidget(
  cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryWidget,
) : ConcreteWidget(cdkObject) {
  public constructor(props: LogQueryWidgetProps) :
      this(software.amazon.awscdk.services.cloudwatch.LogQueryWidget(props.let(LogQueryWidgetProps.Companion::unwrap))
  )

  public constructor(props: LogQueryWidgetProps.Builder.() -> Unit) :
      this(LogQueryWidgetProps(props)
  )

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.LogQueryWidget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID where the log groups are located.
     *
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     *
     * Default: - Current account
     *
     * @param accountId The AWS account ID where the log groups are located. 
     */
    public fun accountId(accountId: String)

    /**
     * Height of the widget.
     *
     * Default: 6
     *
     * @param height Height of the widget. 
     */
    public fun height(height: Number)

    /**
     * Names of log groups to query.
     *
     * @param logGroupNames Names of log groups to query. 
     */
    public fun logGroupNames(logGroupNames: List<String>)

    /**
     * Names of log groups to query.
     *
     * @param logGroupNames Names of log groups to query. 
     */
    public fun logGroupNames(vararg logGroupNames: String)

    /**
     * The query language to use for the query.
     *
     * Default: LogQueryLanguage.LOGS_INSIGHTS
     *
     * @param queryLanguage The query language to use for the query. 
     */
    public fun queryLanguage(queryLanguage: LogQueryLanguage)

    /**
     * A sequence of lines to use to build the query.
     *
     * The query will be built by joining the lines together using `\n|`.
     *
     * Default: - Exactly one of `queryString`, `queryLines` is required.
     *
     * @param queryLines A sequence of lines to use to build the query. 
     */
    public fun queryLines(queryLines: List<String>)

    /**
     * A sequence of lines to use to build the query.
     *
     * The query will be built by joining the lines together using `\n|`.
     *
     * Default: - Exactly one of `queryString`, `queryLines` is required.
     *
     * @param queryLines A sequence of lines to use to build the query. 
     */
    public fun queryLines(vararg queryLines: String)

    /**
     * Full query string for log insights.
     *
     * Be sure to prepend every new line with a newline and pipe character
     * (`\n|`).
     *
     * Default: - Exactly one of `queryString`, `queryLines` is required.
     *
     * @param queryString Full query string for log insights. 
     */
    public fun queryString(queryString: String)

    /**
     * The region the metrics of this widget should be taken from.
     *
     * Default: Current region
     *
     * @param region The region the metrics of this widget should be taken from. 
     */
    public fun region(region: String)

    /**
     * Title for the widget.
     *
     * Default: No title
     *
     * @param title Title for the widget. 
     */
    public fun title(title: String)

    /**
     * The type of view to use.
     *
     * Default: LogQueryVisualizationType.TABLE
     *
     * @param view The type of view to use. 
     */
    public fun view(view: LogQueryVisualizationType)

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.LogQueryWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.LogQueryWidget.Builder.create()

    /**
     * The AWS account ID where the log groups are located.
     *
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     *
     * Default: - Current account
     *
     * @param accountId The AWS account ID where the log groups are located. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * Height of the widget.
     *
     * Default: 6
     *
     * @param height Height of the widget. 
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * Names of log groups to query.
     *
     * @param logGroupNames Names of log groups to query. 
     */
    override fun logGroupNames(logGroupNames: List<String>) {
      cdkBuilder.logGroupNames(logGroupNames)
    }

    /**
     * Names of log groups to query.
     *
     * @param logGroupNames Names of log groups to query. 
     */
    override fun logGroupNames(vararg logGroupNames: String): Unit =
        logGroupNames(logGroupNames.toList())

    /**
     * The query language to use for the query.
     *
     * Default: LogQueryLanguage.LOGS_INSIGHTS
     *
     * @param queryLanguage The query language to use for the query. 
     */
    override fun queryLanguage(queryLanguage: LogQueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(LogQueryLanguage.Companion::unwrap))
    }

    /**
     * A sequence of lines to use to build the query.
     *
     * The query will be built by joining the lines together using `\n|`.
     *
     * Default: - Exactly one of `queryString`, `queryLines` is required.
     *
     * @param queryLines A sequence of lines to use to build the query. 
     */
    override fun queryLines(queryLines: List<String>) {
      cdkBuilder.queryLines(queryLines)
    }

    /**
     * A sequence of lines to use to build the query.
     *
     * The query will be built by joining the lines together using `\n|`.
     *
     * Default: - Exactly one of `queryString`, `queryLines` is required.
     *
     * @param queryLines A sequence of lines to use to build the query. 
     */
    override fun queryLines(vararg queryLines: String): Unit = queryLines(queryLines.toList())

    /**
     * Full query string for log insights.
     *
     * Be sure to prepend every new line with a newline and pipe character
     * (`\n|`).
     *
     * Default: - Exactly one of `queryString`, `queryLines` is required.
     *
     * @param queryString Full query string for log insights. 
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * The region the metrics of this widget should be taken from.
     *
     * Default: Current region
     *
     * @param region The region the metrics of this widget should be taken from. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * Title for the widget.
     *
     * Default: No title
     *
     * @param title Title for the widget. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * The type of view to use.
     *
     * Default: LogQueryVisualizationType.TABLE
     *
     * @param view The type of view to use. 
     */
    override fun view(view: LogQueryVisualizationType) {
      cdkBuilder.view(view.let(LogQueryVisualizationType.Companion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.LogQueryWidget =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogQueryWidget {
      val builderImpl = BuilderImpl()
      return LogQueryWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryWidget):
        LogQueryWidget = LogQueryWidget(cdkObject)

    internal fun unwrap(wrapped: LogQueryWidget):
        software.amazon.awscdk.services.cloudwatch.LogQueryWidget = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.LogQueryWidget
  }
}
