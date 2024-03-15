@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IConfigurationSet : IResource {
  public fun configurationSetName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.IConfigurationSet,
  ) : CdkObject(cdkObject), IConfigurationSet {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IConfigurationSet):
        IConfigurationSet = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConfigurationSet):
        software.amazon.awscdk.services.ses.IConfigurationSet = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IConfigurationSet
  }
}
