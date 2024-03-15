@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ApiDestinationProps {
  public fun apiDestinationName(): String? = unwrap(this).getApiDestinationName()

  public fun connection(): IConnection

  public fun description(): String? = unwrap(this).getDescription()

  public fun endpoint(): String

  public fun httpMethod(): HttpMethod? = unwrap(this).getHttpMethod()?.let(HttpMethod::wrap)

  public fun rateLimitPerSecond(): Number? = unwrap(this).getRateLimitPerSecond()

  @CdkDslMarker
  public interface Builder {
    public fun apiDestinationName(apiDestinationName: String)

    public fun connection(connection: IConnection)

    public fun description(description: String)

    public fun endpoint(endpoint: String)

    public fun httpMethod(httpMethod: HttpMethod)

    public fun rateLimitPerSecond(rateLimitPerSecond: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ApiDestinationProps.Builder =
        software.amazon.awscdk.services.events.ApiDestinationProps.builder()

    override fun apiDestinationName(apiDestinationName: String) {
      cdkBuilder.apiDestinationName(apiDestinationName)
    }

    override fun connection(connection: IConnection) {
      cdkBuilder.connection(connection.let(IConnection::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    override fun httpMethod(httpMethod: HttpMethod) {
      cdkBuilder.httpMethod(httpMethod.let(HttpMethod::unwrap))
    }

    override fun rateLimitPerSecond(rateLimitPerSecond: Number) {
      cdkBuilder.rateLimitPerSecond(rateLimitPerSecond)
    }

    public fun build(): software.amazon.awscdk.services.events.ApiDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.ApiDestinationProps,
  ) : CdkObject(cdkObject), ApiDestinationProps {
    override fun apiDestinationName(): String? = unwrap(this).getApiDestinationName()

    override fun connection(): IConnection = unwrap(this).getConnection().let(IConnection::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun endpoint(): String = unwrap(this).getEndpoint()

    override fun httpMethod(): HttpMethod? = unwrap(this).getHttpMethod()?.let(HttpMethod::wrap)

    override fun rateLimitPerSecond(): Number? = unwrap(this).getRateLimitPerSecond()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ApiDestinationProps):
        ApiDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDestinationProps):
        software.amazon.awscdk.services.events.ApiDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.ApiDestinationProps
  }
}
