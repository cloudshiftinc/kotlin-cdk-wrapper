@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IAccessLogDestination {
  public fun bind(arg0: IStage): AccessLogDestinationConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IAccessLogDestination,
  ) : CdkObject(cdkObject), IAccessLogDestination {
    override fun bind(arg0: IStage): AccessLogDestinationConfig =
        unwrap(this).bind(arg0.let(IStage::unwrap)).let(AccessLogDestinationConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IAccessLogDestination):
        IAccessLogDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccessLogDestination):
        software.amazon.awscdk.services.apigateway.IAccessLogDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IAccessLogDestination
  }
}
