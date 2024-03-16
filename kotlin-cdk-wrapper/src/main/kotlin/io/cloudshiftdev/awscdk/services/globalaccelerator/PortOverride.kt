@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Override specific listener ports used to route traffic to endpoints that are part of an endpoint
 * group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * PortOverride portOverride = PortOverride.builder()
 * .endpointPort(123)
 * .listenerPort(123)
 * .build();
 * ```
 */
public interface PortOverride {
  /**
   * The endpoint port that you want a listener port to be mapped to.
   *
   * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
   */
  public fun endpointPort(): Number

  /**
   * The listener port that you want to map to a specific endpoint port.
   *
   * This is the port that user traffic arrives to the Global Accelerator on.
   */
  public fun listenerPort(): Number

  /**
   * A builder for [PortOverride]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointPort The endpoint port that you want a listener port to be mapped to. 
     * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2
     * instance.
     */
    public fun endpointPort(endpointPort: Number)

    /**
     * @param listenerPort The listener port that you want to map to a specific endpoint port. 
     * This is the port that user traffic arrives to the Global Accelerator on.
     */
    public fun listenerPort(listenerPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.PortOverride.Builder =
        software.amazon.awscdk.services.globalaccelerator.PortOverride.builder()

    /**
     * @param endpointPort The endpoint port that you want a listener port to be mapped to. 
     * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2
     * instance.
     */
    override fun endpointPort(endpointPort: Number) {
      cdkBuilder.endpointPort(endpointPort)
    }

    /**
     * @param listenerPort The listener port that you want to map to a specific endpoint port. 
     * This is the port that user traffic arrives to the Global Accelerator on.
     */
    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.PortOverride =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.PortOverride,
  ) : CdkObject(cdkObject), PortOverride {
    /**
     * The endpoint port that you want a listener port to be mapped to.
     *
     * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2
     * instance.
     */
    override fun endpointPort(): Number = unwrap(this).getEndpointPort()

    /**
     * The listener port that you want to map to a specific endpoint port.
     *
     * This is the port that user traffic arrives to the Global Accelerator on.
     */
    override fun listenerPort(): Number = unwrap(this).getListenerPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.PortOverride):
        PortOverride = CdkObjectWrappers.wrap(cdkObject) as PortOverride

    internal fun unwrap(wrapped: PortOverride):
        software.amazon.awscdk.services.globalaccelerator.PortOverride = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.PortOverride
  }
}
