@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.QueryStringProps

/**
 * Properties for a QueryString.
 *
 * Example:
 *
 * ```
 * QueryDefinition.Builder.create(this, "QueryDefinition")
 * .queryDefinitionName("MyQuery")
 * .queryString(QueryString.Builder.create()
 * .fields(List.of("&#64;timestamp", "&#64;message"))
 * .parseStatements(List.of("&#64;message \"[*] *\" as loggingType, loggingMessage", "&#64;message
 * \"&lt;*&gt;: *\" as differentLoggingType, differentLoggingMessage"))
 * .filterStatements(List.of("loggingType = \"ERROR\"", "loggingMessage = \"A very strange error
 * occurred!\""))
 * .sort("&#64;timestamp desc")
 * .limit(20)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class QueryStringPropsDsl {
  private val cdkBuilder: QueryStringProps.Builder = QueryStringProps.builder()

  private val _fields: MutableList<String> = mutableListOf()

  private val _filterStatements: MutableList<String> = mutableListOf()

  private val _parseStatements: MutableList<String> = mutableListOf()

  /**
   * @param display Specifies which fields to display in the query results.
   */
  public fun display(display: String) {
    cdkBuilder.display(display)
  }

  /**
   * @param fields Retrieves the specified fields from log events for display.
   */
  public fun fields(vararg fields: String) {
    _fields.addAll(listOf(*fields))
  }

  /**
   * @param fields Retrieves the specified fields from log events for display.
   */
  public fun fields(fields: Collection<String>) {
    _fields.addAll(fields)
  }

  /**
   * @param filter A single statement for filtering the results of a query based on a boolean
   * expression.
   * @deprecated Use `filterStatements` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun filter(filter: String) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param filterStatements An array of one or more statements for filtering the results of a query
   * based on a boolean expression.
   * Each provided statement generates a separate filter line in the query string.
   *
   * Note: If provided, this property overrides any value provided for the `filter` property.
   */
  public fun filterStatements(vararg filterStatements: String) {
    _filterStatements.addAll(listOf(*filterStatements))
  }

  /**
   * @param filterStatements An array of one or more statements for filtering the results of a query
   * based on a boolean expression.
   * Each provided statement generates a separate filter line in the query string.
   *
   * Note: If provided, this property overrides any value provided for the `filter` property.
   */
  public fun filterStatements(filterStatements: Collection<String>) {
    _filterStatements.addAll(filterStatements)
  }

  /**
   * @param limit Specifies the number of log events returned by the query.
   */
  public fun limit(limit: Number) {
    cdkBuilder.limit(limit)
  }

  /**
   * @param parse A single statement for parsing data from a log field and creating ephemeral fields
   * that can be processed further in the query.
   * @deprecated Use `parseStatements` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun parse(parse: String) {
    cdkBuilder.parse(parse)
  }

  /**
   * @param parseStatements An array of one or more statements for parsing data from a log field and
   * creating ephemeral fields that can be processed further in the query.
   * Each provided statement generates a separate
   * parse line in the query string.
   *
   * Note: If provided, this property overrides any value provided for the `parse` property.
   */
  public fun parseStatements(vararg parseStatements: String) {
    _parseStatements.addAll(listOf(*parseStatements))
  }

  /**
   * @param parseStatements An array of one or more statements for parsing data from a log field and
   * creating ephemeral fields that can be processed further in the query.
   * Each provided statement generates a separate
   * parse line in the query string.
   *
   * Note: If provided, this property overrides any value provided for the `parse` property.
   */
  public fun parseStatements(parseStatements: Collection<String>) {
    _parseStatements.addAll(parseStatements)
  }

  /**
   * @param sort Sorts the retrieved log events.
   */
  public fun sort(sort: String) {
    cdkBuilder.sort(sort)
  }

  /**
   * @param stats Uses log field values to calculate aggregate statistics.
   */
  public fun stats(stats: String) {
    cdkBuilder.stats(stats)
  }

  public fun build(): QueryStringProps {
    if(_fields.isNotEmpty()) cdkBuilder.fields(_fields)
    if(_filterStatements.isNotEmpty()) cdkBuilder.filterStatements(_filterStatements)
    if(_parseStatements.isNotEmpty()) cdkBuilder.parseStatements(_parseStatements)
    return cdkBuilder.build()
  }
}
