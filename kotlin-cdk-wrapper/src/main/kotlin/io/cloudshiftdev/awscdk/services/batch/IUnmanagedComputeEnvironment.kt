@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String

public interface IUnmanagedComputeEnvironment : IComputeEnvironment {
  public fun unmanagedvCpUs(): Number? = unwrap(this).getUnmanagedvCPUs()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment,
  ) : CdkObject(cdkObject), IUnmanagedComputeEnvironment {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

    override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

    override fun enabled(): Boolean = unwrap(this).getEnabled()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun unmanagedvCpUs(): Number? = unwrap(this).getUnmanagedvCPUs()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment):
        IUnmanagedComputeEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUnmanagedComputeEnvironment):
        software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment
  }
}
