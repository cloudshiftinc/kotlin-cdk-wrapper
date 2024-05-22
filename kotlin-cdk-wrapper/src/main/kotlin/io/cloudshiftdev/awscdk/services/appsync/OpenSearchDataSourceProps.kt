@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.opensearchservice.IDomain
import kotlin.String
import kotlin.Unit

/**
 * Properties for the OpenSearch Data Source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
 * Domain domain;
 * GraphqlApi graphqlApi;
 * Role role;
 * OpenSearchDataSourceProps openSearchDataSourceProps = OpenSearchDataSourceProps.builder()
 * .api(graphqlApi)
 * .domain(domain)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
public interface OpenSearchDataSourceProps : BackedDataSourceProps {
  /**
   * The OpenSearch domain containing the endpoint for the data source.
   */
  public fun domain(): IDomain

  /**
   * A builder for [OpenSearchDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param description the description of the data source.
     */
    public fun description(description: String)

    /**
     * @param domain The OpenSearch domain containing the endpoint for the data source. 
     */
    public fun domain(domain: IDomain)

    /**
     * @param name The name of the data source.
     */
    public fun name(name: String)

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi.Companion::unwrap))
    }

    /**
     * @param description the description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domain The OpenSearch domain containing the endpoint for the data source. 
     */
    override fun domain(domain: IDomain) {
      cdkBuilder.domain(domain.let(IDomain.Companion::unwrap))
    }

    /**
     * @param name The name of the data source.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps,
  ) : CdkObject(cdkObject), OpenSearchDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    /**
     * the description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The OpenSearch domain containing the endpoint for the data source.
     */
    override fun domain(): IDomain = unwrap(this).getDomain().let(IDomain::wrap)

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OpenSearchDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps):
        OpenSearchDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? OpenSearchDataSourceProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OpenSearchDataSourceProps):
        software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps
  }
}
