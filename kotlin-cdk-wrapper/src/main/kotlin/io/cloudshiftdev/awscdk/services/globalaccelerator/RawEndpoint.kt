@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Untyped endpoint implementation.
 *
 * Prefer using the classes in the `aws-globalaccelerator-endpoints` package instead,
 * as they accept typed constructs. You can use this class if you want to use an
 * endpoint type that does not have an appropriate class in that package yet.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * RawEndpoint rawEndpoint = RawEndpoint.Builder.create()
 * .endpointId("endpointId")
 * // the properties below are optional
 * .preserveClientIp(false)
 * .region("region")
 * .weight(123)
 * .build();
 * ```
 */
public open class RawEndpoint(
  cdkObject: software.amazon.awscdk.services.globalaccelerator.RawEndpoint,
) : CdkObject(cdkObject), IEndpoint {
  public constructor(props: RawEndpointProps) :
      this(software.amazon.awscdk.services.globalaccelerator.RawEndpoint(props.let(RawEndpointProps.Companion::unwrap))
  )

  public constructor(props: RawEndpointProps.Builder.() -> Unit) : this(RawEndpointProps(props)
  )

  /**
   * The region where the endpoint is located.
   *
   * If the region cannot be determined, `undefined` is returned
   */
  public override fun region(): String? = unwrap(this).getRegion()

  /**
   * Render the endpoint to an endpoint configuration.
   */
  public override fun renderEndpointConfiguration(): Any =
      unwrap(this).renderEndpointConfiguration()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.RawEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Identifier of the endpoint.
     *
     * Load balancer ARN, instance ID or EIP allocation ID.
     *
     * @param endpointId Identifier of the endpoint. 
     */
    public fun endpointId(endpointId: String)

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
     *
     * @param preserveClientIp Forward the client IP address. 
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

    /**
     * The region where this endpoint is located.
     *
     * Default: - Unknown what region this endpoint is located
     *
     * @param region The region where this endpoint is located. 
     */
    public fun region(region: String)

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group. 
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.RawEndpoint.Builder =
        software.amazon.awscdk.services.globalaccelerator.RawEndpoint.Builder.create()

    /**
     * Identifier of the endpoint.
     *
     * Load balancer ARN, instance ID or EIP allocation ID.
     *
     * @param endpointId Identifier of the endpoint. 
     */
    override fun endpointId(endpointId: String) {
      cdkBuilder.endpointId(endpointId)
    }

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
     *
     * @param preserveClientIp Forward the client IP address. 
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * The region where this endpoint is located.
     *
     * Default: - Unknown what region this endpoint is located
     *
     * @param region The region where this endpoint is located. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group. 
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.RawEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RawEndpoint {
      val builderImpl = BuilderImpl()
      return RawEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.RawEndpoint):
        RawEndpoint = RawEndpoint(cdkObject)

    internal fun unwrap(wrapped: RawEndpoint):
        software.amazon.awscdk.services.globalaccelerator.RawEndpoint = wrapped.cdkObject as
        software.amazon.awscdk.services.globalaccelerator.RawEndpoint
  }
}
