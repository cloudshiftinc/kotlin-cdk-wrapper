@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ISamlProvider : IResource {
  public fun samlProviderArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.ISamlProvider,
  ) : CdkObject(cdkObject), ISamlProvider {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun samlProviderArn(): String = unwrap(this).getSamlProviderArn()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ISamlProvider): ISamlProvider =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISamlProvider): software.amazon.awscdk.services.iam.ISamlProvider =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.ISamlProvider
  }
}
