package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NoneDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.NoneDataSource,
) : BaseDataSource(cdkObject) {
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.NoneDataSource.Builder =
        software.amazon.awscdk.services.appsync.NoneDataSource.Builder.create(scope, id)

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.NoneDataSource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NoneDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NoneDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.NoneDataSource):
        NoneDataSource = NoneDataSource(cdkObject)

    internal fun unwrap(wrapped: NoneDataSource):
        software.amazon.awscdk.services.appsync.NoneDataSource = wrapped.cdkObject
  }
}
