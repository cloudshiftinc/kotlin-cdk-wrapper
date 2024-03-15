@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
import kotlin.Deprecated
import kotlin.String

public interface IOriginAccessIdentity : IResource, IGrantable {
  public fun originAccessIdentityId(): String

  @Deprecated(message = "deprecated in CDK")
  public fun originAccessIdentityName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity,
  ) : CdkObject(cdkObject), IOriginAccessIdentity {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun originAccessIdentityId(): String = unwrap(this).getOriginAccessIdentityId()

    @Deprecated(message = "deprecated in CDK")
    override fun originAccessIdentityName(): String = unwrap(this).getOriginAccessIdentityName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity):
        IOriginAccessIdentity = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOriginAccessIdentity):
        software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity
  }
}
