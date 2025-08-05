@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Access log destination for a HttpApi Stage.
 */
public interface IAccessLogDestination {
  /**
   * Binds this destination to the HttpApi Stage.
   *
   * @param stage 
   */
  public fun bind(stage: IStage): AccessLogDestinationConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.IAccessLogDestination,
  ) : CdkObject(cdkObject),
      IAccessLogDestination {
    /**
     * Binds this destination to the HttpApi Stage.
     *
     * @param stage 
     */
    override fun bind(stage: IStage): AccessLogDestinationConfig =
        unwrap(this).bind(stage.let(IStage.Companion::unwrap)).let(AccessLogDestinationConfig::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IAccessLogDestination):
        IAccessLogDestination = CdkObjectWrappers.wrap(cdkObject) as? IAccessLogDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccessLogDestination):
        software.amazon.awscdk.services.apigatewayv2.IAccessLogDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IAccessLogDestination
  }
}
