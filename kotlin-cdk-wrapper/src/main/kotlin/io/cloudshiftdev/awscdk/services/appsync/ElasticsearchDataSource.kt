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

/**
 * (deprecated) An Appsync datasource backed by Elasticsearch.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Domain domain;
 * GraphqlApi graphqlApi;
 * Role role;
 * ElasticsearchDataSource elasticsearchDataSource = ElasticsearchDataSource.Builder.create(this,
 * "MyElasticsearchDataSource")
 * .api(graphqlApi)
 * .domain(domain)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 *
 * * use `OpenSearchDataSource`
 */
public open class ElasticsearchDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.ElasticsearchDataSource,
) : BackedDataSource(cdkObject) {
  @Deprecated(message = "deprecated in CDK")
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ElasticsearchDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.ElasticsearchDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ElasticsearchDataSourceProps.Companion::unwrap))
  )

  @Deprecated(message = "deprecated in CDK")
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ElasticsearchDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, ElasticsearchDataSourceProps(props)
  )

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
      cdkBuilder.api(api.let(IGraphqlApi.Companion::unwrap))
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
      cdkBuilder.domain(domain.let(IDomain.Companion::unwrap))
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
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
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
        software.amazon.awscdk.services.appsync.ElasticsearchDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.ElasticsearchDataSource
  }
}
