@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.globalaccelerator.IEndpoint
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.ec2.CfnEIP as CloudshiftdevAwscdkServicesEc2CfnEIP
import software.amazon.awscdk.services.ec2.CfnEIP as AmazonAwscdkServicesEc2CfnEIP

/**
 * Use an EC2 Instance as a Global Accelerator Endpoint.
 *
 * Example:
 *
 * ```
 * Listener listener;
 * CfnEIP eip;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * CfnEipEndpoint.Builder.create(eip)
 * .weight(128)
 * .build()))
 * .build());
 * ```
 */
public open class CfnEipEndpoint(
  cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint,
) : CdkObject(cdkObject),
    IEndpoint {
  public constructor(eip: CloudshiftdevAwscdkServicesEc2CfnEIP) :
      this(software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint(eip.let(CloudshiftdevAwscdkServicesEc2CfnEIP.Companion::unwrap))
  )

  public constructor(eip: CloudshiftdevAwscdkServicesEc2CfnEIP, options: CfnEipEndpointProps) :
      this(software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint(eip.let(CloudshiftdevAwscdkServicesEc2CfnEIP.Companion::unwrap),
      options.let(CfnEipEndpointProps.Companion::unwrap))
  )

  public constructor(eip: CloudshiftdevAwscdkServicesEc2CfnEIP,
      options: CfnEipEndpointProps.Builder.() -> Unit) : this(eip, CfnEipEndpointProps(options)
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
   * [io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
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
    eip: AmazonAwscdkServicesEc2CfnEIP,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint.Builder =
        software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint.Builder.create(eip)

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

    public fun build(): software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(eip: CloudshiftdevAwscdkServicesEc2CfnEIP, block: Builder.() -> Unit
        = {}): CfnEipEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesEc2CfnEIP.unwrap(eip))
      return CfnEipEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint):
        CfnEipEndpoint = CfnEipEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEipEndpoint):
        software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint =
        wrapped.cdkObject as
        software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint
  }
}
