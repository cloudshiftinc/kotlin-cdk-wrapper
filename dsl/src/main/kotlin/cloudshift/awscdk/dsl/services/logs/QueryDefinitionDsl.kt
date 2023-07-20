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

@CdkDslMarker
public class QueryDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: QueryDefinition.Builder = QueryDefinition.Builder.create(scope, id)

  private val _logGroups: MutableList<ILogGroup> = mutableListOf()

  public fun logGroups(vararg logGroups: ILogGroup) {
    _logGroups.addAll(listOf(*logGroups))
  }

  public fun logGroups(logGroups: Collection<ILogGroup>) {
    _logGroups.addAll(logGroups)
  }

  public fun queryDefinitionName(queryDefinitionName: String) {
    cdkBuilder.queryDefinitionName(queryDefinitionName)
  }

  public fun queryString(block: QueryStringDsl.() -> Unit = {}) {
    val builder = QueryStringDsl()
    builder.apply(block)
    cdkBuilder.queryString(builder.build())
  }

  public fun queryString(queryString: QueryString) {
    cdkBuilder.queryString(queryString)
  }

  public fun build(): QueryDefinition {
    if(_logGroups.isNotEmpty()) cdkBuilder.logGroups(_logGroups)
    return cdkBuilder.build()
  }
}
