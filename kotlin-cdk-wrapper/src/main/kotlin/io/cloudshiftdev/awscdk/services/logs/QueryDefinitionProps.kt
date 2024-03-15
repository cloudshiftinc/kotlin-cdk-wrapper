@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface QueryDefinitionProps {
  public fun logGroups(): List<ILogGroup> = unwrap(this).getLogGroups()?.map(ILogGroup::wrap) ?:
      emptyList()

  public fun queryDefinitionName(): String

  public fun queryString(): QueryString

  @CdkDslMarker
  public interface Builder {
    public fun logGroups(logGroups: List<ILogGroup>)

    public fun logGroups(vararg logGroups: ILogGroup)

    public fun queryDefinitionName(queryDefinitionName: String)

    public fun queryString(queryString: QueryString)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f58b9dc8df8cb31b405726ee0019b3c8c2b55d72d9c6d481928fd7f1e7fce093")
    public fun queryString(queryString: QueryString.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.QueryDefinitionProps.Builder =
        software.amazon.awscdk.services.logs.QueryDefinitionProps.builder()

    override fun logGroups(logGroups: List<ILogGroup>) {
      cdkBuilder.logGroups(logGroups.map(ILogGroup::unwrap))
    }

    override fun logGroups(vararg logGroups: ILogGroup): Unit = logGroups(logGroups.toList())

    override fun queryDefinitionName(queryDefinitionName: String) {
      cdkBuilder.queryDefinitionName(queryDefinitionName)
    }

    override fun queryString(queryString: QueryString) {
      cdkBuilder.queryString(queryString.let(QueryString::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f58b9dc8df8cb31b405726ee0019b3c8c2b55d72d9c6d481928fd7f1e7fce093")
    override fun queryString(queryString: QueryString.Builder.() -> Unit): Unit =
        queryString(QueryString(queryString))

    public fun build(): software.amazon.awscdk.services.logs.QueryDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.QueryDefinitionProps,
  ) : CdkObject(cdkObject), QueryDefinitionProps {
    override fun logGroups(): List<ILogGroup> = unwrap(this).getLogGroups()?.map(ILogGroup::wrap) ?:
        emptyList()

    override fun queryDefinitionName(): String = unwrap(this).getQueryDefinitionName()

    override fun queryString(): QueryString = unwrap(this).getQueryString().let(QueryString::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.QueryDefinitionProps):
        QueryDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryDefinitionProps):
        software.amazon.awscdk.services.logs.QueryDefinitionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.QueryDefinitionProps
  }
}
