@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ISigningProfile : IResource {
  public fun signingProfileArn(): String

  public fun signingProfileName(): String

  public fun signingProfileVersion(): String

  public fun signingProfileVersionArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.signer.ISigningProfile,
  ) : CdkObject(cdkObject), ISigningProfile {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun signingProfileArn(): String = unwrap(this).getSigningProfileArn()

    override fun signingProfileName(): String = unwrap(this).getSigningProfileName()

    override fun signingProfileVersion(): String = unwrap(this).getSigningProfileVersion()

    override fun signingProfileVersionArn(): String = unwrap(this).getSigningProfileVersionArn()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.ISigningProfile):
        ISigningProfile = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISigningProfile):
        software.amazon.awscdk.services.signer.ISigningProfile = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.signer.ISigningProfile
  }
}
