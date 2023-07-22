@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext

/**
 * Database and data catalog context in which the query execution occurs.
 *
 * Example:
 *
 * ```
 * AthenaStartQueryExecution startQueryExecutionJob = AthenaStartQueryExecution.Builder.create(this,
 * "Start Athena Query")
 * .queryString(JsonPath.stringAt("$.queryString"))
 * .queryExecutionContext(QueryExecutionContext.builder()
 * .databaseName("mydatabase")
 * .build())
 * .resultConfiguration(ResultConfiguration.builder()
 * .encryptionConfiguration(EncryptionConfiguration.builder()
 * .encryptionOption(EncryptionOption.S3_MANAGED)
 * .build())
 * .outputLocation(Location.builder()
 * .bucketName("query-results-bucket")
 * .objectKey("folder")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_QueryExecutionContext.html)
 */
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
