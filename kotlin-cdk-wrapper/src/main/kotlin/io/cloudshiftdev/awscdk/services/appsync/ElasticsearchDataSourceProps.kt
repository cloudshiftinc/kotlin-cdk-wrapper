@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.elasticsearch.IDomain
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface ElasticsearchDataSourceProps : BackedDataSourceProps {
  @Deprecated(message = "deprecated in CDK")
  public fun domain(): IDomain

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps.builder()

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

    public fun build(): software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps,
  ) : CdkObject(cdkObject), ElasticsearchDataSourceProps {
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    @Deprecated(message = "deprecated in CDK")
    override fun domain(): IDomain = unwrap(this).getDomain().let(IDomain::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ElasticsearchDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps):
        ElasticsearchDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ElasticsearchDataSourceProps):
        software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps
  }
}
