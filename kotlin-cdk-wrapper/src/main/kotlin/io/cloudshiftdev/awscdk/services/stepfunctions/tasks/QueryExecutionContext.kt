@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

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
 * .executionParameters(List.of("param1", "param2"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_QueryExecutionContext.html)
 */
public interface QueryExecutionContext {
  /**
   * Name of catalog used in query execution.
   *
   * Default: - No catalog
   */
  public fun catalogName(): String? = unwrap(this).getCatalogName()

  /**
   * Name of database used in query execution.
   *
   * Default: - No database
   */
  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * A builder for [QueryExecutionContext]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalogName Name of catalog used in query execution.
     */
    public fun catalogName(catalogName: String)

    /**
     * @param databaseName Name of database used in query execution.
     */
    public fun databaseName(databaseName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext.builder()

    /**
     * @param catalogName Name of catalog used in query execution.
     */
    override fun catalogName(catalogName: String) {
      cdkBuilder.catalogName(catalogName)
    }

    /**
     * @param databaseName Name of database used in query execution.
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext,
  ) : CdkObject(cdkObject), QueryExecutionContext {
    /**
     * Name of catalog used in query execution.
     *
     * Default: - No catalog
     */
    override fun catalogName(): String? = unwrap(this).getCatalogName()

    /**
     * Name of database used in query execution.
     *
     * Default: - No database
     */
    override fun databaseName(): String? = unwrap(this).getDatabaseName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryExecutionContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext):
        QueryExecutionContext = CdkObjectWrappers.wrap(cdkObject) as? QueryExecutionContext ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryExecutionContext):
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext
  }
}
