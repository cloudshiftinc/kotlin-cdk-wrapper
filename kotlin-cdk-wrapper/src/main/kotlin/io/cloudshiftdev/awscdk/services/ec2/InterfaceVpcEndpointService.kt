@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String

public open class InterfaceVpcEndpointService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService,
) : CdkObject(cdkObject), IInterfaceVpcEndpointService {
  public override fun name(): String = unwrap(this).getName()

  public override fun port(): Number = unwrap(this).getPort()

  public override fun privateDnsDefault(): Boolean? = unwrap(this).getPrivateDnsDefault()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService):
        InterfaceVpcEndpointService = InterfaceVpcEndpointService(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointService):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointService = wrapped.cdkObject
  }
}
