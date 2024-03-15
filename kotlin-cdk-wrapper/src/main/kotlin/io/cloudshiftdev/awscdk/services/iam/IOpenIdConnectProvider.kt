@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IOpenIdConnectProvider : IResource {
  public fun openIdConnectProviderArn(): String

  public fun openIdConnectProviderIssuer(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.IOpenIdConnectProvider,
  ) : CdkObject(cdkObject), IOpenIdConnectProvider {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun openIdConnectProviderArn(): String = unwrap(this).getOpenIdConnectProviderArn()

    override fun openIdConnectProviderIssuer(): String =
        unwrap(this).getOpenIdConnectProviderIssuer()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IOpenIdConnectProvider):
        IOpenIdConnectProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOpenIdConnectProvider):
        software.amazon.awscdk.services.iam.IOpenIdConnectProvider = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.IOpenIdConnectProvider
  }
}
