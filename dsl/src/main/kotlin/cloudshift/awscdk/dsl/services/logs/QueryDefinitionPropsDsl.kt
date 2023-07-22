@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.QueryDefinitionProps
import software.amazon.awscdk.services.logs.QueryString

@CdkDslMarker
public class QueryDefinitionPropsDsl {
  private val cdkBuilder: QueryDefinitionProps.Builder = QueryDefinitionProps.builder()

  private val _logGroups: MutableList<ILogGroup> = mutableListOf()

  /**
   * @param logGroups Specify certain log groups for the query definition.
   */
  public fun logGroups(vararg logGroups: ILogGroup) {
    _logGroups.addAll(listOf(*logGroups))
  }

  /**
   * @param logGroups Specify certain log groups for the query definition.
   */
  public fun logGroups(logGroups: Collection<ILogGroup>) {
    _logGroups.addAll(logGroups)
  }

  /**
   * @param queryDefinitionName Name of the query definition. 
   */
  public fun queryDefinitionName(queryDefinitionName: String) {
    cdkBuilder.queryDefinitionName(queryDefinitionName)
  }

  /**
   * @param queryString The query string to use for this query definition. 
   */
  public fun queryString(queryString: QueryStringDsl.() -> Unit = {}) {
    val builder = QueryStringDsl()
    builder.apply(queryString)
    cdkBuilder.queryString(builder.build())
  }

  /**
   * @param queryString The query string to use for this query definition. 
   */
  public fun queryString(queryString: QueryString) {
    cdkBuilder.queryString(queryString)
  }

  public fun build(): QueryDefinitionProps {
    if(_logGroups.isNotEmpty()) cdkBuilder.logGroups(_logGroups)
    return cdkBuilder.build()
  }
}
