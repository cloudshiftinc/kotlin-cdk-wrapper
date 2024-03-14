package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IPublicHostedZone : IHostedZone {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.route53.IPublicHostedZone,
  ) : IPublicHostedZone {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantDelegation(arg0: IGrantable): Grant =
        unwrap(this).grantDelegation(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun hostedZoneArn(): String = unwrap(this).getHostedZoneArn()

    public override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

    public override fun hostedZoneNameServers(): List<String> =
        unwrap(this).getHostedZoneNameServers() ?: emptyList()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IPublicHostedZone):
        IPublicHostedZone = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPublicHostedZone):
        software.amazon.awscdk.services.route53.IPublicHostedZone = (wrapped as Wrapper).cdkObject
  }
}
