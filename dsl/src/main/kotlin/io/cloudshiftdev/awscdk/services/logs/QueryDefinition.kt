package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class QueryDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.QueryDefinition,
) : Resource(cdkObject) {
  public open fun queryDefinitionId(): String = unwrap(this).getQueryDefinitionId()

  public interface Builder {
    public fun logGroups(logGroups: List<ILogGroup>)

    public fun logGroups(vararg logGroups: ILogGroup)

    public fun queryDefinitionName(queryDefinitionName: String)

    public fun queryString(queryString: QueryString)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4eaf5fbf6d9c40672ed6a0d4ad30cb03e413ed50343ede6e3f399854f51f174")
    public fun queryString(queryString: QueryString.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.QueryDefinition.Builder =
        software.amazon.awscdk.services.logs.QueryDefinition.Builder.create(scope, id)

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4eaf5fbf6d9c40672ed6a0d4ad30cb03e413ed50343ede6e3f399854f51f174")
    override fun queryString(queryString: QueryString.Builder.() -> Unit): Unit =
        queryString(QueryString(queryString))

    public fun build(): software.amazon.awscdk.services.logs.QueryDefinition = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): QueryDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return QueryDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.QueryDefinition):
        QueryDefinition = QueryDefinition(cdkObject)

    internal fun unwrap(wrapped: QueryDefinition):
        software.amazon.awscdk.services.logs.QueryDefinition = wrapped.cdkObject
  }
}
