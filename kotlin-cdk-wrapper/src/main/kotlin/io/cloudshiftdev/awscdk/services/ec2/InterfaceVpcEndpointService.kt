@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * A custom-hosted service for an interface VPC endpoint.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InterfaceVpcEndpoint.Builder.create(this, "VPC Endpoint")
 * .vpc(vpc)
 * .service(new
 * InterfaceVpcEndpointService("com.amazonaws.vpce.us-east-1.vpce-svc-uuddlrlrbastrtsvc", 443))
 * // Choose which availability zones to place the VPC endpoint in, based on
 * // available AZs
 * .subnets(SubnetSelection.builder()
 * .availabilityZones(List.of("us-east-1a", "us-east-1c"))
 * .build())
 * .build();
 * ```
 */
public open class InterfaceVpcEndpointService(
  cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService,
) : CdkObject(cdkObject), IInterfaceVpcEndpointService {
  public constructor(name: String) :
      this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService(name)
  )

  public constructor(name: String, port: Number) :
      this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService(name, port)
  )

  /**
   * The name of the service.
   */
  public override fun name(): String = unwrap(this).getName()

  /**
   * The port of the service.
   */
  public override fun port(): Number = unwrap(this).getPort()

  /**
   * Whether Private DNS is supported by default.
   */
  public override fun privateDnsDefault(): Boolean? = unwrap(this).getPrivateDnsDefault()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService):
        InterfaceVpcEndpointService = InterfaceVpcEndpointService(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointService):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService
  }
}
