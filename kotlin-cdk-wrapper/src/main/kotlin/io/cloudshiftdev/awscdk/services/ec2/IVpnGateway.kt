@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVpnGateway : IResource {
  public fun gatewayId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IVpnGateway,
  ) : CdkObject(cdkObject), IVpnGateway {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun gatewayId(): String = unwrap(this).getGatewayId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpnGateway): IVpnGateway =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpnGateway): software.amazon.awscdk.services.ec2.IVpnGateway =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpnGateway
  }
}
