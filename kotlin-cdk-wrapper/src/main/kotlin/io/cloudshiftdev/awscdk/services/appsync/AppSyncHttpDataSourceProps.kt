@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for an AppSync http datasource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * IApi api;
 * Role role;
 * AppSyncHttpDataSourceProps appSyncHttpDataSourceProps = AppSyncHttpDataSourceProps.builder()
 * .api(api)
 * .endpoint("endpoint")
 * // the properties below are optional
 * .authorizationConfig(AppSyncAwsIamConfig.builder()
 * .signingRegion("signingRegion")
 * .signingServiceName("signingServiceName")
 * .build())
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
public interface AppSyncHttpDataSourceProps : AppSyncBackedDataSourceProps {
  /**
   * The authorization config in case the HTTP endpoint requires authorization.
   *
   * Default: - none
   */
  public fun authorizationConfig(): AppSyncAwsIamConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AppSyncAwsIamConfig::wrap)

  /**
   * The http endpoint.
   */
  public fun endpoint(): String

  /**
   * A builder for [AppSyncHttpDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization.
     */
    public fun authorizationConfig(authorizationConfig: AppSyncAwsIamConfig)

    /**
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5349948f05de3e6cab39d3688eae9c12e0806435d6ec42070816874bad0c9790")
    public fun authorizationConfig(authorizationConfig: AppSyncAwsIamConfig.Builder.() -> Unit)

    /**
     * @param description The description of the data source.
     */
    public fun description(description: String)

    /**
     * @param endpoint The http endpoint. 
     */
    public fun endpoint(endpoint: String)

    /**
     * @param name The name of the data source.
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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
        software.amazon.awscdk.services.appsync.AppSyncHttpDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.AppSyncHttpDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization.
     */
    override fun authorizationConfig(authorizationConfig: AppSyncAwsIamConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AppSyncAwsIamConfig.Companion::unwrap))
    }

    /**
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5349948f05de3e6cab39d3688eae9c12e0806435d6ec42070816874bad0c9790")
    override fun authorizationConfig(authorizationConfig: AppSyncAwsIamConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AppSyncAwsIamConfig(authorizationConfig))

    /**
     * @param description The description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param endpoint The http endpoint. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param name The name of the data source.
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncHttpDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncHttpDataSourceProps,
  ) : CdkObject(cdkObject),
      AppSyncHttpDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IApi = unwrap(this).getApi().let(IApi::wrap)

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     */
    override fun authorizationConfig(): AppSyncAwsIamConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AppSyncAwsIamConfig::wrap)

    /**
     * The description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The http endpoint.
     */
    override fun endpoint(): String = unwrap(this).getEndpoint()

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncHttpDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncHttpDataSourceProps):
        AppSyncHttpDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        AppSyncHttpDataSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncHttpDataSourceProps):
        software.amazon.awscdk.services.appsync.AppSyncHttpDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncHttpDataSourceProps
  }
}
