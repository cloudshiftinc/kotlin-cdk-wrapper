@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext

@CdkDslMarker
public class QueryExecutionContextDsl {
  private val cdkBuilder: QueryExecutionContext.Builder = QueryExecutionContext.builder()

  /**
   * @param catalogName Name of catalog used in query execution.
   */
  public fun catalogName(catalogName: String) {
    cdkBuilder.catalogName(catalogName)
  }

  /**
   * @param databaseName Name of database used in query execution.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun build(): QueryExecutionContext = cdkBuilder.build()
}
