package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface RawEndpointProps {
  /**
   * Identifier of the endpoint.
   *
   * Load balancer ARN, instance ID or EIP allocation ID.
   */
  public fun endpointId(): String

  /**
   * Forward the client IP address.
   *
   * GlobalAccelerator will create Network Interfaces in your VPC in order
   * to preserve the client IP address.
   *
   * Only applies to Application Load Balancers and EC2 instances.
   *
   * Client IP address preservation is supported only in specific AWS Regions.
   * See the GlobalAccelerator Developer Guide for a list.
   *
   * Default: true if possible and available
   */
  public fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

  /**
   * The region where this endpoint is located.
   *
   * Default: - Unknown what region this endpoint is located
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Endpoint weight across all endpoints in the group.
   *
   * Must be a value between 0 and 255.
   *
   * Default: 128
   */
  public fun weight(): Number? = unwrap(this).getWeight()

  /**
   * A builder for [RawEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointId Identifier of the endpoint. 
     * Load balancer ARN, instance ID or EIP allocation ID.
     */
    public fun endpointId(endpointId: String)

    /**
     * @param preserveClientIp Forward the client IP address.
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Only applies to Application Load Balancers and EC2 instances.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

    /**
     * @param region The region where this endpoint is located.
     */
    public fun region(region: String)

    /**
     * @param weight Endpoint weight across all endpoints in the group.
     * Must be a value between 0 and 255.
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.RawEndpointProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.RawEndpointProps.builder()

    /**
     * @param endpointId Identifier of the endpoint. 
     * Load balancer ARN, instance ID or EIP allocation ID.
     */
    override fun endpointId(endpointId: String) {
      cdkBuilder.endpointId(endpointId)
    }

    /**
     * @param preserveClientIp Forward the client IP address.
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Only applies to Application Load Balancers and EC2 instances.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * @param region The region where this endpoint is located.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param weight Endpoint weight across all endpoints in the group.
     * Must be a value between 0 and 255.
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.RawEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.RawEndpointProps,
  ) : CdkObject(cdkObject), RawEndpointProps {
    /**
     * Identifier of the endpoint.
     *
     * Load balancer ARN, instance ID or EIP allocation ID.
     */
    override fun endpointId(): String = unwrap(this).getEndpointId()

    /**
     * Forward the client IP address.
     *
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Only applies to Application Load Balancers and EC2 instances.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     *
     * Default: true if possible and available
     */
    override fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

    /**
     * The region where this endpoint is located.
     *
     * Default: - Unknown what region this endpoint is located
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     */
    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RawEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.RawEndpointProps):
        RawEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RawEndpointProps):
        software.amazon.awscdk.services.globalaccelerator.RawEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.RawEndpointProps
  }
}
