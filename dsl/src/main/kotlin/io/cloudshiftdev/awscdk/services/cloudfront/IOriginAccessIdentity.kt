package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
import kotlin.Deprecated
import kotlin.String

public interface IOriginAccessIdentity : IResource, IGrantable {
  public fun originAccessIdentityId(): String

  @Deprecated(message = "deprecated in CDK")
  public fun originAccessIdentityName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity,
  ) : IOriginAccessIdentity {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun originAccessIdentityId(): String = unwrap(this).getOriginAccessIdentityId()

    @Deprecated(message = "deprecated in CDK")
    public override fun originAccessIdentityName(): String =
        unwrap(this).getOriginAccessIdentityName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity):
        IOriginAccessIdentity = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOriginAccessIdentity):
        software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity = (wrapped as
        Wrapper).cdkObject
  }
}
