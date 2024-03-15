@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String

public interface IEndpoint {
  public fun region(): String? = unwrap(this).getRegion()

  public fun renderEndpointConfiguration(): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpoint,
  ) : CdkObject(cdkObject), IEndpoint {
    override fun region(): String? = unwrap(this).getRegion()

    override fun renderEndpointConfiguration(): Any = unwrap(this).renderEndpointConfiguration()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpoint):
        IEndpoint = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEndpoint):
        software.amazon.awscdk.services.globalaccelerator.IEndpoint = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.IEndpoint
  }
}
