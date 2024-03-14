package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.HttpDataSource,
) : BackedDataSource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.HttpDataSource].
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
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization. 
     */
    public fun authorizationConfig(authorizationConfig: AwsIamConfig)

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f376646fae9366c6dc1996db9382743e6137ede550ab0f4f9184b191739c3321")
    public fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit)

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
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
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.HttpDataSource.Builder =
        software.amazon.awscdk.services.appsync.HttpDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization. 
     */
    override fun authorizationConfig(authorizationConfig: AwsIamConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AwsIamConfig::unwrap))
    }

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     * authorization. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f376646fae9366c6dc1996db9382743e6137ede550ab0f4f9184b191739c3321")
    override fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit): Unit =
        authorizationConfig(AwsIamConfig(authorizationConfig))

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
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.HttpDataSource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.HttpDataSource):
        HttpDataSource = HttpDataSource(cdkObject)

    internal fun unwrap(wrapped: HttpDataSource):
        software.amazon.awscdk.services.appsync.HttpDataSource = wrapped.cdkObject
  }
}
