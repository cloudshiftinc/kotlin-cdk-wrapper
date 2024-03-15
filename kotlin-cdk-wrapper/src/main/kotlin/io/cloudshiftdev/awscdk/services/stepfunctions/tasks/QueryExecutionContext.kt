@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface QueryExecutionContext {
  public fun catalogName(): String? = unwrap(this).getCatalogName()

  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  @CdkDslMarker
  public interface Builder {
    public fun catalogName(catalogName: String)

    public fun databaseName(databaseName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext.builder()

    override fun catalogName(catalogName: String) {
      cdkBuilder.catalogName(catalogName)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext,
  ) : CdkObject(cdkObject), QueryExecutionContext {
    override fun catalogName(): String? = unwrap(this).getCatalogName()

    override fun databaseName(): String? = unwrap(this).getDatabaseName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryExecutionContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext):
        QueryExecutionContext = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryExecutionContext):
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext
  }
}
