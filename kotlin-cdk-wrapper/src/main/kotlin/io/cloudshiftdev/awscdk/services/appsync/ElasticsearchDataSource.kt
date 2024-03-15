@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.elasticsearch.IDomain
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ElasticsearchDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.ElasticsearchDataSource,
) : BackedDataSource(cdkObject) {
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun description(description: String)

    @Deprecated(message = "deprecated in CDK")
    public fun domain(domain: IDomain)

    public fun name(name: String)

    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ElasticsearchDataSource.Builder
        = software.amazon.awscdk.services.appsync.ElasticsearchDataSource.Builder.create(scope, id)

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun domain(domain: IDomain) {
      cdkBuilder.domain(domain.let(IDomain::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.ElasticsearchDataSource =
        cdkBuilder.build()
  }

  public companion object {
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
