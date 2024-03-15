@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Options used when configuring multiple routes, at once.
 *
 * The options here are the ones that would be configured for all being set up.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpRouteIntegration httpRouteIntegration;
 * BatchHttpRouteOptions batchHttpRouteOptions = BatchHttpRouteOptions.builder()
 * .integration(httpRouteIntegration)
 * .build();
 * ```
 */
public interface BatchHttpRouteOptions {
  /**
   * The integration to be configured on this route.
   */
  public fun integration(): HttpRouteIntegration

  /**
   * A builder for [BatchHttpRouteOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param integration The integration to be configured on this route. 
     */
    public fun integration(integration: HttpRouteIntegration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions.builder()

    /**
     * @param integration The integration to be configured on this route. 
     */
    override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions,
  ) : CdkObject(cdkObject), BatchHttpRouteOptions {
    /**
     * The integration to be configured on this route.
     */
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
