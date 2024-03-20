@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.globalaccelerator.IEndpoint
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.ec2.IInstance as CloudshiftdevAwscdkServicesEc2IInstance
import software.amazon.awscdk.services.ec2.IInstance as AmazonAwscdkServicesEc2IInstance

/**
 * Use an EC2 Instance as a Global Accelerator Endpoint.
 *
 * Example:
 *
 * ```
 * Listener listener;
 * Instance instance;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * InstanceEndpoint.Builder.create(instance)
 * .weight(128)
 * .preserveClientIp(true)
 * .build()))
 * .build());
 * ```
 */
public open class InstanceEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint,
) : CdkObject(cdkObject), IEndpoint {
  public constructor(instance: CloudshiftdevAwscdkServicesEc2IInstance) :
      this(software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint(instance.let(CloudshiftdevAwscdkServicesEc2IInstance::unwrap))
  )

  public constructor(instance: CloudshiftdevAwscdkServicesEc2IInstance,
      options: InstanceEndpointProps) :
      this(software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint(instance.let(CloudshiftdevAwscdkServicesEc2IInstance::unwrap),
      options.let(InstanceEndpointProps::unwrap))
  )

  public constructor(instance: CloudshiftdevAwscdkServicesEc2IInstance,
      options: InstanceEndpointProps.Builder.() -> Unit) : this(instance,
      InstanceEndpointProps(options)
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
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Forward the client IP address.
     *
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     *
     * Default: true if available
     *
     * @param preserveClientIp Forward the client IP address. 
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

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

  private class BuilderImpl(
    instance: AmazonAwscdkServicesEc2IInstance,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint.Builder =
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint.Builder.create(instance)

    /**
     * Forward the client IP address.
     *
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     *
     * Default: true if available
     *
     * @param preserveClientIp Forward the client IP address. 
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
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

    public fun build(): software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(instance: CloudshiftdevAwscdkServicesEc2IInstance,
        block: Builder.() -> Unit = {}): InstanceEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesEc2IInstance.unwrap(instance))
      return InstanceEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint):
        InstanceEndpoint = InstanceEndpoint(cdkObject)

    internal fun unwrap(wrapped: InstanceEndpoint):
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint =
        wrapped.cdkObject
  }
}
