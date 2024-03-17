@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String

/**
 * An endpoint for the endpoint group.
 *
 * Implementations of `IEndpoint` can be found in the `aws-globalaccelerator-endpoints` package.
 */
public interface IEndpoint {
  /**
   * The region where the endpoint is located.
   *
   * If the region cannot be determined, `undefined` is returned
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Render the endpoint to an endpoint configuration.
   */
  public fun renderEndpointConfiguration(): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpoint,
  ) : CdkObject(cdkObject), IEndpoint {
    /**
     * The region where the endpoint is located.
     *
     * If the region cannot be determined, `undefined` is returned
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Render the endpoint to an endpoint configuration.
     */
    override fun renderEndpointConfiguration(): Any = unwrap(this).renderEndpointConfiguration()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpoint):
        IEndpoint = CdkObjectWrappers.wrap(cdkObject) as? IEndpoint ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEndpoint):
        software.amazon.awscdk.services.globalaccelerator.IEndpoint = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.IEndpoint
  }
}
