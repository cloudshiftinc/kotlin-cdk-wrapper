package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.opensearchservice.IDomain
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OpenSearchDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.OpenSearchDataSource,
) : BackedDataSource(cdkObject) {
  public interface Builder {
    public fun api(api: IGraphqlApi) {
    }

    public fun description(description: String) {
    }

    public fun domain(domain: IDomain) {
    }

    public fun name(name: String) {
    }

    public fun serviceRole(serviceRole: IRole) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.OpenSearchDataSource.Builder =
        software.amazon.awscdk.services.appsync.OpenSearchDataSource.Builder.create(scope, id)

    public override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun domain(domain: IDomain) {
      cdkBuilder.domain(domain.let(IDomain::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.OpenSearchDataSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OpenSearchDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OpenSearchDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.OpenSearchDataSource):
        OpenSearchDataSource = OpenSearchDataSource(cdkObject)

    internal fun unwrap(wrapped: OpenSearchDataSource):
        software.amazon.awscdk.services.appsync.OpenSearchDataSource = wrapped.cdkObject
  }
}
