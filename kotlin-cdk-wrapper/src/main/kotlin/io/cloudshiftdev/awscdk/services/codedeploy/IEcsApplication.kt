@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IEcsApplication : IResource {
  public fun applicationArn(): String

  public fun applicationName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.IEcsApplication,
  ) : CdkObject(cdkObject), IEcsApplication {
    override fun applicationArn(): String = unwrap(this).getApplicationArn()

    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsApplication):
        IEcsApplication = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsApplication):
        software.amazon.awscdk.services.codedeploy.IEcsApplication = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IEcsApplication
  }
}
