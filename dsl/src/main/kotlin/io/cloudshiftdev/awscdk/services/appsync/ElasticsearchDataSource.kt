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
  private val cdkObject: software.amazon.awscdk.services.appsync.ElasticsearchDataSource,
) : BackedDataSource(cdkObject) {
  /**
   * (deprecated) A fluent builder for
   * [io.cloudshiftdev.awscdk.services.appsync.ElasticsearchDataSource].
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
     */
    public fun description(description: String)

    /**
     * (deprecated) The elasticsearch domain containing the endpoint for the data source.
     *
     * @param domain The elasticsearch domain containing the endpoint for the data source. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domain(domain: IDomain)

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ElasticsearchDataSource.Builder
        = software.amazon.awscdk.services.appsync.ElasticsearchDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * (deprecated) The elasticsearch domain containing the endpoint for the data source.
     *
     * @param domain The elasticsearch domain containing the endpoint for the data source. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domain(domain: IDomain) {
      cdkBuilder.domain(domain.let(IDomain::unwrap))
    }

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    override fun serviceRole(serviceRole: IRole) {
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
