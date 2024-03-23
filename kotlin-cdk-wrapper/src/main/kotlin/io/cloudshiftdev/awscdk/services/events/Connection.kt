@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define an EventBridge Connection.
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
public open class Connection(
  cdkObject: software.amazon.awscdk.services.events.Connection,
) : Resource(cdkObject), IConnection {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ConnectionProps,
  ) :
      this(software.amazon.awscdk.services.events.Connection(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ConnectionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, ConnectionProps(props)
  )

  /**
   * The ARN of the connection created.
   */
  public override fun connectionArn(): String = unwrap(this).getConnectionArn()

  /**
   * The Name for the connection.
   */
  public override fun connectionName(): String = unwrap(this).getConnectionName()

  /**
   * The ARN for the secret created for the connection.
   */
  public override fun connectionSecretArn(): String = unwrap(this).getConnectionSecretArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.Connection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The authorization type for the connection.
     *
     * @param authorization The authorization type for the connection. 
     */
    public fun authorization(authorization: Authorization)

    /**
     * Additional string parameters to add to the invocation bodies.
     *
     * Default: - No additional parameters
     *
     * @param bodyParameters Additional string parameters to add to the invocation bodies. 
     */
    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>)

    /**
     * The name of the connection.
     *
     * Default: - A name is automatically generated
     *
     * @param connectionName The name of the connection. 
     */
    public fun connectionName(connectionName: String)

    /**
     * The name of the connection.
     *
     * Default: - none
     *
     * @param description The name of the connection. 
     */
    public fun description(description: String)

    /**
     * Additional string parameters to add to the invocation headers.
     *
     * Default: - No additional parameters
     *
     * @param headerParameters Additional string parameters to add to the invocation headers. 
     */
    public fun headerParameters(headerParameters: Map<String, HttpParameter>)

    /**
     * Additional string parameters to add to the invocation query strings.
     *
     * Default: - No additional parameters
     *
     * @param queryStringParameters Additional string parameters to add to the invocation query
     * strings. 
     */
    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.Connection.Builder =
        software.amazon.awscdk.services.events.Connection.Builder.create(scope, id)

    /**
     * The authorization type for the connection.
     *
     * @param authorization The authorization type for the connection. 
     */
    override fun authorization(authorization: Authorization) {
      cdkBuilder.authorization(authorization.let(Authorization::unwrap))
    }

    /**
     * Additional string parameters to add to the invocation bodies.
     *
     * Default: - No additional parameters
     *
     * @param bodyParameters Additional string parameters to add to the invocation bodies. 
     */
    override fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
      cdkBuilder.bodyParameters(bodyParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    /**
     * The name of the connection.
     *
     * Default: - A name is automatically generated
     *
     * @param connectionName The name of the connection. 
     */
    override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    /**
     * The name of the connection.
     *
     * Default: - none
     *
     * @param description The name of the connection. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Additional string parameters to add to the invocation headers.
     *
     * Default: - No additional parameters
     *
     * @param headerParameters Additional string parameters to add to the invocation headers. 
     */
    override fun headerParameters(headerParameters: Map<String, HttpParameter>) {
      cdkBuilder.headerParameters(headerParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    /**
     * Additional string parameters to add to the invocation query strings.
     *
     * Default: - No additional parameters
     *
     * @param queryStringParameters Additional string parameters to add to the invocation query
     * strings. 
     */
    override fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
      cdkBuilder.queryStringParameters(queryStringParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.events.Connection = cdkBuilder.build()
  }

  public companion object {
    public fun fromConnectionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ConnectionAttributes,
    ): IConnection =
        software.amazon.awscdk.services.events.Connection.fromConnectionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ConnectionAttributes::unwrap)).let(IConnection::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f720ca07b7b29643172a6bb242b98f4a00be144d44284f8fa5b19b4a62c17a3c")
    public fun fromConnectionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ConnectionAttributes.Builder.() -> Unit,
    ): IConnection = fromConnectionAttributes(scope, id, ConnectionAttributes(attrs))

    public fun fromEventBusArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      connectionArn: String,
      connectionSecretArn: String,
    ): IConnection =
        software.amazon.awscdk.services.events.Connection.fromEventBusArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, connectionArn, connectionSecretArn).let(IConnection::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Connection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Connection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Connection): Connection =
        Connection(cdkObject)

    internal fun unwrap(wrapped: Connection): software.amazon.awscdk.services.events.Connection =
        wrapped.cdkObject as software.amazon.awscdk.services.events.Connection
  }
}
