@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IServerApplication : IResource {
  public fun applicationArn(): String

  public fun applicationName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.IServerApplication,
  ) : CdkObject(cdkObject), IServerApplication {
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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerApplication):
        IServerApplication = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IServerApplication):
        software.amazon.awscdk.services.codedeploy.IServerApplication = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IServerApplication
  }
}
