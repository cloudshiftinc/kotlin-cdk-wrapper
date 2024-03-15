@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ConnectionProps {
  public fun authorization(): Authorization

  public fun bodyParameters(): Map<String, HttpParameter> =
      unwrap(this).getBodyParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  public fun connectionName(): String? = unwrap(this).getConnectionName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun headerParameters(): Map<String, HttpParameter> =
      unwrap(this).getHeaderParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  public fun queryStringParameters(): Map<String, HttpParameter> =
      unwrap(this).getQueryStringParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun authorization(authorization: Authorization)

    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>)

    public fun connectionName(connectionName: String)

    public fun description(description: String)

    public fun headerParameters(headerParameters: Map<String, HttpParameter>)

    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ConnectionProps.Builder =
        software.amazon.awscdk.services.events.ConnectionProps.builder()

    override fun authorization(authorization: Authorization) {
      cdkBuilder.authorization(authorization.let(Authorization::unwrap))
    }

    override fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
      cdkBuilder.bodyParameters(bodyParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun headerParameters(headerParameters: Map<String, HttpParameter>) {
      cdkBuilder.headerParameters(headerParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    override fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
      cdkBuilder.queryStringParameters(queryStringParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.events.ConnectionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.ConnectionProps,
  ) : CdkObject(cdkObject), ConnectionProps {
    override fun authorization(): Authorization =
        unwrap(this).getAuthorization().let(Authorization::wrap)

    override fun bodyParameters(): Map<String, HttpParameter> =
        unwrap(this).getBodyParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

    override fun connectionName(): String? = unwrap(this).getConnectionName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun headerParameters(): Map<String, HttpParameter> =
        unwrap(this).getHeaderParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

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
        ConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionProps):
        software.amazon.awscdk.services.events.ConnectionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.ConnectionProps
  }
}
