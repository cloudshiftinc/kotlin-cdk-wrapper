@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType
import software.amazon.awscdk.services.cloudwatch.LogQueryWidget

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
@CdkDslMarker
public class LogQueryWidgetDsl {
  private val cdkBuilder: LogQueryWidget.Builder = LogQueryWidget.Builder.create()

  private val _logGroupNames: MutableList<String> = mutableListOf()

  private val _queryLines: MutableList<String> = mutableListOf()

  /**
   * Height of the widget.
   *
   * Default: 6
   *
   * @param height Height of the widget. 
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * Names of log groups to query.
   *
   * @param logGroupNames Names of log groups to query. 
   */
  public fun logGroupNames(vararg logGroupNames: String) {
    _logGroupNames.addAll(listOf(*logGroupNames))
  }

  /**
   * Names of log groups to query.
   *
   * @param logGroupNames Names of log groups to query. 
   */
  public fun logGroupNames(logGroupNames: Collection<String>) {
    _logGroupNames.addAll(logGroupNames)
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
  public fun queryLines(vararg queryLines: String) {
    _queryLines.addAll(listOf(*queryLines))
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
  public fun queryLines(queryLines: Collection<String>) {
    _queryLines.addAll(queryLines)
  }

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
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * The region the metrics of this widget should be taken from.
   *
   * Default: Current region
   *
   * @param region The region the metrics of this widget should be taken from. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * Title for the widget.
   *
   * Default: No title
   *
   * @param title Title for the widget. 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * The type of view to use.
   *
   * Default: LogQueryVisualizationType.TABLE
   *
   * @param view The type of view to use. 
   */
  public fun view(view: LogQueryVisualizationType) {
    cdkBuilder.view(view)
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

  public fun build(): LogQueryWidget {
    if(_logGroupNames.isNotEmpty()) cdkBuilder.logGroupNames(_logGroupNames)
    if(_queryLines.isNotEmpty()) cdkBuilder.queryLines(_queryLines)
    return cdkBuilder.build()
  }
}
