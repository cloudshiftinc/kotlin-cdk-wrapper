@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * An API Destination Connection.
 *
 * A connection defines the authorization type and credentials to use for authorization with an API
 * destination HTTP endpoint.
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
public interface ConnectionProps {
  /**
   * The authorization type for the connection.
   */
  public fun authorization(): Authorization

  /**
   * Additional string parameters to add to the invocation bodies.
   *
   * Default: - No additional parameters
   */
  public fun bodyParameters(): Map<String, HttpParameter> =
      unwrap(this).getBodyParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  /**
   * The name of the connection.
   *
   * Default: - A name is automatically generated
   */
  public fun connectionName(): String? = unwrap(this).getConnectionName()

  /**
   * The name of the connection.
   *
   * Default: - none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Additional string parameters to add to the invocation headers.
   *
   * Default: - No additional parameters
   */
  public fun headerParameters(): Map<String, HttpParameter> =
      unwrap(this).getHeaderParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  /**
   * Additional string parameters to add to the invocation query strings.
   *
   * Default: - No additional parameters
   */
  public fun queryStringParameters(): Map<String, HttpParameter> =
      unwrap(this).getQueryStringParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  /**
   * A builder for [ConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorization The authorization type for the connection. 
     */
    public fun authorization(authorization: Authorization)

    /**
     * @param bodyParameters Additional string parameters to add to the invocation bodies.
     */
    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>)

    /**
     * @param connectionName The name of the connection.
     */
    public fun connectionName(connectionName: String)

    /**
     * @param description The name of the connection.
     */
    public fun description(description: String)

    /**
     * @param headerParameters Additional string parameters to add to the invocation headers.
     */
    public fun headerParameters(headerParameters: Map<String, HttpParameter>)

    /**
     * @param queryStringParameters Additional string parameters to add to the invocation query
     * strings.
     */
    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ConnectionProps.Builder =
        software.amazon.awscdk.services.events.ConnectionProps.builder()

    /**
     * @param authorization The authorization type for the connection. 
     */
    override fun authorization(authorization: Authorization) {
      cdkBuilder.authorization(authorization.let(Authorization.Companion::unwrap))
    }

    /**
     * @param bodyParameters Additional string parameters to add to the invocation bodies.
     */
    override fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
      cdkBuilder.bodyParameters(bodyParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    /**
     * @param connectionName The name of the connection.
     */
    override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    /**
     * @param description The name of the connection.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param headerParameters Additional string parameters to add to the invocation headers.
     */
    override fun headerParameters(headerParameters: Map<String, HttpParameter>) {
      cdkBuilder.headerParameters(headerParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    /**
     * @param queryStringParameters Additional string parameters to add to the invocation query
     * strings.
     */
    override fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
      cdkBuilder.queryStringParameters(queryStringParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.events.ConnectionProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.ConnectionProps,
  ) : CdkObject(cdkObject),
      ConnectionProps {
    /**
     * The authorization type for the connection.
     */
    override fun authorization(): Authorization =
        unwrap(this).getAuthorization().let(Authorization::wrap)

    /**
     * Additional string parameters to add to the invocation bodies.
     *
     * Default: - No additional parameters
     */
    override fun bodyParameters(): Map<String, HttpParameter> =
        unwrap(this).getBodyParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

    /**
     * The name of the connection.
     *
     * Default: - A name is automatically generated
     */
    override fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * The name of the connection.
     *
     * Default: - none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Additional string parameters to add to the invocation headers.
     *
     * Default: - No additional parameters
     */
    override fun headerParameters(): Map<String, HttpParameter> =
        unwrap(this).getHeaderParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

    /**
     * Additional string parameters to add to the invocation query strings.
     *
     * Default: - No additional parameters
     */
    override fun queryStringParameters(): Map<String, HttpParameter> =
        unwrap(this).getQueryStringParameters()?.mapValues{HttpParameter.wrap(it.value)} ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ConnectionProps):
        ConnectionProps = CdkObjectWrappers.wrap(cdkObject) as? ConnectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionProps):
        software.amazon.awscdk.services.events.ConnectionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.ConnectionProps
  }
}
