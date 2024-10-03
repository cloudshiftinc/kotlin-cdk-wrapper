@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define an EventBridge Api Destination.
 *
 * Example:
 *
 * ```
 * Connection connection = Connection.Builder.create(this, "Connection")
 * .authorization(Authorization.apiKey("x-api-key", SecretValue.secretsManager("ApiSecretName")))
 * .description("Connection with API Key x-api-key")
 * .build();
 * ApiDestination destination = ApiDestination.Builder.create(this, "Destination")
 * .connection(connection)
 * .endpoint("https://example.com")
 * .description("Calling example.com with API key x-api-key")
 * .build();
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.minutes(1)))
 * .targets(List.of(new ApiDestination(destination)))
 * .build();
 * ```
 */
public open class ApiDestination(
  cdkObject: software.amazon.awscdk.services.events.ApiDestination,
) : Resource(cdkObject),
    IApiDestination {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApiDestinationProps,
  ) :
      this(software.amazon.awscdk.services.events.ApiDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ApiDestinationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApiDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, ApiDestinationProps(props)
  )

  /**
   * The ARN of the Api Destination created.
   */
  public override fun apiDestinationArn(): String = unwrap(this).getApiDestinationArn()

  /**
   * The Name of the Api Destination created.
   */
  public override fun apiDestinationName(): String = unwrap(this).getApiDestinationName()

  /**
   * The Connection to associate with Api Destination.
   */
  public open fun connection(): IConnection = unwrap(this).getConnection().let(IConnection::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.ApiDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name for the API destination.
     *
     * Default: - A unique name will be generated
     *
     * @param apiDestinationName The name for the API destination. 
     */
    public fun apiDestinationName(apiDestinationName: String)

    /**
     * The ARN of the connection to use for the API destination.
     *
     * @param connection The ARN of the connection to use for the API destination. 
     */
    public fun connection(connection: IConnection)

    /**
     * A description for the API destination.
     *
     * Default: - none
     *
     * @param description A description for the API destination. 
     */
    public fun description(description: String)

    /**
     * The URL to the HTTP invocation endpoint for the API destination..
     *
     * @param endpoint The URL to the HTTP invocation endpoint for the API destination.. 
     */
    public fun endpoint(endpoint: String)

    /**
     * The method to use for the request to the HTTP invocation endpoint.
     *
     * Default: HttpMethod.POST
     *
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint. 
     */
    public fun httpMethod(httpMethod: HttpMethod)

    /**
     * The maximum number of requests per second to send to the HTTP invocation endpoint.
     *
     * Default: - Not rate limited
     *
     * @param rateLimitPerSecond The maximum number of requests per second to send to the HTTP
     * invocation endpoint. 
     */
    public fun rateLimitPerSecond(rateLimitPerSecond: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ApiDestination.Builder =
        software.amazon.awscdk.services.events.ApiDestination.Builder.create(scope, id)

    /**
     * The name for the API destination.
     *
     * Default: - A unique name will be generated
     *
     * @param apiDestinationName The name for the API destination. 
     */
    override fun apiDestinationName(apiDestinationName: String) {
      cdkBuilder.apiDestinationName(apiDestinationName)
    }

    /**
     * The ARN of the connection to use for the API destination.
     *
     * @param connection The ARN of the connection to use for the API destination. 
     */
    override fun connection(connection: IConnection) {
      cdkBuilder.connection(connection.let(IConnection.Companion::unwrap))
    }

    /**
     * A description for the API destination.
     *
     * Default: - none
     *
     * @param description A description for the API destination. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The URL to the HTTP invocation endpoint for the API destination..
     *
     * @param endpoint The URL to the HTTP invocation endpoint for the API destination.. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    /**
     * The method to use for the request to the HTTP invocation endpoint.
     *
     * Default: HttpMethod.POST
     *
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint. 
     */
    override fun httpMethod(httpMethod: HttpMethod) {
      cdkBuilder.httpMethod(httpMethod.let(HttpMethod.Companion::unwrap))
    }

    /**
     * The maximum number of requests per second to send to the HTTP invocation endpoint.
     *
     * Default: - Not rate limited
     *
     * @param rateLimitPerSecond The maximum number of requests per second to send to the HTTP
     * invocation endpoint. 
     */
    override fun rateLimitPerSecond(rateLimitPerSecond: Number) {
      cdkBuilder.rateLimitPerSecond(rateLimitPerSecond)
    }

    public fun build(): software.amazon.awscdk.services.events.ApiDestination = cdkBuilder.build()
  }

  public companion object {
    public fun fromApiDestinationAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApiDestinationAttributes,
    ): ApiDestination =
        software.amazon.awscdk.services.events.ApiDestination.fromApiDestinationAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(ApiDestinationAttributes.Companion::unwrap)).let(ApiDestination::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("555db03fe6c1e0ea8e62fe11367c8590c1425c7d00d3e6b69c0db2fb4cdde494")
    public fun fromApiDestinationAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApiDestinationAttributes.Builder.() -> Unit,
    ): ApiDestination = fromApiDestinationAttributes(scope, id, ApiDestinationAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApiDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApiDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ApiDestination):
        ApiDestination = ApiDestination(cdkObject)

    internal fun unwrap(wrapped: ApiDestination):
        software.amazon.awscdk.services.events.ApiDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.events.ApiDestination
  }
}
