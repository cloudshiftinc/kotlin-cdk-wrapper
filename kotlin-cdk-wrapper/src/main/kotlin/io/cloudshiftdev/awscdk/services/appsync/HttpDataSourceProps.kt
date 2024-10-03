@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * GraphqlApi graphqlApi;
 * HttpDataSourceProps httpDataSourceProps = HttpDataSourceProps.builder()
 * .api(graphqlApi)
 * .endpoint("endpoint")
 * // the properties below are optional
 * .authorizationConfig(AwsIamConfig.builder()
 * .signingRegion("signingRegion")
 * .signingServiceName("signingServiceName")
 * .build())
 * .description("description")
 * .name("name")
 * .build();
 * ```
 */
public interface HttpDataSourceProps : BaseDataSourceProps {
  /**
   * The authorization config in case the HTTP endpoint requires authorization.
   *
   * Default: - none
   */
  public fun authorizationConfig(): AwsIamConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AwsIamConfig::wrap)

  /**
   * The http endpoint.
   */
  public fun endpoint(): String

  /**
   * A builder for [HttpDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization.
     */
    public fun authorizationConfig(authorizationConfig: AwsIamConfig)

    /**
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7de9fa1e6af3efb8418623f7fbc22fde7f58e0c75cb0de3d75daa8f6dc94af34")
    public fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit)

    /**
     * @param description the description of the data source.
     */
    public fun description(description: String)

    /**
     * @param endpoint The http endpoint. 
     */
    public fun endpoint(endpoint: String)

    /**
     * @param name The name of the data source.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.HttpDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.HttpDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi.Companion::unwrap))
    }

    /**
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization.
     */
    override fun authorizationConfig(authorizationConfig: AwsIamConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AwsIamConfig.Companion::unwrap))
    }

    /**
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7de9fa1e6af3efb8418623f7fbc22fde7f58e0c75cb0de3d75daa8f6dc94af34")
    override fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit): Unit =
        authorizationConfig(AwsIamConfig(authorizationConfig))

    /**
     * @param description the description of the data source.
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
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.HttpDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.HttpDataSourceProps,
  ) : CdkObject(cdkObject),
      HttpDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     */
    override fun authorizationConfig(): AwsIamConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AwsIamConfig::wrap)

    /**
     * the description of the data source.
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
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.HttpDataSourceProps):
        HttpDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? HttpDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpDataSourceProps):
        software.amazon.awscdk.services.appsync.HttpDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.HttpDataSourceProps
  }
}
