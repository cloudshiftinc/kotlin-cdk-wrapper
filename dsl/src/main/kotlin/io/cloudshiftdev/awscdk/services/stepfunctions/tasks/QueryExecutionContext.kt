package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext,
  ) : QueryExecutionContext {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): QueryExecutionContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext):
        QueryExecutionContext = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryExecutionContext):
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext = (wrapped as
        Wrapper).cdkObject
  }
}
