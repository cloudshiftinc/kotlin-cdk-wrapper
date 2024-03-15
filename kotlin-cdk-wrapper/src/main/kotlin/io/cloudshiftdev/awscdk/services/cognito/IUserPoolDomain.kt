@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IUserPoolDomain : IResource {
  public fun domainName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.IUserPoolDomain,
  ) : CdkObject(cdkObject), IUserPoolDomain {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPoolDomain):
        IUserPoolDomain = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUserPoolDomain):
        software.amazon.awscdk.services.cognito.IUserPoolDomain = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.IUserPoolDomain
  }
}
