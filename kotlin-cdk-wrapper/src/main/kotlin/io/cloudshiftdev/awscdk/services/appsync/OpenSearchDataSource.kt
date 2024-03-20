@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.opensearchservice.IDomain
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An Appsync datasource backed by OpenSearch.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
 * GraphqlApi api;
 * User user = new User(this, "User");
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_2_3)
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder().masterUserArn(user.getUserArn()).build())
 * .encryptionAtRest(EncryptionAtRestOptions.builder().enabled(true).build())
 * .nodeToNodeEncryption(true)
 * .enforceHttps(true)
 * .build();
 * OpenSearchDataSource ds = api.addOpenSearchDataSource("ds", domain);
 * ds.createResolver("QueryGetTestsResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getTests")
 * .requestMappingTemplate(MappingTemplate.fromString(JSON.stringify(Map.of(
 * "version", "2017-02-28",
 * "operation", "GET",
 * "path", "/id/post/_search",
 * "params", Map.of(
 * "headers", Map.of(),
 * "queryString", Map.of(),
 * "body", Map.of("from", 0, "size", 50))))))
 * .responseMappingTemplate(MappingTemplate.fromString("[\n    #foreach($entry in
 * $context.result.hits.hits)\n    #if( $velocityCount &gt; 1 ) , #end\n   
 * $utils.toJson($entry.get(\"_source\"))\n    #end\n  ]"))
 * .build());
 * ```
 */
public open class OpenSearchDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.OpenSearchDataSource,
) : BackedDataSource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OpenSearchDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.OpenSearchDataSource(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(OpenSearchDataSourceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OpenSearchDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, OpenSearchDataSourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.OpenSearchDataSource].
   */
  @CdkDslMarker
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
     * The OpenSearch domain containing the endpoint for the data source.
     *
     * @param domain The OpenSearch domain containing the endpoint for the data source. 
     */
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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.OpenSearchDataSource.Builder =
        software.amazon.awscdk.services.appsync.OpenSearchDataSource.Builder.create(scope, id)

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
     * The OpenSearch domain containing the endpoint for the data source.
     *
     * @param domain The OpenSearch domain containing the endpoint for the data source. 
     */
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

    public fun build(): software.amazon.awscdk.services.appsync.OpenSearchDataSource =
        cdkBuilder.build()
  }

  public companion object {
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
