@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType
import software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps

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
@CdkDslMarker
public class LogQueryWidgetPropsDsl {
  private val cdkBuilder: LogQueryWidgetProps.Builder = LogQueryWidgetProps.builder()

  private val _logGroupNames: MutableList<String> = mutableListOf()

  private val _queryLines: MutableList<String> = mutableListOf()

  /**
   * @param height Height of the widget.
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * @param logGroupNames Names of log groups to query. 
   */
  public fun logGroupNames(vararg logGroupNames: String) {
    _logGroupNames.addAll(listOf(*logGroupNames))
  }

  /**
   * @param logGroupNames Names of log groups to query. 
   */
  public fun logGroupNames(logGroupNames: Collection<String>) {
    _logGroupNames.addAll(logGroupNames)
  }

  /**
   * @param queryLines A sequence of lines to use to build the query.
   * The query will be built by joining the lines together using `\n|`.
   */
  public fun queryLines(vararg queryLines: String) {
    _queryLines.addAll(listOf(*queryLines))
  }

  /**
   * @param queryLines A sequence of lines to use to build the query.
   * The query will be built by joining the lines together using `\n|`.
   */
  public fun queryLines(queryLines: Collection<String>) {
    _queryLines.addAll(queryLines)
  }

  /**
   * @param queryString Full query string for log insights.
   * Be sure to prepend every new line with a newline and pipe character
   * (`\n|`).
   */
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * @param region The region the metrics of this widget should be taken from.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param title Title for the widget.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param view The type of view to use.
   */
  public fun view(view: LogQueryVisualizationType) {
    cdkBuilder.view(view)
  }

  /**
   * @param width Width of the widget, in a grid of 24 units wide.
   */
  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): LogQueryWidgetProps {
    if(_logGroupNames.isNotEmpty()) cdkBuilder.logGroupNames(_logGroupNames)
    if(_queryLines.isNotEmpty()) cdkBuilder.queryLines(_queryLines)
    return cdkBuilder.build()
  }
}
