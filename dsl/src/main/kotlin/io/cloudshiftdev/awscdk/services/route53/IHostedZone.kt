package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IHostedZone : IResource {
  public fun grantDelegation(arg0: IGrantable): Grant

  public fun hostedZoneArn(): String

  public fun hostedZoneId(): String

  public fun hostedZoneNameServers(): List<String> = unwrap(this).getHostedZoneNameServers() ?:
      emptyList()

  public fun zoneName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.route53.IHostedZone,
  ) : IHostedZone {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantDelegation(arg0: IGrantable): Grant =
        unwrap(this).grantDelegation(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun hostedZoneArn(): String = unwrap(this).getHostedZoneArn()

    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

    override fun hostedZoneNameServers(): List<String> = unwrap(this).getHostedZoneNameServers() ?:
        emptyList()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IHostedZone): IHostedZone =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHostedZone): software.amazon.awscdk.services.route53.IHostedZone =
        (wrapped as Wrapper).cdkObject
  }
}
