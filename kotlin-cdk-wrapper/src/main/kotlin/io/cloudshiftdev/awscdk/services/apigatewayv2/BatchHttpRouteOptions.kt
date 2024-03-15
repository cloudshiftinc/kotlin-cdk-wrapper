@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface BatchHttpRouteOptions {
  public fun integration(): HttpRouteIntegration

  @CdkDslMarker
  public interface Builder {
    public fun integration(integration: HttpRouteIntegration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions.builder()

    override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions,
  ) : CdkObject(cdkObject), BatchHttpRouteOptions {
    override fun integration(): HttpRouteIntegration =
        unwrap(this).getIntegration().let(HttpRouteIntegration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchHttpRouteOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions):
        BatchHttpRouteOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchHttpRouteOptions):
        software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions
  }
}
