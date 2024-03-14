package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Connection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.Connection,
) : Resource(cdkObject), IConnection {
  public override fun connectionArn(): String = unwrap(this).getConnectionArn()

  public override fun connectionName(): String = unwrap(this).getConnectionName()

  public override fun connectionSecretArn(): String = unwrap(this).getConnectionSecretArn()

  public interface Builder {
    public fun authorization(authorization: Authorization) {
    }

    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
    }

    public fun connectionName(connectionName: String) {
    }

    public fun description(description: String) {
    }

    public fun headerParameters(headerParameters: Map<String, HttpParameter>) {
    }

    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.Connection.Builder =
        software.amazon.awscdk.services.events.Connection.Builder.create(scope, id)

    public override fun authorization(authorization: Authorization) {
      cdkBuilder.authorization(authorization.let(Authorization::unwrap))
    }

    public override fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
      cdkBuilder.bodyParameters(bodyParameters.mapValues { HttpParameter.unwrap(it.value)})
    }

    public override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun headerParameters(headerParameters: Map<String, HttpParameter>) {
      cdkBuilder.headerParameters(headerParameters.mapValues { HttpParameter.unwrap(it.value)})
    }

    public override fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
      cdkBuilder.queryStringParameters(queryStringParameters.mapValues {
          HttpParameter.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.events.Connection = cdkBuilder.build()
  }

  public companion object {
    public open fun fromConnectionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ConnectionAttributes,
    ): IConnection =
        software.amazon.awscdk.services.events.Connection.fromConnectionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ConnectionAttributes::unwrap)).let(IConnection::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f720ca07b7b29643172a6bb242b98f4a00be144d44284f8fa5b19b4a62c17a3c")
    public open fun fromConnectionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ConnectionAttributes.Builder.() -> Unit,
    ): IConnection = fromConnectionAttributes(scope, id, ConnectionAttributes(attrs))

    public open fun fromEventBusArn(
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
        wrapped.cdkObject
  }
}
