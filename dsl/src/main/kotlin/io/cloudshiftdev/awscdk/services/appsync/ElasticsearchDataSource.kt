package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.elasticsearch.IDomain
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ElasticsearchDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.ElasticsearchDataSource,
) : BackedDataSource(cdkObject) {
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    public fun api(api: IGraphqlApi) {
    }

    public fun description(description: String) {
    }

    @Deprecated(message = "deprecated in CDK")
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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ElasticsearchDataSource.Builder
        = software.amazon.awscdk.services.appsync.ElasticsearchDataSource.Builder.create(scope, id)

    public override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun domain(domain: IDomain) {
      cdkBuilder.domain(domain.let(IDomain::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.ElasticsearchDataSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ElasticsearchDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ElasticsearchDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ElasticsearchDataSource):
        ElasticsearchDataSource = ElasticsearchDataSource(cdkObject)

    internal fun unwrap(wrapped: ElasticsearchDataSource):
        software.amazon.awscdk.services.appsync.ElasticsearchDataSource = wrapped.cdkObject
  }
}
