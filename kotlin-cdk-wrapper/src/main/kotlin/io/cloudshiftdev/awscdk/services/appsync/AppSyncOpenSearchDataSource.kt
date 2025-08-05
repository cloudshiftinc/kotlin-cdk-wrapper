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
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_2_17)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .nodeToNodeEncryption(true)
 * .enforceHttps(true)
 * .capacity(CapacityConfig.builder()
 * .multiAzWithStandbyEnabled(false)
 * .build())
 * .ebs(EbsOptions.builder()
 * .enabled(true)
 * .volumeSize(10)
 * .build())
 * .build();
 * EventApi api = EventApi.Builder.create(this, "EventApiOpenSearch")
 * .apiName("OpenSearchEventApi")
 * .build();
 * AppSyncOpenSearchDataSource dataSource = api.addOpenSearchDataSource("opensearchds", domain);
 * ```
 */
public open class AppSyncOpenSearchDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource,
) : AppSyncBackedDataSource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncOpenSearchDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AppSyncOpenSearchDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncOpenSearchDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, AppSyncOpenSearchDataSourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.AppSyncOpenSearchDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
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
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource.Builder =
        software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource.Builder.create(scope,
        id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
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
      cdkBuilder.domain(domain.let(IDomain.Companion::unwrap))
    }

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AppSyncOpenSearchDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AppSyncOpenSearchDataSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource):
        AppSyncOpenSearchDataSource = AppSyncOpenSearchDataSource(cdkObject)

    internal fun unwrap(wrapped: AppSyncOpenSearchDataSource):
        software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource
  }
}
