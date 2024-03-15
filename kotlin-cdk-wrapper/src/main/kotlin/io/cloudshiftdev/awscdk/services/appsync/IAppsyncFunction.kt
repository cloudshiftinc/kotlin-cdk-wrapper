@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IAppsyncFunction : IResource {
  public fun functionArn(): String

  public fun functionId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.IAppsyncFunction,
  ) : CdkObject(cdkObject), IAppsyncFunction {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun functionId(): String = unwrap(this).getFunctionId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.IAppsyncFunction):
        IAppsyncFunction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAppsyncFunction):
        software.amazon.awscdk.services.appsync.IAppsyncFunction = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.IAppsyncFunction
  }
}
