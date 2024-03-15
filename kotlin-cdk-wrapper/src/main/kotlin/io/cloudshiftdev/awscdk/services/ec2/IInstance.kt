@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IInstance : IResource, IConnectable, IGrantable {
  public fun instanceAvailabilityZone(): String

  public fun instanceId(): String

  public fun instancePrivateDnsName(): String

  public fun instancePrivateIp(): String

  public fun instancePublicDnsName(): String

  public fun instancePublicIp(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IInstance,
  ) : CdkObject(cdkObject), IInstance {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    override fun instanceAvailabilityZone(): String = unwrap(this).getInstanceAvailabilityZone()

    override fun instanceId(): String = unwrap(this).getInstanceId()

    override fun instancePrivateDnsName(): String = unwrap(this).getInstancePrivateDnsName()

    override fun instancePrivateIp(): String = unwrap(this).getInstancePrivateIp()

    override fun instancePublicDnsName(): String = unwrap(this).getInstancePublicDnsName()

    override fun instancePublicIp(): String = unwrap(this).getInstancePublicIp()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IInstance): IInstance =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstance): software.amazon.awscdk.services.ec2.IInstance =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IInstance
  }
}
