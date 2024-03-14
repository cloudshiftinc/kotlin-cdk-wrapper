package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApiDestination internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.ApiDestination,
) : Resource(cdkObject), IApiDestination {
  public override fun apiDestinationArn(): String = unwrap(this).getApiDestinationArn()

  public override fun apiDestinationName(): String = unwrap(this).getApiDestinationName()

  public open fun connection(): IConnection = unwrap(this).getConnection().let(IConnection::wrap)

  public interface Builder {
    public fun apiDestinationName(apiDestinationName: String) {
    }

    public fun connection(connection: IConnection) {
    }

    public fun description(description: String) {
    }

    public fun endpoint(endpoint: String) {
    }

    public fun httpMethod(httpMethod: HttpMethod) {
    }

    public fun rateLimitPerSecond(rateLimitPerSecond: Number) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ApiDestination.Builder =
        software.amazon.awscdk.services.events.ApiDestination.Builder.create(scope, id)

    public override fun apiDestinationName(apiDestinationName: String) {
      cdkBuilder.apiDestinationName(apiDestinationName)
    }

    public override fun connection(connection: IConnection) {
      cdkBuilder.connection(connection.let(IConnection::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    public override fun httpMethod(httpMethod: HttpMethod) {
      cdkBuilder.httpMethod(httpMethod.let(HttpMethod::unwrap))
    }

    public override fun rateLimitPerSecond(rateLimitPerSecond: Number) {
      cdkBuilder.rateLimitPerSecond(rateLimitPerSecond)
    }

    public fun build(): software.amazon.awscdk.services.events.ApiDestination = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.events.ApiDestination = wrapped.cdkObject
  }
}
