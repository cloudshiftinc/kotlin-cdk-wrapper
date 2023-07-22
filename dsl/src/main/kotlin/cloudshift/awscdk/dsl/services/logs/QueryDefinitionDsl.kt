@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.QueryDefinition
import software.amazon.awscdk.services.logs.QueryString
import software.constructs.Construct

/**
 * Define a query definition for CloudWatch Logs Insights.
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
public class QueryDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: QueryDefinition.Builder = QueryDefinition.Builder.create(scope, id)

  private val _logGroups: MutableList<ILogGroup> = mutableListOf()

  /**
   * Specify certain log groups for the query definition.
   *
   * Default: - no specified log groups
   *
   * @param logGroups Specify certain log groups for the query definition. 
   */
  public fun logGroups(vararg logGroups: ILogGroup) {
    _logGroups.addAll(listOf(*logGroups))
  }

  /**
   * Specify certain log groups for the query definition.
   *
   * Default: - no specified log groups
   *
   * @param logGroups Specify certain log groups for the query definition. 
   */
  public fun logGroups(logGroups: Collection<ILogGroup>) {
    _logGroups.addAll(logGroups)
  }

  /**
   * Name of the query definition.
   *
   * @param queryDefinitionName Name of the query definition. 
   */
  public fun queryDefinitionName(queryDefinitionName: String) {
    cdkBuilder.queryDefinitionName(queryDefinitionName)
  }

  /**
   * The query string to use for this query definition.
   *
   * @param queryString The query string to use for this query definition. 
   */
  public fun queryString(queryString: QueryStringDsl.() -> Unit = {}) {
    val builder = QueryStringDsl()
    builder.apply(queryString)
    cdkBuilder.queryString(builder.build())
  }

  /**
   * The query string to use for this query definition.
   *
   * @param queryString The query string to use for this query definition. 
   */
  public fun queryString(queryString: QueryString) {
    cdkBuilder.queryString(queryString)
  }

  public fun build(): QueryDefinition {
    if(_logGroups.isNotEmpty()) cdkBuilder.logGroups(_logGroups)
    return cdkBuilder.build()
  }
}
