package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.PortOverride,
  ) : PortOverride {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PortOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.PortOverride):
        PortOverride = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortOverride):
        software.amazon.awscdk.services.globalaccelerator.PortOverride = (wrapped as
        Wrapper).cdkObject
  }
}
