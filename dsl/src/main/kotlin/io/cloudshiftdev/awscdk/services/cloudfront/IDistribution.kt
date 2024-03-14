package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDistribution : IResource {
  public fun distributionDomainName(): String

  public fun distributionId(): String

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantCreateInvalidation(arg0: IGrantable): Grant

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.IDistribution,
  ) : IDistribution {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun distributionDomainName(): String = unwrap(this).getDistributionDomainName()

    public override fun distributionId(): String = unwrap(this).getDistributionId()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    public override fun grantCreateInvalidation(arg0: IGrantable): Grant =
        unwrap(this).grantCreateInvalidation(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IDistribution):
        IDistribution = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDistribution):
        software.amazon.awscdk.services.cloudfront.IDistribution = (wrapped as Wrapper).cdkObject
  }
}
