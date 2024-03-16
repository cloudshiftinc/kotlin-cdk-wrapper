@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * A service for an interface VPC endpoint.
 */
public interface IInterfaceVpcEndpointService {
  /**
   * The name of the service.
   */
  public fun name(): String

  /**
   * The port of the service.
   */
  public fun port(): Number

  /**
   * Whether Private DNS is supported by default.
   */
  public fun privateDnsDefault(): Boolean? = unwrap(this).getPrivateDnsDefault()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService):
        IInterfaceVpcEndpointService = CdkObjectWrappers.wrap(cdkObject) as
        IInterfaceVpcEndpointService

    internal fun unwrap(wrapped: IInterfaceVpcEndpointService):
        software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService
  }
}
