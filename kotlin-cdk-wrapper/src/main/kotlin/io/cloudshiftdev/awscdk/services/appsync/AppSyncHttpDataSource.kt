@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AppSync datasource backed by a http endpoint.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * EventApi api = EventApi.Builder.create(this, "EventApiHttp")
 * .apiName("HttpEventApi")
 * .build();
 * RestApi randomApi = new RestApi(this, "RandomApi");
 * Resource randomRoute = randomApi.root.addResource("random");
 * randomRoute.addMethod("GET", MockIntegration.Builder.create()
 * .integrationResponses(List.of(IntegrationResponse.builder()
 * .statusCode("200")
 * .responseTemplates(Map.of(
 * "application/json", "my-random-value"))
 * .build()))
 * .passthroughBehavior(PassthroughBehavior.NEVER)
 * .requestTemplates(Map.of(
 * "application/json", "{ \"statusCode\": 200 }"))
 * .build(), MethodOptions.builder()
 * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
 * .build());
 * AppSyncHttpDataSource dataSource = api.addHttpDataSource("httpsource",
 * String.format("https://%s.execute-api.%s.amazonaws.com", randomApi.getRestApiId(), this.region));
 * ```
 */
public open class AppSyncHttpDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncHttpDataSource,
) : AppSyncBackedDataSource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncHttpDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.AppSyncHttpDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AppSyncHttpDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncHttpDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, AppSyncHttpDataSourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.AppSyncHttpDataSource].
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
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization. 
     */
    public fun authorizationConfig(authorizationConfig: AppSyncAwsIamConfig)

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f8d798fd118a3ed51340f4c9b904bd7026b1fe3c623c880947bf2cfb235f97d")
    public fun authorizationConfig(authorizationConfig: AppSyncAwsIamConfig.Builder.() -> Unit)

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
     */
    public fun description(description: String)

    /**
     * The http endpoint.
     *
     * @param endpoint The http endpoint. 
     */
    public fun endpoint(endpoint: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncHttpDataSource.Builder =
        software.amazon.awscdk.services.appsync.AppSyncHttpDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization. 
     */
    override fun authorizationConfig(authorizationConfig: AppSyncAwsIamConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AppSyncAwsIamConfig.Companion::unwrap))
    }

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f8d798fd118a3ed51340f4c9b904bd7026b1fe3c623c880947bf2cfb235f97d")
    override fun authorizationConfig(authorizationConfig: AppSyncAwsIamConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AppSyncAwsIamConfig(authorizationConfig))

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
     * The http endpoint.
     *
     * @param endpoint The http endpoint. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
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

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncHttpDataSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AppSyncHttpDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AppSyncHttpDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncHttpDataSource):
        AppSyncHttpDataSource = AppSyncHttpDataSource(cdkObject)

    internal fun unwrap(wrapped: AppSyncHttpDataSource):
        software.amazon.awscdk.services.appsync.AppSyncHttpDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncHttpDataSource
  }
}
