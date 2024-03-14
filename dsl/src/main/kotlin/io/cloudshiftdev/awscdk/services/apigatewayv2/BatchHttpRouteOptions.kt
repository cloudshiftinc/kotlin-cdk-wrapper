package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.Unit

public interface BatchHttpRouteOptions {
  public fun integration(): HttpRouteIntegration

  public interface Builder {
    public fun integration(integration: HttpRouteIntegration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions.builder()

    public override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions,
  ) : BatchHttpRouteOptions {
    public override fun integration(): HttpRouteIntegration =
        unwrap(this).getIntegration().let(HttpRouteIntegration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BatchHttpRouteOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions):
        BatchHttpRouteOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchHttpRouteOptions):
        software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions = (wrapped as
        Wrapper).cdkObject
  }
}
