@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IUserPoolIdentityProvider : IResource {
  public fun providerName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.IUserPoolIdentityProvider,
  ) : CdkObject(cdkObject), IUserPoolIdentityProvider {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun providerName(): String = unwrap(this).getProviderName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPoolIdentityProvider):
        IUserPoolIdentityProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUserPoolIdentityProvider):
        software.amazon.awscdk.services.cognito.IUserPoolIdentityProvider = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.IUserPoolIdentityProvider
  }
}
