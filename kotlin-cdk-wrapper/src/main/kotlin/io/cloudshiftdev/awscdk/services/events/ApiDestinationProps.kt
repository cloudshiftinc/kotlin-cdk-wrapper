@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * The event API Destination properties.
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
public interface ApiDestinationProps {
  /**
   * The name for the API destination.
   *
   * Default: - A unique name will be generated
   */
  public fun apiDestinationName(): String? = unwrap(this).getApiDestinationName()

  /**
   * The ARN of the connection to use for the API destination.
   */
  public fun connection(): IConnection

  /**
   * A description for the API destination.
   *
   * Default: - none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The URL to the HTTP invocation endpoint for the API destination..
   */
  public fun endpoint(): String

  /**
   * The method to use for the request to the HTTP invocation endpoint.
   *
   * Default: HttpMethod.POST
   */
  public fun httpMethod(): HttpMethod? = unwrap(this).getHttpMethod()?.let(HttpMethod::wrap)

  /**
   * The maximum number of requests per second to send to the HTTP invocation endpoint.
   *
   * Default: - Not rate limited
   */
  public fun rateLimitPerSecond(): Number? = unwrap(this).getRateLimitPerSecond()

  /**
   * A builder for [ApiDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiDestinationName The name for the API destination.
     */
    public fun apiDestinationName(apiDestinationName: String)

    /**
     * @param connection The ARN of the connection to use for the API destination. 
     */
    public fun connection(connection: IConnection)

    /**
     * @param description A description for the API destination.
     */
    public fun description(description: String)

    /**
     * @param endpoint The URL to the HTTP invocation endpoint for the API destination.. 
     */
    public fun endpoint(endpoint: String)

    /**
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint.
     */
    public fun httpMethod(httpMethod: HttpMethod)

    /**
     * @param rateLimitPerSecond The maximum number of requests per second to send to the HTTP
     * invocation endpoint.
     */
    public fun rateLimitPerSecond(rateLimitPerSecond: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ApiDestinationProps.Builder =
        software.amazon.awscdk.services.events.ApiDestinationProps.builder()

    /**
     * @param apiDestinationName The name for the API destination.
     */
    override fun apiDestinationName(apiDestinationName: String) {
      cdkBuilder.apiDestinationName(apiDestinationName)
    }

    /**
     * @param connection The ARN of the connection to use for the API destination. 
     */
    override fun connection(connection: IConnection) {
      cdkBuilder.connection(connection.let(IConnection.Companion::unwrap))
    }

    /**
     * @param description A description for the API destination.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param endpoint The URL to the HTTP invocation endpoint for the API destination.. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint.
     */
    override fun httpMethod(httpMethod: HttpMethod) {
      cdkBuilder.httpMethod(httpMethod.let(HttpMethod.Companion::unwrap))
    }

    /**
     * @param rateLimitPerSecond The maximum number of requests per second to send to the HTTP
     * invocation endpoint.
     */
    override fun rateLimitPerSecond(rateLimitPerSecond: Number) {
      cdkBuilder.rateLimitPerSecond(rateLimitPerSecond)
    }

    public fun build(): software.amazon.awscdk.services.events.ApiDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.ApiDestinationProps,
  ) : CdkObject(cdkObject), ApiDestinationProps {
    /**
     * The name for the API destination.
     *
     * Default: - A unique name will be generated
     */
    override fun apiDestinationName(): String? = unwrap(this).getApiDestinationName()

    /**
     * The ARN of the connection to use for the API destination.
     */
    override fun connection(): IConnection = unwrap(this).getConnection().let(IConnection::wrap)

    /**
     * A description for the API destination.
     *
     * Default: - none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The URL to the HTTP invocation endpoint for the API destination..
     */
    override fun endpoint(): String = unwrap(this).getEndpoint()

    /**
     * The method to use for the request to the HTTP invocation endpoint.
     *
     * Default: HttpMethod.POST
     */
    override fun httpMethod(): HttpMethod? = unwrap(this).getHttpMethod()?.let(HttpMethod::wrap)

    /**
     * The maximum number of requests per second to send to the HTTP invocation endpoint.
     *
     * Default: - Not rate limited
     */
    override fun rateLimitPerSecond(): Number? = unwrap(this).getRateLimitPerSecond()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ApiDestinationProps):
        ApiDestinationProps = CdkObjectWrappers.wrap(cdkObject) as? ApiDestinationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDestinationProps):
        software.amazon.awscdk.services.events.ApiDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.ApiDestinationProps
  }
}
